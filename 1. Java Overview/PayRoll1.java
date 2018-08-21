import javax.swing.JOptionPane;

public class PayRoll1 {
    public static void main (String[] args) {

        final double REGULAR_HOURS_WORKED = 40.0; //constant value

        final int TAX_DIVISOR = 100; //constant value

        //hours worked
        String input = JOptionPane.showInputDialog("Hey! How many hours did you put in this week at work: ");
        double hoursWorked = Double.parseDouble(input);
        if (hoursWorked <= 0.0) {
            JOptionPane.showMessageDialog(null, "Invalid response.");
            System.exit(1);
        }

        //pay rate
        input = JOptionPane.showInputDialog("Now, how much is the pay like for the hour (in $): ");
        double payRate = Double.parseDouble(input);
        if (payRate <= 0.0) {
            JOptionPane.showMessageDialog(null, "Invalid response.");
            System.exit(1);
        }

        //taxRate
        input = JOptionPane.showInputDialog("Ok, how much tax is levied at work (in %): ");
        double taxRate = Double.parseDouble(input);
        if (taxRate <= 0.0) {
            JOptionPane.showMessageDialog(null, "Invalid response.");
            System.exit(1);
        }

        double regularPay = 0;

        double taxRateDecimal = (1.0 * taxRate / TAX_DIVISOR);

        //taxed pay multiple
        double taxedPayMultiple = (1 - (1.0 * taxRate / 100));

        //Less than regular hours worked
        if (hoursWorked < REGULAR_HOURS_WORKED) {
            //under time pay
            double underTimePay = hoursWorked * payRate * taxedPayMultiple;

            //tax levied for under time pay
            double taxLeviedUnderPay = hoursWorked * payRate * taxRateDecimal;

            JOptionPane.showMessageDialog(null, "Drum Roll! Your weekly pay is " + underTimePay);

            JOptionPane.showMessageDialog(null, "And, tax assessed every week is" + taxLeviedUnderPay);
        } 
        //Regular hours worked
        else if (hoursWorked == REGULAR_HOURS_WORKED) {
            //regular pay
            regularPay = REGULAR_HOURS_WORKED * payRate * taxedPayMultiple;

            //tax levied for under time pay
            double taxLeviedRegularPay = REGULAR_HOURS_WORKED * payRate * taxRateDecimal;

            JOptionPane.showMessageDialog(null, "Drum Roll! Your weekly pay is " + regularPay);

            JOptionPane.showMessageDialog(null, "And, tax assessed every week is " + taxLeviedRegularPay);
        } 
        //More than regular hours worked
        else if (hoursWorked > REGULAR_HOURS_WORKED) {
            //overtime pay difference
            double overTimePayDiff = (hoursWorked - REGULAR_HOURS_WORKED) * payRate * 1.5 * taxedPayMultiple;

            //over time pay
            double overTimePay = regularPay + overTimePayDiff;

            double taxLeviedOverPay = (hoursWorked - REGULAR_HOURS_WORKED) * payRate * 1.5 * taxRateDecimal;

            JOptionPane.showMessageDialog(null, "Drum Roll! Your weekly pay is " + overTimePay);

            JOptionPane.showMessageDialog(null, "And, tax assessed every week is " + taxLeviedOverPay);
        } else {
            System.exit(1);
        }
    }
}