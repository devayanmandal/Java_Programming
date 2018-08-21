/*
 * Example AddNumbersFromFile: demonstration of reading
 * input from a file.  In this one, we assume there are
 * exactly 10 numbers in the file.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddNumbersFromFile {

    public static void main(String[] args) throws IOException {

        final int NUM_NUMBERS = 10;

        // construct a Scanner that will read from a file
        // instead of the keyboard.
        Scanner fromFile = new Scanner(new File("numbers"));

        // set up our running total for the sum of the numbers
        int sum = 0;

        // loop to read in NUM_NUMBERS numbers
        for (int i = 0; i < NUM_NUMBERS; i++) {
            // once we get here, there is no difference in how we use the Scanner
            // compared to what we did with keyboard Scanners.
            int number = fromFile.nextInt();
            sum += number;
        }
        
        // unlike the keyboard Scanners, we should close file Scanners
        fromFile.close();

        System.out.println("Sum of numbers: " + sum);
    }
}
