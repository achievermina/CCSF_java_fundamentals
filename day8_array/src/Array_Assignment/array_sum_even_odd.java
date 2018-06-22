package Array_Assignment;

import java.util.Scanner;


public class array_sum_even_odd {
    public static void main(String[] args) {


        int [] A = new int[10];
        int i, even_sum=0, odd_sum =0;
        Scanner input=new Scanner(System.in);

        for(i=0; i<10; i++){
            System.out.print("Enter number" + (i + 1) + "");
            A[i] = input.nextInt();
        }

        for(int index=0; index<10; index++){
            if (A[index] % 2 == 0) {
                even_sum+= A[index];
            } else
                odd_sum += A[index];
        }


        System.out.println("The even_sum is "+ even_sum);
        System.out.println("The odd_sum is "+ odd_sum);


    }
}

/*
Enter number12
Enter number245
Enter number36
Enter number48
Enter number57
Enter number62
Enter number73
Enter number84
Enter number96
Enter number105
The even_sum is 28
The odd_sum is 60
 */