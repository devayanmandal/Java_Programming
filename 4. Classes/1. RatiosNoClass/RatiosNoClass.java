/*
 * Example RatiosNoClass -- work with a few ratios as motivation for
 * a "Ratio" class
 */

public class RatiosNoClass {

    public static void main(String[] args) {

        // if we want to represent ratios, we will need a numerator and
        // a denominator for each.
        int aNum = 4;
        int aDen = 6;
        int bNum = 2;
        int bDen = 4;

        // print some information about these
        System.out.println("Ratio a is " + aNum + "/" + aDen);
        System.out.println("Ratio b is " + bNum + "/" + bDen);

        // we can print their decimal equivalents
        double aDecimal = 1.0 * aNum / aDen;
        double bDecimal = 1.0 * bNum / bDen;

        System.out.println("a as a decimal is " + aDecimal);
        System.out.println("b as a decimal is " + bDecimal);
        
        // let's change the ratios a bit, and do the printouts again
        aNum = 1;
        bDen = 10;
        
        System.out.println("Ratio a is " + aNum + "/" + aDen);
        System.out.println("Ratio b is " + bNum + "/" + bDen);

        // we can print their decimal equivalents
        aDecimal = 1.0 * aNum / aDen;
        bDecimal = 1.0 * bNum / bDen;

        System.out.println("a as a decimal is " + aDecimal);
        System.out.println("b as a decimal is " + bDecimal);
        
    }
}