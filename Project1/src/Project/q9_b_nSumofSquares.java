package Project;


import java.util.Scanner;

// 2^2 + 4^2 + 6^2 ... pattern
public class q9_b_nSumofSquares  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is n?");
        int n = input.nextInt(), total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * i * 4; // same thing as (i x 2)^2
        }
        System.out.println("the total is " + total);

    }

}
