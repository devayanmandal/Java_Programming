/*
 * Example MassPikeTolls: program to determine whether a vehicle will
 * pay a toll on a given segment of the ticket-controlled portion of 
 * the Massachusetts Turnpike.  Before the "Big Dig", there were tolls
 * for all vehicles along the entire road, but western Mass. was exempted
 * from car tolls.  The ticket-controlled portion extends from Exit 1 in 
 * Stockbridge to Exit 15 at I-95 outside of Boston.  Trucks always pay
 * tolls, but cars pay tolls only on the part between exits 6 and 15.
 * Given an entry interchange, and exit interchange, and a vehicle type
 * (motorcycle, car, or truck), determine whether there will be a toll
 * on the entire distance travelled, part of the distance travelled, or
 * if there will be no toll.
 */

import javax.swing.JOptionPane;

public class MassPikeTolls {

    public static void main(String[] args) {

        // we start out by gathering the information we need as inputs
        String input;

        // get the entry interchange
        input = JOptionPane.showInputDialog("At what interchange did you enter the Mass Pike (1-15)?");
        int entryInterchange = Integer.parseInt(input);

        // make sure it's valid
        if (entryInterchange < 1 || entryInterchange > 15) {
            JOptionPane.showMessageDialog(null, "Entry interchange must be in the range 1-15!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // get the exit interchange
        input = JOptionPane.showInputDialog("At what interchange did you exit the Mass Pike (1-15)?");
        int exitInterchange = Integer.parseInt(input);

        // make sure this one is valid as well
        if (exitInterchange < 1 || exitInterchange > 15) {
            JOptionPane.showMessageDialog(null, "Exit interchange must be in the range 1-15!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // one more check on the input: no one should be allowed to enter
        // and exit at the same interchange
        if (entryInterchange == exitInterchange) {
            JOptionPane.showMessageDialog(null, "Entry interchange and exit interchange must be different\n(No U Turns!)", 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        input = JOptionPane.showInputDialog("Were you in a motorcycle, a car, or a truck?");
        boolean isTruck = false;
        // now make sure we got a valid response and set a boolean variable to true
        // only if it was a truck.
        if (input.equals("truck")) {
            isTruck = true;
        }
        else if (input.equals("car")) {
            isTruck = false;
        }
        else if (input.equals("motorcycle")) {
            isTruck = false;
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid vehicle type!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
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