package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q11_d_HighestCommonFactor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        int HCF = 1;

        List<Integer> multiples = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++) {
            if (((double) x / i % 1) == 0) {
                multiples.add(i);
            }
        }
        for (int i = 1; i <= y; i++) {
            if (((double) y / i % 1) == 0) {
                for (int multiple : multiples) {
                    if (i == multiple) {
                        System.out.println("common factor:" + multiple);
                        HCF = multiple;
                    }
                }
            }
        }
        System.out.println("the highest common factor is " + HCF);
    }
}