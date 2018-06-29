package Assignment;

import java.util.Scanner;

public class number4 {


    Scanner input = new Scanner(System.in);

    static int [][] a = new int[3][3];
    static int[][] temp = new int[3][3];
    static int row, column, i, j;

    public static void main(String[] arg) {

    create();
    display(a);
    System.out.println("Transpose matrix is here");
    display(temp);

    }

    public static void create(){
        Scanner input = new Scanner(System.in);

        for(row =0; row<3; row++) {
            for (column = 0; column < 3; column++) {
                System.out.println("Enter the value of " + "(" + (row+1) + "," + (column+1) + ")");
                a[row][column] = input.nextInt();
            }
        }

        swap();
    }

    public static void swap(){


        for(row =0; row<3; row++) {
            for (column = 0; column < 3; column++) {
               temp[column][row] = a[row][column];

            }
        }

    }

    public static void display(int[][] c){

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.printf("%5d ", c[i][j]);
            }
            System.out.println();

        }

    }

}
/*
Enter the value of (1,1)
1
Enter the value of (1,2)
2
Enter the value of (1,3)
3
Enter the value of (2,1)
4
Enter the value of (2,2)
5
Enter the value of (2,3)
6
Enter the value of (3,1)
7
Enter the value of (3,2)
8
Enter the value of (3,3)
9
    1     2     3
    4     5     6
    7     8     9
Transpose matrix is here
    1     4     7
    2     5     8
    3     6     9

 */
