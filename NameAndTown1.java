import javax.swing.JOptionPane;

public class NameAndTown1 {
    public static void main (String[] args) {
        String townName = JOptionPane.showInputDialog("Hey! What's the name of your"
        + " town?");
        
        String userName = JOptionPane.showInputDialog("Ok, now tell us what's your"
        + " name");
        
        if (townName.length() == userName.length()) {
            JOptionPane.showMessageDialog(null,"Both names are the same length!");
            
        } else if (townName.length() > userName.length()) {
            JOptionPane.showMessageDialog(null," Seems like the name or your"
            + " town is longer than your name");
            
        } else if (userName.length() > townName.length()) {
            JOptionPane.showMessageDialog(null," Seems like your name"
            + " is longer than the name of your town");
            
        } else {
            JOptionPane.showMessageDialog(null,"I didn't understand what you"
            + " typed in. Try again");
            System.exit(1);
        }      
    }
}