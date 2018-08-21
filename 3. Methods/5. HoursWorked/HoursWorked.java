/**
 * Example HoursWorked: another method example, and using
 * a Scanner on a String
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HoursWorked {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (new File("hours.dat"));
        // read the entire line to be parsed by processLine
        while (input.hasNextLine()) {
            String text = input.nextLine();
            processLine(text);
        }
    }

    // process the line for one employee with the format:
    // ID Name hours hours hours ...
    public static void processLine (String text) {
        // create a Scanner to parse the String
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