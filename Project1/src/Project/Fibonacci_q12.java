package Project;
import java.util.Scanner;

public class Fibonacci_q12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for how many terms");
        int n = input.nextInt();

        int total = 0, numberOld = 0, numberNew = 1, temp;
        for (int i = 1; i < n; i++) {
            total += numberNew;
            temp = numberOld;
            numberOld = numberNew;
            numberNew += temp;
        }
        System.out.printf("Sum for %d terms is " + total, n);
    }

}
