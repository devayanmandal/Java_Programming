import java.util.Scanner;
import java.text.DecimalFormat;

public class MilesPerGallon1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hey! Enter the number of miles which have been " + 
            "traversed: ");
        double miles = input.nextDouble();

        System.out.print("\nOk, now enter the number of gallons of fuel expended: ");
        double gallons = input.nextDouble();

        DecimalFormat formatter = new DecimalFormat("##.0");

        System.out.println("\n\nBased on what you've entered, we get a mpg of " 
            + formatter.format(miles/gallons));
    }
}