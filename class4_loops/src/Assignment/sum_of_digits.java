
import java.util.Scanner;

public class sum_of_digits {

    public static void main(String[] args)
    {
        int number, digit, sum_digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number=input.nextInt();

        sum_digit= 0;
        while(number>0){
            digit = number%10;
            sum_digit += digit;
            number = number/10;
        }

        System.out.println("The sum of digits is "+sum_digit);

    }

}

/*
Enter the number
653
The sum of digits is 14
 */