/*
 * Example CSOfficesSwitch: output which of the Saint Rose CS faculty
 * members occupies one of the offices in the AH 400 suite.
 */

import java.util.Scanner;

public class CSOfficesSwitch {

    public static void main(String[] args) {
        // we'll need a Scanner for the keyboard
        Scanner kbd = new Scanner(System.in);

        // let's get the office number
        System.out.print("Which office in AH 400? (1-8): ");
        int office = kbd.nextInt();

        // set the String faculty to the name of the occupant of that
        // office.  We need to set it to something initially so Java
        // doesn't get concerned that the variable has no value in the
        // case when an invalid office number is entered.

        String faculty = null;
        switch (office) {
            case 1:
            faculty = "Mark Gilder";
            break;
            
            case 2:
            faculty = "Jim Teresco";
            break;
            
            case 3:
            faculty = "Helen Albanese";
            break;
            
            case 4:
            faculty = "John Avitable";
            break;
            
            case 5:
            faculty = "Dee Gudmundsen";
            break;
            
            case 6:
            faculty = "Nancy Lawson";
            break;
            
            case 7:
            faculty = "Ian MacDonald";
            break;
            
            case 8:
            faculty = "Judy O'Rourke";
            break;
            
            default:
            // this is our error condition.
            System.out.println("Albertus 400-" + office + 
                " is not a valid CS faculty office number");
            System.exit(1);
        }

        // If we got here, faculty has been set to someone's name, 
        //so let's print the answer.
        System.out.println("Albertus 400-" + office + " is the home away from" 
            + " home for " + faculty + ".");

    }
}