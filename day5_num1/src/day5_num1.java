/*
A method called COMPOSITE() that accepts an integer argument and checks whether it is a composite number or not. It returns 1 if it is composite and 0 if it is not.
A method called COUNT() that accepts an integer and returns the number of digits it has.
A method called POWER() that raises its first argument to the power of the second argument and displays the result
 */

import java.util.Scanner;




public class day5_num1 {

    public static int composite(int number) {
        int verdict = 0;

        for (int i = 2; i <= (number - 1); i++) {
            if (number % i == 0)
                verdict += i;
            else
                verdict += 0;
        }

        if (verdict > 0)
            return 1;
        else
            return 0;

    }


    public static int digits(int number) {
        int sum_digit = 0;
        while (number > 0) {
            number = number / 10;
            sum_digit++;
        }
        return sum_digit;


    }

    public static int power(int a, int b){
        int a_b =1;
        for(int i=1; i<=b; i++){
            a_b *=a;
        }
        return a_b;
    }


    public static void main(String[] args) {
        int number,a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        switch(composite(number)){
            case 1: System.out.println(number+" is a composite number" );
                    break;
            case 0: System.out.println(number+" is a prime number" );
        }

        System.out.println("The number of digits of "+ number +" is " +digits(number));


        System.out.println("Enter the number");
        a = input.nextInt();
        System.out.println("Enter the power");
        b = input.nextInt();

        System.out.println("The result is " +power(a, b));


    }
}
/*
Enter the number
34
34 is a composite number
The number of digits of 34 is 2
Enter the number
2
Enter the power
5
The result is 32
 */