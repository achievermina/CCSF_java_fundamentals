package Project;

import java.util.Scanner;

public class q11_b_Armstrong {

    public static int power(int a, int b){
        int a_b =1;
        for(int i=1; i<=b; i++){
            a_b *=a;
        }
        return a_b;
        }

    public static int digits(int number) {
        int sum_digit = 0;
        while (number > 0) {
            number = number / 10;
            sum_digit++;
        }
        return sum_digit;
    }

    public static void main(String[] args) {
        int number, digit, sum_power_digits=0, init_number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        int number_digit =  digits(number);
        init_number= number;

        while (number > 0) {
            digit = number%10;
            sum_power_digits += power(digit, number_digit);
            number = number / 10;
        }

        if(init_number==sum_power_digits)
            System.out.println("The number is an Armstrong number");
        else
            System.out.println("The number is NOT an Armstrong number");



    }
}

/*
Enter the number
234
The number is NOT an Armstrong number

Enter the number
121
The number is NOT an Armstrong number
 */