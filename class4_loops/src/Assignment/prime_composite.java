import java.util.Scanner;

public class prime_composite {
    public static void main(String[] args) {
        int number,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        int verdict =0;

        for (i = 2; i <= (number - 1); i++) {
            if (number % i == 0)
                verdict += i;
            else
                verdict += 0;
        }

        if(verdict>0)
            System.out.println("It is a composite number");
        else
            System.out.println("It is a prime number");
        }

    }

/*
Enter the number
16
It is a composite number
 */