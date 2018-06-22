package Array_Assignment;

import java.util.Scanner;
import java.util.Arrays;

public class array_replace {
    public static void main(String[] args) {


        int[] A = new int[10];
        int Original, Replacement;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number" + (i + 1) + " ");
            A[i] = input.nextInt();
        }

        System.out.println("Array created!");
        System.out.println(Arrays.toString(A));

        System.out.println("Enter the original number you want to replace");
        Original = input.nextInt();

        System.out.println("Enter the replacement number ");
        Replacement = input.nextInt();

        for(int i=0; i<10; i++){
            if(A[i]==Original)
                A[i]=Replacement;

        }

        System.out.println("NEW array created!");
        System.out.println(Arrays.toString(A));

    }
}
/*
Enter the number1 1
Enter the number2 2
Enter the number3 33
Enter the number4 3
Enter the number5 3
Enter the number6 4
Enter the number7 5
Enter the number8 6
Enter the number9 7
Enter the number10 8
Array created!
[1, 2, 33, 3, 3, 4, 5, 6, 7, 8]
Enter the original number you want to replace
3
Enter the replacement number
100
NEW array created!
[1, 2, 33, 100, 100, 4, 5, 6, 7, 8]
 */