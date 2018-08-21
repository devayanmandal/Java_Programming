import javax.swing.JOptionPane;

public class ShouldWeSki2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hey! To find out if we can"
            + " go skiing today, we need to know what the temperature and snow"
            + " conditions are like outside.");

        String input = JOptionPane.showInputDialog("Ok, so what's the temperature"
                + " like?");
        double temperature = Double.parseDouble(input);

        if (temperature <= 50) {
            input = JOptionPane.showInputDialog("Temperature looking good! Now,"
                + " how many inches of snow did we get?");
            double snow = Double.parseDouble(input);

            if (snow >= 6) {
                JOptionPane.showMessageDialog(null, "Sweet! Time to tear through"
                    + " some snow");

            } else if (snow < 6) {          
                JOptionPane.showMessageDialog(null, "Need some more snow..");

            } else {
                JOptionPane.showMessageDialog(null, "I didn't understand what"
                    + " you typed in there.");
                System.exit(1);

            }
        } else if (temperature > 50) {
            JOptionPane.showMessageDialog(null, "Too hot..");

        } else {
            JOptionPane.showMessageDialog(null, "I didn't understand what"
                + " you typed in there.");
            System.exit(1);

        }
    }
}