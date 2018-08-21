/*
 * Example MassPikeTollsBetter: program to determine whether a vehicle will
 * pay a toll on a given segment of the ticket-controlled portion of 
 * the Massachusetts Turnpike.  Before the "Big Dig", there were tolls
 * for all vehicles along the entire road, but western Mass. was exempted
 * from car tolls.  The ticket-controlled portion extends from Exit 1 in 
 * Stockbridge to Exit 15 at I-95 outside of Boston. Trucks always pay
 * tolls, but cars pay tolls only on the part between exits 6 and 15.
 * Given an entry interchange, and exit interchange, and a vehicle type
 * (motorcycle, car, or truck), determine whether there will be a toll
 * on the entire distance travelled, part of the distance travelled, or
 * if there will be no toll.
 *
 * This version includes loops to ensure that valid inputs are given
 * rather than just exiting.
 */

import javax.swing.JOptionPane;

public class MassPikeTollsBetter {

    public static void main(String[] args) {

        // we start out by gathering the information we need as inputs
        String input;

        // get the entry interchange
        // we start by setting an intentionally invalid value for the 
        // entryInterchange to make sure we get into the loop once
        int entryInterchange = 0;

        while (entryInterchange < 1 || entryInterchange > 15) {
            input = JOptionPane.showInputDialog("At what interchange did you enter the Mass Pike (1-15)?");
            entryInterchange = Integer.parseInt(input);

            // make sure it's valid
            if (entryInterchange < 1 || entryInterchange > 15) {
                JOptionPane.showMessageDialog(null, "Entry interchange must be in the range 1-15!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // get the exit interchange
        int exitInterchange = 0;

        while (exitInterchange < 1 || exitInterchange > 15 || entryInterchange == exitInterchange) {
            input = JOptionPane.showInputDialog("At what interchange did you exit the Mass Pike (1-15)?");
            exitInterchange = Integer.parseInt(input);

            // make sure this one is valid as well
            if (exitInterchange < 1 || exitInterchange > 15) {
                JOptionPane.showMessageDialog(null, "Exit interchange must be in the range 1-15!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }

            // one more check on the input: no one should be allowed to enter
            // and exit at the same interchange
            if (entryInterchange == exitInterchange) {
                JOptionPane.showMessageDialog(null, "Entry interchange and exit interchange must be different\n(No U Turns!)", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // loop-based error checking is a bit more complex here -- so we set a boolean
        // variable to false to start, and only set it to true when we get a valid 
        // input
        boolean goodResponse = false;

        // we also need to declare isTruck before we get into the loop, since a declaration
        // inside the loop will result in the scope being limited to the loop body
        boolean isTruck = false;
        
        while (!goodResponse) {
            input = JOptionPane.showInputDialog("Were you in a motorcycle, a car, or a truck?");

            // now make sure we got a valid response and set a boolean variable to true
            // only if it was a truck.
            if (input.equals("truck")) {
                isTruck = true;
                goodResponse = true;
            }
            else if (input.equals("car")) {
                isTruck = false;
                goodResponse = true;
            }
            else if (input.equals("motorcycle")) {
                isTruck = false;
                goodResponse = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid vehicle type!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // now we report on whether there is a toll based on this input
        if (isTruck || ((entryInterchange >= 6) && (exitInterchange >= 6))) {
            JOptionPane.showMessageDialog(null, "You paid a toll on the entire trip...");
        }
        else if ((entryInterchange <= 6) && (exitInterchange <= 6)) {
            JOptionPane.showMessageDialog(null, "No tolls for you in western Mass!");
        }
        else {
            JOptionPane.showMessageDialog(null, "You paid a toll, but only for travels east of Exit 6");
        }
    }
}
