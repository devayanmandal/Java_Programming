/*
 * Example Sum1To10: the use of a simple for loop to compute
 * the sum of the numbers 1 to 10.
 */

import javax.swing.JOptionPane;

public class Sum1To10 {

    public static void main(String[] args) {
	
        // initialize a variable for our running sum
        int sum = 0;
        
        // now have a for loop that counts 1-10, adding the value
        // of the counter to the sum inside each iteration of the loop
        for (int number = 1; number <= 10; number++) {
            
            sum += number;
        }
        
        // report the sum
        JOptionPane.showMessageDialog(null, "Our sum is " + sum);
    }
}
