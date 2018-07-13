package Assignment3;

import javax.swing.*;

public class timeDifference {


    public static void main(String[] args) {
        String firsttime= JOptionPane.showInputDialog("write the first time with the format of HH:MM:SS AM or PM");
        String secondtime= JOptionPane.showInputDialog("write the second time with the format of HH:MM:SS AM or PM");

        //Split the firsttime
        String[] splitFirsttimeDay = firsttime.split(" ");
        String[] splitFirsttime = splitFirsttimeDay[0].split(":");

        //Get each value of the time
        String firstDay = get(splitFirsttimeDay,1);
        int firstHour = Integer.parseInt(get(splitFirsttime, 0));
        int firstMin = Integer.parseInt(get(splitFirsttime, 1));
        int firstSec = Integer.parseInt(get(splitFirsttime, 2));

        //Split the secondtime
        String[] splitSecondtimeDay = secondtime.split(" ");
        String[] splitSecondtime = splitSecondtimeDay[0].split(":");

        //Get each value of the time
        String secondDay = get(splitSecondtimeDay,1);
        int secondHour = Integer.parseInt(get(splitSecondtime, 0));
        int secondMin = Integer.parseInt(get(splitSecondtime, 1));
        int secondSec = Integer.parseInt(get(splitSecondtime, 2));


        //AM/PM
        if(firstDay.equalsIgnoreCase("PM") && firstHour!= 12){
            firstHour +=12;
        }

        if(secondDay.equalsIgnoreCase("PM") && secondHour!= 12){
            secondHour +=12;
        }

        int diffHour, diffMin, diffSec;

        //time difference
        if(firstHour > secondHour)
        {
            diffHour = firstHour - secondHour;
            diffMin = firstMin - secondMin;
            diffSec = firstSec - secondSec;
        }
        else
        {
            diffHour = secondHour - firstHour;
            diffMin = secondMin - firstMin;
            diffSec = secondSec - firstSec;
        }

        if(diffSec < 0)
        {
            diffSec += 60;
            diffMin--;
        }

        if(diffMin < 0)
        {
            diffMin += 60;
            diffHour--;
        }


        JOptionPane.showMessageDialog(null,
                "Elapsed time: " + diffHour + " hours, " + diffMin + " minutes, and " + diffSec + " seconds");
        System.exit(0);

    }



    public static String get(String[] r, int i)
    {
        return r[i];
    }

}

//String[] splitFirsttime = firsttime.split(":"); //splitFirsttime = [0]=12 [1]=34 [2]=56 pm
//String[] splitFirsttimeDay = splitFirsttime[2].split(" "); //splitFirsttimeDay [0] = 56 [1] = pm



