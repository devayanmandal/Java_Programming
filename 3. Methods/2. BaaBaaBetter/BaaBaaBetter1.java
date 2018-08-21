import javax.swing.JOptionPane;

public class BaaBaaBetter1 {
    public static void main (String[] args) {
        refrain ();
        
        JOptionPane.showMessageDialog(null, "BaaBaaBetter1 statement 2");
        
        refrain ();
    }

    public static void refrain () {
        JOptionPane.showMessageDialog(null, "Will this refrain method, created after"
            + " the main method be called correctly?");
    }
}