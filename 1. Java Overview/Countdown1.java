import javax.swing.JOptionPane;

public class Countdown1 {
    public static void main (String[] args) {
        String input = JOptionPane.showInputDialog("What number should countdown"
                + " begin from?");
        int number = Integer.parseInt(input); //5

        if (number > 0) {
            for (int i = number; i > 0 ; i--) {
                JOptionPane.showMessageDialog(null, number);
                number--;
            }
            JOptionPane.showMessageDialog(null, "Blast Off!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Positive numbers only");
            
        }

    }
}