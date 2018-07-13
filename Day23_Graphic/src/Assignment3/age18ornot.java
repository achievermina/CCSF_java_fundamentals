package Assignment3;


import javax.swing.JOptionPane;
import java.awt.*;

public class age18ornot {
    public static void main(String[] args) {
        boolean adult;
        int answer = JOptionPane.showConfirmDialog(null, "Are you over 18?", "Yes OR No", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            adult = true;
            System.out.println("You are an adult");

        }else if(answer == JOptionPane.NO_OPTION){
            adult = false;
            System.out.println("You are NOT an adult");
        }else
            System.out.println("This is impossible");









    }

}
