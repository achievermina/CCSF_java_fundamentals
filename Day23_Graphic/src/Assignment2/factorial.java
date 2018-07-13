package Assignment2;

import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args){
        int i, factorialResult = 1;

        String number= JOptionPane.showInputDialog("write the number");
        int intNumber = Integer.parseInt(number);

        for(i=1;i<=intNumber;i++){
            factorialResult *= i;
        }

        JOptionPane.showMessageDialog(null, "The factorial of "+intNumber+" is "+factorialResult);
        System.exit(0);

    }

}
