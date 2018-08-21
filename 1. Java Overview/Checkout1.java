/*
 * Example Checkout: compute a running total of a cost as item prices
 * are entered, ending with an item price of 0.  Demonstrates Java's
 * do-while construct.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Checkout1 {

    public static void main(String[] args) {
        
        // set up for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // initialize our running total
        double total = 0.0;
        
        // declare the variable that we'll use for item prices
        double itemPrice;
        
        do {
            // get next item price
            System.out.print("Enter next item price, 0 to end: ");
            itemPrice = keyboard.nextDouble();
            
            total += itemPrice;            
            
            // add to running total (if positive)
            if (itemPrice > 0.0) {
                // this is a shorthand notation for:
                // total = total + itemPrice;
                total += itemPrice;
            }
            
        } while (itemPrice > 0.0);
        
        // print our result
        DecimalFormat currency = new DecimalFormat("$#,##0.00");
        System.out.println("Total cost: " + currency.format(total));
    }
}
