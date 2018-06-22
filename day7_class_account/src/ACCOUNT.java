import java.util.Scanner;

public class ACCOUNT{

        private int Acno;
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
        }

        public void Withdraw(int Amt){
        Balance -= Amt;
        }

        public float RBalance(){
        return Balance;
        }


}
