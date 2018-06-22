import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int number, sum, digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        sum = 0;
        int initial_number = number;
        while (number > 0) {
            sum *= 10;
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        if (sum == initial_number)
            System.out.println("The number is a palindrome number");
        else
            System.out.println("THe number is NOT a palindrome number");

    }
}

/*
Enter the number
5775
The number is a palindrome number

Enter the number
345
THe number is NOT a palindrome number
 */