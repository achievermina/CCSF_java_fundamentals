package Project;
import java.util.Scanner;

public class q10_squares_cubes {

    public static void main(String[] args) {
        int i, number, output, output2, output3;
        char choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        System.out.println("a. First 5 multiples\n" +
                "\n" +
                "b. Squares of first 5 multiples\n" +
                "\n" +
                "c. Cubes of first five multiples.");

        System.out.println("which option do you want to choose?");
        choice = input.next().charAt(0);


        switch (choice) {
            case 'a':
                System.out.println("First 5 multiples are");
                for (i = 1; i <= 5; i++) {
                    output = number * i;
                    System.out.println(output);
                }
                break;
            case 'b':
                System.out.println("Squares of first 5 multiples are");
                for (i = 1; i <= 5; i++) {
                    output = number * i;
                    output2 = output * output;
                    System.out.println(output2);
                }
                break;
            case 'c':
                System.out.println("Cubes of first five multiples are");
                for (i = 1; i <= 5; i++) {
                    output = number * i;
                    output3 = output * output * output;
                    System.out.println(output3);
                }
                break;

        }


    }
}
/*
Enter the number
3
a. First 5 multiples

b. Squares of first 5 multiples

c. Cubes of first five multiples.
which option do you want to choose?
b
Squares of first 5 multiples are
9
36
81
144
225
 */