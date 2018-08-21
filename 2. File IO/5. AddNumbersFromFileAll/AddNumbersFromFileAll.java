/*
 * Example AddNumbersFromFileAll: read in and add up all of the numbers in
 * a file.  Continue until there are no more numbers to be read
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddNumbersFromFileAll {

    public static void main(String[] args) throws IOException {

        // construct a Scanner that will read from a file
        // instead of the keyboard.
        Scanner fromFile = new Scanner(new File("numbers"));

        // set up our running total for the sum of the numbers
        int sum = 0;
        
        // loop to read in numbers as long as more numbers are available on the input -
        // the hasNextInt method will tell us if there is another int value available
        // to be read by the Scanner
        while (fromFile.hasNextInt()) {
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
