package Project;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

    int number, digit, numofevendigits =0, even_sum_digit = 0, numofodddigits = 0, odd_sum_digit = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number");
    number = input.nextInt();

    while (number > 0) {
        digit = number%10;
        if(digit%2==0) {
            even_sum_digit += digit;
            numofevendigits++;
        }else{
            odd_sum_digit += digit;
            numofodddigits++;
        }

        number = number / 10;
    }

    System.out.println("The sum of even digits is " + even_sum_digit);
    System.out.println("The sum of odd digits is " + odd_sum_digit );
    System.out.println("The total number of even digits is " + numofevendigits);
    System.out.println("The total number of odd digits is " + numofodddigits);
}
}

/*
Enter the number
3567
sum of even digits is 6
sum of odd digits is 15
total number of even digits is 1
total number of odd digits is 3
 */
