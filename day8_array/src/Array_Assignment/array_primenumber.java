package Array_Assignment;

import java.util.Scanner;

public class array_primenumber {



    public static Boolean Prime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= (number - 1) && (isPrime); i++) {
            if (number % i == 0) {
                isPrime = false;
            }else{
                isPrime = true;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {

        int [] A = new int[10];
        int i, count_prime=0;
        Scanner input=new Scanner(System.in);

        for(i=0; i<10; i++){
            System.out.print("Enter number" + (i + 1) + " ");
            A[i] = input.nextInt();
        }

        for(int index=0; index<10; index++){
            if(Prime(A[index])) {
                System.out.println(A[index]);
                count_prime++;
            }
        }


        System.out.println("Total number of prime numbers is "+ count_prime);


    }
}

/*
Enter number1 12
Enter number2 13
Enter number3 15
Enter number4 25
Enter number5 6
Enter number6 45
Enter number7 7
Enter number8 11
Enter number9 10
Enter number10 3
13
7
11
3
Total number of prime numbers is 4
 */