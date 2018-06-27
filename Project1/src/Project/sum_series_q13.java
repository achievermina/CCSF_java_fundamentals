package Project;
import java.util.Scanner;

public class sum_series_q13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What should the base 'x' be?");
        int x = input.nextInt();
        System.out.println("What should the exponent 'n' be?");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += power(x, i);
        }
        System.out.println("the sum is " + sum);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }


}

/*
What should the base 'x' be?
4
What should the exponent 'n' be?
2
the sum is 20
 */