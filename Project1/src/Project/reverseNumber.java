package Project;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        int number, digit, reverse=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        while(number>0){
            digit = number%10;
            number = number/10;
            reverse = reverse*10 + digit;
        }

        System.out.println("The reverse number is " + reverse);
    }

}
