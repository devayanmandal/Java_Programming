/*
 * Example BaaBaaBetter: using a simple method to eliminate some
 * repeated code (refrain lyrics).
 * 
 * Note: Methods created after the main method, are still called correctly when
 * placed inside the main method
 */

public class BaaBaaBetter {

    // a method to perform the 4 println statements that 
    // were being repeated in the BaaBaaBad version
    public static void refrain() {

        System.out.println("Baa, baa, black sheep,");
        System.out.println("Have you any wool?");
        System.out.println("Yes sir, yes sir,");
        System.out.println("Three bags full.");

    }

    // the main method is still where our program will begin
    // executing, even though there is now an additional 
    // method defined within our class    
    public static void main(String[] args) {

        // we replace the 4 println statements here
        // and below with a single method call!
        refrain();

        // this part was not repeated, so we do not place it
        // into a method (though we could if we wanted to 
        // simplify the main method
        System.out.println("One for the master,");
        System.out.println("One for the dame,");
        System.out.println("And one for the little boy");
        System.out.println("Who lives down the lane.");

        // our second call to the refrain - now the only
        // repeated code here is the method call itself,
        // much more manageable than the 4 println
        // statements
        refrain();
    }
}