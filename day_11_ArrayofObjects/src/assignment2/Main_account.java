package assignment2;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Main_account {


    static Account[] acct;
    static int Numofaccounts;
    Scanner input = new Scanner(System.in);


    public static void main(String[] arg) {

        Register();
        System.out.println(" ");
        System.out.println("Transaction Choice");
        System.out.println(" ");
        Transaction();
        System.out.println(" ");
        System.out.println("display the details of all Account Holders");
        System.out.println(" ");
        DisplayAll();

    }


    public static void Register() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of accounts");
        Numofaccounts = input.nextInt();

        //array object created
        acct = new Account[Numofaccounts + 1];

        //Entering input
        System.out.println("Let's start entering the data of accounts");
        for (int i = 1; i < acct.length; i++) {
            acct[i] = new Account();
            acct[i].Init();
            acct[i].Show();

        }

    }

    public static void Transaction() {


        int i, SearchAcno, result = 0;
        boolean shouldIstop =true;

        Scanner input = new Scanner(System.in);



        while(shouldIstop && (result ==0)){
            System.out.println("Please enter your account number");
            SearchAcno = input.nextInt();
            for (i = 1; i < acct.length; i++) {
                if (SearchAcno != acct[i].RAcno()) {
                    continue;
                } else {
                    shouldIstop = false;
                    result = i;
                    break;
                }
            }

            if(result==0){
                System.out.println("There is no Account number: " + SearchAcno);
                System.out.println("Please try again");
            }

        }


        if (acct[result].RBalance() < 500){
            System.out.println("You need to have more than $500 for transaction");
            acct[result].Show();

        }else {
            acct[result].Show();
            acct[result].Type();

        }
    }

    public static void DisplayAll(){
        for (int i = 1; i < acct.length; i++) {
            System.out.println("Account"+i);
            acct[i].Show();
            System.out.println("");

        }
    }

}
/*
Enter the number of accounts
2
Let's start entering the data of accounts
Enter the account number
45
Enter the name
afds
Enter the Balance
600
the account number: 45
the name: afds
the Balance:600.0
Enter the account number
23
Enter the name
asdf
Enter the Balance
800
the account number: 23
the name: asdf
the Balance:800.0

Transaction Choice

Please enter your account number
23
the account number: 23
the name: asdf
the Balance:800.0
Which transaction do you wanna do? withdraw:1 or deposit:2
1
Enter the amount
45
Current Balance:755.0
Do you want to continue transaction? YES:1, NO:2
1
Which transaction do you wanna do? withdraw:1 or deposit:2
2
Enter the amount
50
Current Balance:805.0
Do you want to continue transaction? YES:1, NO:2
2
Finish the Transaction

display the details of all Account Holders

Account1
the account number: 45
the name: afds
the Balance:600.0

Account2
the account number: 23
the name: asdf
the Balance:805.0
 */