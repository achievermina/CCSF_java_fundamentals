package assignment2;


import java.util.Scanner;


public class Account {


    private int Acno, type, amount, check;
    private String Name;
    private float Balance;
    Scanner input = new Scanner(System.in);

    public void Init(){

        System.out.println("Enter the account number");
        Acno = input.nextInt();
        System.out.println("Enter the name");
        Name = input.next();
        System.out.println("Enter the Balance");
        Balance = input.nextFloat();

    }

    public void Show(){
        System.out.println("the account number: "+Acno);
        System.out.println("the name: "+Name);
        System.out.println("the Balance:" + Balance);

    }

    public void Deposit(int Amt){
        Balance += Amt;
        System.out.println("Current Balance:" + RBalance());
        transaction_loop();
    }

    public void Withdraw(int Amt){
        if(Balance>=Amt){
            Balance -= Amt;
            System.out.println("Current Balance:" + RBalance());
            transaction_loop();
        }else
            System.out.println("There is not enough balance on your account");
            System.out.println("Current Balance:" + RBalance());
            Type();

    }

    public void Type(){

        System.out.println("Which transaction do you wanna do? withdraw:1 or deposit:2");
        type = input.nextInt();

        switch(type){
            case 1:
                System.out.println("Enter the amount");
                amount = input.nextInt();
                Withdraw(amount);
                break;

            case 2:
                System.out.println("Enter the amount");
                amount = input.nextInt();
                Deposit(amount);
                break;

            default: System.out.println("You put the wrong type, please write 1 or 2");
                    Type();
        }

    }



    public void transaction_loop(){
        System.out.println("Do you want to continue transaction? YES:1, NO:2");
        check = input.nextInt();

        switch(check){
            case 1:Type();
                break;

            case 2:
                System.out.println("Finish the Transaction");
                break;

            default: System.out.println("You put the wrong type, please write 1 or 2");
                transaction_loop();

        }
    }


    public float RBalance(){
        return Balance;
    }

    public int RAcno(){
        return Acno;
    }

}
