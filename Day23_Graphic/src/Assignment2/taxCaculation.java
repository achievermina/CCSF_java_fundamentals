package Assignment2;
import javax.swing.JOptionPane;
public class taxCaculation {

    public static void main(String[] args){
        double tax = 0;

        String income= JOptionPane.showInputDialog("write your annual income please");
        double intIncome = Double.parseDouble(income);


        if(intIncome<=9325)
                tax = intIncome * 0.1;
        else if(intIncome<=37950)
                tax = intIncome * 0.15;
        else if(intIncome<=91900)
                tax = intIncome * 0.25;
        else if(intIncome<=191650)
                tax = intIncome * 0.28;
        else if(intIncome<=416700)
                tax = intIncome *0.33;
        else if(intIncome<=418400)
                tax = intIncome * 0.35;
        else
            tax = intIncome *0.396;

        JOptionPane.showMessageDialog(null, "Your tax will be "+ tax);
        System.exit(0);
    }

}
