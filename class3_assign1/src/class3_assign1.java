/*
1. Write a Java program to take the input for number of miles,
and the class of  journey (1,2, or 3, for first, second, and third class respectively), for a train journey.
The program should then calculate and display the fare of journey based on the following criteria:
 */


import java.util.Scanner;

public class class3_assign1 {

    public static void main(String[] args)
    {
        int train_class;
        double miles, fare_per_mile1, fare_per_mile2, fare_per_mile3, fare;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the class of the train");
        train_class = input.nextInt();
        System.out.println("Enter the miles");
        miles = input.nextInt();


        switch(train_class){
            case 1: System.out.println("first class");
                fare_per_mile1 = 3;
                fare_per_mile2 = 2.5;
                fare_per_mile3 = 2;


                if(miles>250)
                    fare = (100 * fare_per_mile1) + (150 * fare_per_mile2) + ((miles-250)* fare_per_mile3);
                else if(miles>100)
                    fare = (100 * fare_per_mile1) + ((miles-100)* fare_per_mile2);
                else if(miles>0)
                    fare = miles * fare_per_mile1;
                else {
                    fare = 0;
                    System.out.println("Unable to calculate the fare");
                }
                System.out.println(fare+"dollars");

                break;
            case 2: System.out.println("second class");
                fare_per_mile1 = 2;
                fare_per_mile2 = 1.5;
                fare_per_mile3 = 1;


                if(miles>250)
                    fare = (100 * fare_per_mile1) + (150 * fare_per_mile2) + ((miles-250)* fare_per_mile3);
                else if(miles>100)
                    fare = (100 * fare_per_mile1) + ((miles-100)* fare_per_mile2);
                else if(miles>0)
                    fare = miles * fare_per_mile1;
                else {
                    fare = 0;
                    System.out.println("Unable to calculate the fare");
                }

                System.out.println(fare+"dollars");

                break;


            case 3: System.out.println("third class");
                fare_per_mile1 = 1.5;
                fare_per_mile2 = 1;
                fare_per_mile3 = 0.5;


                if(miles>250)
                    fare = (100 * fare_per_mile1) + (150 * fare_per_mile2) + ((miles-250)* fare_per_mile3);
                else if(miles>100)
                    fare = (100 * fare_per_mile1) + ((miles-100)* fare_per_mile2);
                else if(miles>0)
                    fare = miles * fare_per_mile1;
                else {
                    fare = 0;
                    System.out.println("Unable to calculate the fare");
                }

                System.out.println(fare+" dollars");
                break;

            default: System.out.println("Invalid Train class type");

        }

    }


}
/* Return Result
Enter the class of the train
3
Enter the miles
210

third class
260.0 dollars

 */



/* further investigation
DEFINE MILES FIRST

miles

100 * 000
miles -=100
150 * 000
miles -=150
miles * 999


 */