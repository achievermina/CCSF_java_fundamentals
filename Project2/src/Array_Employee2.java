import java.util.Scanner;

public class Array_Employee2 {

    private int Eno;
    private String Ename, day;
    private double working_hour, Rate, Gross_Salary = 0, salary1, salary2, salary3;

    double[] Hours = new double[7];
    double[] Salary = new double[7];

    //constructor1
    public Array_Employee2() {
        Eno = 0;
        Ename = " ";
        Rate = 0;
        Gross_Salary = 0;
    }

    // Input + calling calculate()
    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("New Employee Input Start");
        System.out.println("Enter the Employee number");
        Eno = input.nextInt();
        System.out.println("Enter the Employee name");
        Ename = input.next();
        System.out.println("Enter the Salary Rate");
        Rate = input.nextDouble();

        for (int i = 0; i < 7; i++) {
            String isDay = whichDay(i);

            do {
                System.out.println("Enter the working hours of " + isDay);
                Hours[i] = input.nextDouble();

                if (Hours[i] < 0 | Hours[i] > 24) {
                    System.out.println("Please type the correct hour");
                }

            } while (Hours[i] < 0 | Hours[i] > 24);
            }
        Calculate();
        Display();
        }





    //calculate Gross_salary
    public void Calculate() {
        //weekdays
        for (int i = 0; i < 5; i++) {
            working_hour = Hours[i];
            if (working_hour > 12) {
                salary1 = 8 * Rate;
                salary2 = 4 * Rate * 1.5;
                salary3 = (working_hour - 12) * Rate * 2;
                Salary[i] = salary1 + salary2 + salary3;

            } else if (working_hour > 8) {
                salary1 = 8 * Rate;
                salary2 = (working_hour - 8) * Rate * 1.5;
                Salary[i] = salary1 + salary2;
            } else if (working_hour >= 0) {
                salary1 = working_hour * Rate;
                Salary[i] = salary1;
            }
        }

        //weekend
        for (int i = 5; i < 7; i++) {
            working_hour = Hours[i];
            Salary[i] = working_hour * Rate * 2;
        }


        //Gross_Salary Calculation
        for (int i = 0; i < 7; i++) {
            Gross_Salary += Salary[i];
        }
    }


    public void Display() {
        System.out.println("The Employee number is " + Eno);
        System.out.println("The Employee name is " + Ename);
        System.out.println("The Employee's hourly rate is " + Rate);
        System.out.println("This Salary of this week is " + Gross_Salary);
    }


    public String whichDay(int i){
        switch(i){
            case 0:
                day = "Monday";
                break;
            case 1:
                day = "Tuesday";
                break;
            case 2:
                day = "Wednesday";
                break;
            case 3:
                day = "Thursday";
                break;
            case 4:
                day = "Friday";
                break;
            case 5:
                day = "Saturday";
                break;
            case 6:
                day = "Sunday";
                break;
        }
        return day;

    }
}


