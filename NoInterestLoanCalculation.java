import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class NoInterestLoanCalculation {
    public static void main (String[] args) {
        DecimalFormat formatter = new DecimalFormat("##");
        DecimalFormat formatter1 = new DecimalFormat("##.000");

        String input = JOptionPane.showInputDialog("Hey! Enter the loan amount:");
        double loan = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Ok, now enter the desired monthly payment:");
        double monthlyPayment = Double.parseDouble(input);

        double numberOfPayments = loan / monthlyPayment;

        JOptionPane.showMessageDialog(null, "The number of payments required to pay off" 
            + " the loan is " + formatter.format(numberOfPayments));

        double remainder = (loan % monthlyPayment);

        if (remainder == 0)  {
            JOptionPane.showMessageDialog(null, "Congratulations! The loan has been" + 
                " completely repaid.");
        } else {
            JOptionPane.showMessageDialog(null, "$" + formatter1.format(remainder) + " needs to paid in"
            + " addition to the $" + monthlyPayment + " as the last payment." );
        }

    }
}