package Assignment3;

import javax.swing.*;

public class factorialUserDialog {

    public static void main(String[] args){
        int i, factorialResult = 1;

        String number= JOptionPane.showInputDialog("write the number");
        int intNumber = Integer.parseInt(number);

        for(i=1;i<=intNumber;i++){
            factorialResult *= i;
        }

        int answer = JOptionPane.showConfirmDialog(null, "Do you want to see the result of factorial?", "Yes OR No", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "The factorial of "+intNumber+" is "+factorialResult);


        }else if(answer == JOptionPane.NO_OPTION){
            System.out.println("OK. Finish the program");


        }else
            System.out.println("This is impossible");

        System.exit(0);
    }
}
