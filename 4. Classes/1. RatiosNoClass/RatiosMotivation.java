import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RatiosMotivation {
    public static void main (String[] args) {
        DecimalFormat formatter = new DecimalFormat("0.000");

        int aNum = 2;
        int aDen = 3;
        int bNum = 5;
        int bDen = 8;

        JOptionPane.showMessageDialog(null, "Ratio a is " + aNum + "/" + aDen);
        JOptionPane.showMessageDialog(null, "Ratio b is " + bNum + "/" + bDen);

        //Decimal representation

        double ratioADecimalEquivalent = (1.0 * aNum / aDen);
        double ratioBDecimalEquivalent = (1.0 * bNum / bDen);

        JOptionPane.showMessageDialog(null, "Ratio A as a decimal equivalent is "
            + formatter.format(ratioADecimalEquivalent));

        JOptionPane.showMessageDialog(null, "Ratio B as a decimal equivalent is "
            + formatter.format(ratioBDecimalEquivalent));

        aNum = 4;
        bDen = 9;

        ratioADecimalEquivalent = (1.0 * aNum / aDen);
        ratioBDecimalEquivalent = (1.0 * bNum / bDen);

        JOptionPane.showMessageDialog(null, "Ratio A as a decimal equivalent is "
            + formatter.format(ratioADecimalEquivalent));

        JOptionPane.showMessageDialog(null, "Ratio B as a decimal equivalent is "
            + formatter.format(ratioBDecimalEquivalent));
    }
}

//JOptionPane.showMessageDialog(null, "");