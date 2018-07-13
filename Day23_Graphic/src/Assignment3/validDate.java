package Assignment3;

import javax.swing.*;

public class validDate {

    public static void main(String[] args) {

        Boolean valid = true;

        //Get input
        String inputDate = JOptionPane.showInputDialog("Please write the Date the format mm/dd/yyyy");

        //Split the Date
        String[] splitDate = inputDate.split("/");

        //Get each value of the Date
        int month = Integer.parseInt(get(splitDate, 0));
        int day = Integer.parseInt(get(splitDate, 1));
        int year = Integer.parseInt(get(splitDate, 2));

        //check Month
        if(month<1 || month>12 ) {
            JOptionPane.showMessageDialog(null,
                    "Invalid date: " + "Month is invalid");
            valid = false;
        }else{
            //check Day
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 31 || day<1) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid date: " + "Day is invalid");
                        valid = false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 30 || day<1) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid date: " + "Day is invalid");
                        valid = false;
                    }
                    break;
                case 2:
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                        if (day > 29 || day<1) {
                            JOptionPane.showMessageDialog(null,
                                    "Invalid date: " + "Day is invalid");
                            valid = false;}
                        } else if (day > 28 || day<1) {
                            JOptionPane.showMessageDialog(null,
                                    "Invalid date: " + "Day is invalid");
                            valid = false;
                        }
                    break;
            }


        }

        if(valid)
            JOptionPane.showMessageDialog(null,
                    "Date "+ inputDate + " is valid!");

        System.exit(0);



    }

    public static String get(String[] r, int i)
    {
        return r[i];
    }

}
