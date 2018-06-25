package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q11_e_LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();

        List<Integer> factors = new ArrayList<Integer>();

        int result = 1, LCF = 0, tempX = x, tempY = y;
        while (lowestCommonFactor(tempX, tempY) != -1) {
            LCF = lowestCommonFactor(tempX, tempY);
            factors.add(LCF);
            tempX /= LCF;
            tempY /= LCF;
        }
        result *= tempX * tempY;
        for (int i : factors) {
            result *= i;
        }

        System.out.println("the least common multiple is " + result);
    }

    public static int lowestCommonFactor(int x, int y) {
        List<Integer> xFactors = new ArrayList<Integer>();

        for (int i = 2; i <= x; i++) {
            if (isInt(x, i)) {
                xFactors.add(i);
            }
        }
        for (int i = 2; i <= y; i++) {
            if (isInt(y, i)) {
                for (int xFactor : xFactors) {
                    if (i == xFactor) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static boolean isInt(double numerator, double denominator) {
        return ((double) numerator / denominator % 1) == 0 ? true : false;
    }
}