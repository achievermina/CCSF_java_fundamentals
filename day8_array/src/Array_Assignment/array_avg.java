import java.util.Scanner;
public class array_avg{
    public static void main(String Args[])
    {

        int [] A = new int[10];
        int i, sum=0;
        Scanner input=new Scanner(System.in);

        for(i=0; i<10; i++){
        System.out.print("Enter number" + (i + 1) + "");
        A[i] = input.nextInt();
        }

        for(int index=0; index<10; index++){
            sum = sum + A[index];
        }

        int average = sum / A.length;
        System.out.println("The average is "+ average);

        }
}

/*
    Enter number1
    1
        Enter number22
        Enter number33
        Enter number44
        Enter number55
        Enter number66
        Enter number77
        Enter number88
        Enter number99
        Enter number1010
        The average is 5

 */
