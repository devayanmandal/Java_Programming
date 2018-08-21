import java.text.DecimalFormat;

public class Ratio {
    private int numerator, denominator;

    //constructor
    public Ratio (int num, int den) {
        numerator = num;
        denominator = den;
    }

    //mutator: numerator
    public void setNumerator (int num1) {
        numerator = num1;
    }

    //mutator: denominator
    public void setDenominator (int den1) {
        denominator = den1;
    }

    //accessor: numerator
    public int getNumerator () {
        return numerator;
    }

    //accessor: denominator
    public int getDenominator () {
        return denominator;
    }

    //user-customized accessor
    public double getDecimalValue () {
        return 1.0 * numerator / denominator;
    }

    //"Pretty" toString representation
    public String toString () {
        return numerator + " / " + denominator;
    }

    public static void main (String [] args) {
        DecimalFormat formatter = new DecimalFormat("0.00");

        Ratio a = new Ratio(1, 3);

        System.out.println("Ratio a is: " + a.toString());
        
        System.out.println("\nRatio a in decimal format: "
            + formatter.format(a.getDecimalValue()));

        System.out.println("\na's numerator is: " + a.getNumerator());
        
        a.setNumerator(2);
        System.out.println("\nRatio a is: " + a.toString());

    }
}