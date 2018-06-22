import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int i, n, f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        n=input.nextInt();

        f = 1;

        for(i=1;i<=n;i++){
            f *= i;
        }
        System.out.println("The factorial of "+n+" is "+f);
    }

}


/*
Enter the number
6
The factorial of 6 is 720
 */