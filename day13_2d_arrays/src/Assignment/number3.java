package Assignment;
import java.util.Scanner;


public class number3 {


    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        int M, N, sum_row = 0, sum_column = 0, sum_principal_diagonal = 0, sum_secondary_diagonal = 0;

        System.out.println("Enter the value of M for M*N matrix");
        M = input.nextInt();
        System.out.println("Enter the value of N for M*N matrix");
        N = input.nextInt();

        int[][] a = new int[M][N];

        for (int row = 0; row < M; row++) {
            for (int column = 0; column < N; column++) {
                System.out.println("Enter the value of " + "(" + (row + 1) + "," + (column + 1) + ")");
                a[row][column] = input.nextInt();
            }
        }
        //display
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%5d ", a[i][j]);
            }
            System.out.println();

        }


        //sum of each row

        for (int row = 0; row < M; row++) {
            for (int column = 0; column < N; column++) {
                sum_row += a[row][column];
            }
            System.out.println("The sum of the row " + (row + 1) + " is " + sum_row);
            sum_row = 0;
        }

        System.out.println();

        //sum of each column
        for (int column = 0; column < N; column++) {
            for (int row = 0; row < M; row++) {
                sum_column += a[row][column];
            }
            System.out.println("The sum of the column " + (column + 1) + " is " + sum_column);
            sum_column = 0;
        }

        System.out.println();

        //sum of diagonals
        if (M == N) {

            //principal diagonal
            for (int row = 0; row < M; row++) {
                sum_principal_diagonal += a[row][row];
            }
            System.out.println("The sum of the principal diagonal is " + sum_principal_diagonal);
            //secondary diagonal
            for (int row = 0, column=M; row < M; row++, column--) {
                sum_secondary_diagonal += a[row][column-1];
            }
            System.out.println("The sum of the secondary diagonal is " + sum_secondary_diagonal);

        }

    }
}



/*
Enter the value of M for M*N matrix
3
Enter the value of N for M*N matrix
3
Enter the value of (1,1)
1
Enter the value of (1,2)
4
Enter the value of (1,3)
3
Enter the value of (2,1)
2
Enter the value of (2,2)
5
Enter the value of (2,3)
6
Enter the value of (3,1)
8
Enter the value of (3,2)
9
Enter the value of (3,3)
4
    1     4     3
    2     5     6
    8     9     4
The sum of the row 1 is8
The sum of the row 2 is13
The sum of the row 3 is21

The sum of the column 1 is11
The sum of the column 2 is18
The sum of the column 3 is13

The sum of the principal diagonal is 10
The sum of the secondary diagonal is 16
 */


