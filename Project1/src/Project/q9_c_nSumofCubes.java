package Project;

import java.util.Scanner;

//	1^3 + 3^3 + 5^3 ... pattern
public class q9_c_nSumofCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is n?");
        int n = input.nextInt(), total = 0, increment=1;
        for (int i = 1; i <= n; i++, increment+=2) {
            total += (increment) * (increment) * (increment);
        }
        System.out.println("the total is " + total);
    }
}
/*
what is n?
3
the total is 153
 */