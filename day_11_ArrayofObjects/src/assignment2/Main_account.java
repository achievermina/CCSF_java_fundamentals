package assignment2;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Main_account {


    static Account[] acct;
    static int Numofaccounts;
    Scanner input = new Scanner(System.in);


    public static void main(String[] arg) {

        Register();
        System.out.println("Transaction Choice");
        Transaction();

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
            acct[i].Show();

        }
    }






}
