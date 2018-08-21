/*
 * Example PerfectSquares: a program to demonstrate basic while loops
 * by printing all perfect squares up to a given limit.
 */

import java.util.Scanner;

public class PerfectSquares {

    public static void main(String[] args) {

        // keyboard input here
        Scanner kbd = new Scanner(System.in);

        // let's get our upper limit
        System.out.print("What is the upper limit on perfect squares? ");
        int limit = kbd.nextInt();

        // compute the first
        int nextNumber = 1;
        int square = nextNumber * nextNumber;

        // now print them out as long as the square does not exceed the limit
        while (square <= limit) {

            // hey look, a printf!  %d means find and print an int
            System.out.printf("%d squared is %d\n", nextNumber, square);

            // now we move on to the next number to square -- this is a 
            // shorthand notation for
            // nextNumber = nextNumber + 1;
            nextNumber++;

            // compute the new square
            square = nextNumber * nextNumber;

            // and at the end of the body of the while loop, Java will
            // return back to the top and re-test the condition to see
            // if we need to go around again.
        }

        // if we got here, the loop is over.  We'll print a message so we can
        // see this.
        System.out.println("No further perfect squares that do not exceed " + limit);
    }
}
