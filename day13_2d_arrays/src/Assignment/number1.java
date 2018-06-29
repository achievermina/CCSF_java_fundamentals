package Assignment;
import java.util.Scanner;

public class number1 {

    public static void main(String[] arg){
        int sum=0, even_sum=0, odd_sum=0, n;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the value of n for n*n matrix");
        n = input.nextInt();
        int [][] a = new int[n][n];

        for(int row =0; row<n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.println("Enter the value of " + "(" + (row+1) + "," + (column+1) + ")");
                a[row][column] = input.nextInt();
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.printf("%5d ", a[i][j]);

                sum +=a[i][j];

                if(a[i][j]%2==0)
                    even_sum +=a[i][j];
                else
                    odd_sum +=a[i][j];

            }
            System.out.println();

        }

        System.out.println("The sum of all elements:"+sum);
        System.out.println("The sum of even elements:"+even_sum);
        System.out.println("The sum of odd elements:"+odd_sum);
    }

}
/*
Enter the value of n for n*n matrix
2
Enter the value of (1,1)
1
Enter the value of (1,2)
2
Enter the value of (2,1)
3
Enter the value of (2,2)
4
    1     2
    3     4
The sum of all elements:10
The sum of even elements:6
The sum of odd elements:4
 */