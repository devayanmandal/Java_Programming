/*
 * Example Shout: convert a file to all upper case
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Shout {

    public static void main(String[] args) throws IOException {
        
        // Create a regular Scanner for file name inputs
        Scanner keyboard = new Scanner(System.in);
        
        // read in the input and output filenames
        System.out.print("Input file name? ");
        String inFileName = keyboard.next();
        
        System.out.print("Output file name? ");
        String outFileName = keyboard.next();
        
        // create our file Scanner and PrintWriter
        Scanner input = new Scanner(new File(inFileName));
        PrintWriter output = new PrintWriter(new File(outFileName));
        
        // read in the file, line by line, printing out an
        // upcased version (SHOUTING!)
        // we can continue as long as there are more lines in the file
        while (input.hasNextLine()) {
            String line = input.nextLine();
            // we can get an uppercased version of any String by
            // calling toUpperCase.  So let's.
            output.println(line.toUpperCase());
        }
        
        // close our files before we wrap up
        input.close();
        output.close();
    }
}
