package Project;
import java.util.Scanner;

public class pattern {

    public static void main(String[] args){
        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
/*
Enter the number
5
1
12
123
1234
12345

54321
4321
321
21
1
 */