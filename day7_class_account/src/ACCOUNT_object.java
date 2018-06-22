import java.util.Scanner;

public class ACCOUNT_object {

    public static void main(String[] arg) {

        int type, amount;

        ACCOUNT a1 = new ACCOUNT();
        a1.Init();
        a1.Show();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type, withdraw:1 or deposit:2");
        type = input.nextInt();
        System.out.println("Enter the amount");
        amount = input.nextInt();

        switch(type){
            case 1:a1.Withdraw(amount);
            System.out.println("Current Balance:" + a1.RBalance());
            break;

            case 2:a1.Deposit(amount);
            System.out.println("Current Balance:" + a1.RBalance());
            break;
        }
    }

}

/*
Enter the account number
12
Enter the name
mina
Enter the Balance
600
the account number: 12
the name: mina
the Balance:600.0
Enter the type, withdraw:1 or deposit:2
2
Enter the amount
500
Current Balance:1100.0
 */