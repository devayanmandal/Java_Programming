/*
 * Example AddNumbersFromFileSentinel: read in a sequence of numbers
 * from a file, adding them up, until the sentinel value of 0 is read.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddNumbersFromFileSentinel {

    public static void main(String[] args) throws IOException {

        // construct a Scanner that will read from a file
        // instead of the keyboard.
        Scanner fromFile = new Scanner(new File("numbers"));

        // set up our running total for the sum of the numbers
        int sum = 0;

        // variable for the next number to add
        int number = 0;
        
        // loop to read in numbers until 0 is encountered
        do {
            // once we get here, there is no difference in how we use the Scanner
            // compared to what we did with keyboard Scanners.
            number = fromFile.nextInt();
            sum += number;
        } while (number != 0);

        // unlike the keyboard Scanners, we should close file Scanners
        fromFile.close();

        System.out.println("Sum of numbers: " + sum);
    }
}