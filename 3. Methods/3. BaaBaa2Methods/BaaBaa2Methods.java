/*
 * Example BaaBaa2Methods: move all of the work into 2 methods,
 * including that which is only called once.
 */

public class BaaBaa2Methods {

    // a method to perform the 4 println statements that 
    // were being repeated in the BaaBaaBad version
    public static void refrain() {

        System.out.println("Baa, baa, black sheep,");
        System.out.println("Have you any wool?");
        System.out.println("Yes sir, yes sir,");
        System.out.println("Three bags full.");

    }

    // this method is just for readability -- we call it
    // just once, but it simplifies our main method
    public static void verse() {

        System.out.println("One for the master,");
        System.out.println("One for the dame,");
        System.out.println("And one for the little boy");
        System.out.println("Who lives down the lane.");
    } 

    // the main method is still where our program will begin
    // executing, even though there is now an additional 
    // method defined within our class    
    public static void main(String[] args) {

        // we replace the println statements here
        // calls that each print a refrain or the verse
        refrain();
        verse();
        refrain();
    }
}