/**
 * Example HoursWorked2: another method example, and using
 * a Scanner on a String, this time passing the Scanner as a parameter
 * instead of the String
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HoursWorked2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (new File("hours.dat"));
        // pass the Scanner to the method to process one line
        // at a time
        while (input.hasNextLine()) {
            readAndProcessLine(input);
        }
    }

    // read in and process the line for one employee with the format:
    // ID Name hours hours hours ...
    public static void readAndProcessLine (Scanner s) {
        
        String text = s.nextLine();
        // create a Scanner to parse the next line
        Scanner data = new Scanner(text);
        // we know the String contains an int
        int id = data.nextInt();
        // then a String
        String name = data.next();
        double sum = 0.0;
        // then a series of doubles
        while (data.hasNextDouble()) {
            sum += data.nextDouble();
        }
        System.out.println("Total hours worked by " + name + 
            " (id #" + id + ") = " + sum);
    }
}