package Assignment;

import java.util.Scanner;

public class number2 {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        int[][] a;
        int[][] b;
        int M1, N1;

        System.out.println("Enter the value of M for M*N matrix");
        M1 = input.nextInt();
        System.out.println("Enter the value of N for M*N matrix");
        N1 = input.nextInt();

        a = new int[M1][N1];
        b = new int[M1][N1];

        for (int row = 0; row < M1; row++) {
            for (int column = 0; column < N1; column++) {
                System.out.println("Enter the value of " + "(" + (row + 1) + "," + (column + 1) + ")");
                a[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < M1; row++) {
            for (int column = 0; column < N1; column++) {
                System.out.println("Enter the value of " + "(" + (row + 1) + "," + (column + 1) + ")");
                b[row][column] = input.nextInt();
            }
        }

        System.out.println("Matrix a");
        printMatrix(a);
        System.out.println("Matrix b");
        printMatrix(b);
        System.out.println("Sum of Matrix a and b");
        Matrixsum(a,b);
        System.out.println("Deduction of Matrix a and b");
        Matrixdeduction(a,b);

    }


    public static void printMatrix(int[][] item){
        for(int i = 0; i < item.length; i++)
        {
            for(int j = 0; j < item[0].length; j++)
            {
                System.out.printf("%5d ", item[i][j]);
            }
            System.out.println();

        }
    }

    public static void Matrixsum(int[][] item1, int[][] item2) {

        for (int i = 0; i < item1.length; i++) {
            for (int j = 0; j < item1[0].length; j++) {
                System.out.printf("%5d ", (item1[i][j] + item2[i][j]));

            }
            System.out.println();

        }

    }

    public static void Matrixdeduction(int[][] item1, int[][] item2) {

        for (int i = 0; i < item1.length; i++) {
            for (int j = 0; j < item1[0].length; j++) {
                System.out.printf("%5d ", (item1[i][j] - item2[i][j]));

            }
            System.out.println();

        }

    }


}
/*
Enter the value of M for M*N matrix
4
Enter the value of N for M*N matrix
2
Enter the value of (1,1)
1
Enter the value of (1,2)
2
Enter the value of (2,1)
3
Enter the value of (2,2)
4
Enter the value of (3,1)
5
Enter the value of (3,2)
6
Enter the value of (4,1)
7
Enter the value of (4,2)
8
Enter the value of (1,1)
3
Enter the value of (1,2)
5
Enter the value of (2,1)
2
Enter the value of (2,2)
6
Enter the value of (3,1)
7
Enter the value of (3,2)
7
Enter the value of (4,1)
4
Enter the value of (4,2)
5
Matrix a
    1     2
    3     4
    5     6
    7     8
Matrix b
    3     5
    2     6
    7     7
    4     5
Sum of Matrix a and b
    4     7
    5    10
   12    13
   11    13
Deduction of Matrix a and b
   -2    -3
    1    -2
   -2    -1
    3     3
 */