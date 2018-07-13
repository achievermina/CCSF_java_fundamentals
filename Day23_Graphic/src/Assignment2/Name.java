package Assignment2;
import javax.swing.JOptionPane;


public class Name {
    public static void main(String[] args){
        String firstname= JOptionPane.showInputDialog("write your first name");
        String middlename= JOptionPane.showInputDialog("write your middle name");
        String lastname= JOptionPane.showInputDialog("write your last name");

        JOptionPane.showMessageDialog(null, "Your full name is "+firstname+" "+middlename+" "+lastname);
        System.exit(0);

    }



}
