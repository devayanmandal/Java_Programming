/*
 * Example GeometricFractionalSum: compute the sum of
 * 1/2 + 1/4 + 1/8 + ... up to some fixed number of terms.
 * The larger that number, the closer we get to the sum
 * of the infinite series, which is 1
 */

import java.util.Scanner;

public class GeometricFractionalSum {

    public static void main(String[] args) {

        // a Scanner to read in our number
        Scanner keyboard = new Scanner(System.in);

        // read in the number of terms we want to compute
        int numTerms = 0;
        while (numTerms <= 0) {

            System.out.print("How many terms of the 1/2 + 1/4 + 1/8 + ... sequence should we compute? ");
            numTerms = keyboard.nextInt();

            if (numTerms <= 0) {
                System.out.println("Please enter a positive number...");
            }
        }

        // Now we need to compute our sum.  So we will need a variable where
        // that sum will be accumulated.
        double sum = 0.0;

        // the first term we will add in, this will be halved each time
        // around the loop so we are ready to add in the next smaller term.
        double nextTerm = 0.5; 

        // And a loop that counts up to the number of times we wish to "go
        // around the loop" and add another term.  Very often, counting loops
        // intending to go around "n" times will count from 0 to n-1, using
        // a form like this.

        for (int count = 0; count < numTerms; count++) {
            
            // add in the next term
            sum += nextTerm;
            
            // print some information about our running sum
            System.out.println("Added term " + nextTerm + ", sum now " + sum);
            
            // update nextTerm, so if we go around again, we'll add in a
            // smaller number
            nextTerm /= 2;
        }
        
        // we're done!  nothing really more to print here.
    }
}
