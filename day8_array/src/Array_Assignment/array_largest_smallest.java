package Array_Assignment;

import java.util.Scanner;


public class array_largest_smallest {
    public static void main(String Args[])
    {

        int [] A = new int[10];
        int i, sum=0, largest=0, smallest=999999;
        Scanner input=new Scanner(System.in);

        for(i=0; i<10; i++){
            System.out.print("Enter number" + (i + 1) + "");
            A[i] = input.nextInt();
        }

        for(int index=0; index<10; index++){
            if(largest<A[index])
                largest= A[index];

            if(smallest>A[index])
                smallest = A[index];
        }


        System.out.println("The largest number is "+ largest);
        System.out.println("The smallest number is "+ smallest);

    }

}

/*
Enter number14
Enter number21
Enter number316
Enter number44
Enter number565
Enter number645
Enter number734
Enter number823
Enter number976
Enter number1054
The largest number is 76
The smallest number is 1
 */