package Assignment3;


import javax.swing.JOptionPane;
import java.awt.*;

public class age18ornot {
    public static void main(String[] args) {
        boolean adult;
        int answer = JOptionPane.showConfirmDialog(null, "Are you over 18?", "Yes OR No", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            adult = true;
            JOptionPane.showMessageDialog(null, "ADULT: "+adult);
        }else if(answer == JOptionPane.NO_OPTION){
            adult = false;
            JOptionPane.showMessageDialog(null, "ADULT: "+adult);

        }else
            System.out.println("This is impossible");









    }

}
