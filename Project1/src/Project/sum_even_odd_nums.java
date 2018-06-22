package Project;

import java.util.Scanner;



public class sum_even_odd_nums{

    public static void main(String[] args) {

        int number, sum_even, sum_odd;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        sum_even = 0;
        sum_odd = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum_even += i;
            } else {
                sum_odd += i;

            }

        }

        System.out.println("The sum of even numbers between 1 and " + number + " is " + sum_even);
        System.out.println("The sum of odd numbers between 1 and " + number + " is " + sum_odd);

    }
}

/*
Enter the number
12
The sum of even numbers between 1 and 12 is 42
The sum of odd numbers between 1 and 12 is 36
 */
