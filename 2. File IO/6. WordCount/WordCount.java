/*
 * Example WordCount: count the number of words in an input file
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws IOException {

        // create a keyboard Scanner to read in an input file name
        Scanner keyboard = new Scanner(System.in);

        // read in the input file
        System.out.print("Name of file for word count: ");
        String fileName = keyboard.next();

        // now, we'll create a Scanner on that file
        Scanner file = new Scanner(new File(fileName));

        // keep track of the number of words
        int wordCount = 0;

        // the hasNext function will tell us if more words are
        // available on the input
        while (file.hasNext()) {
            file.next();
            wordCount++;
        }

        file.close();
        System.out.println("The file contained " + wordCount + " words.");
    }
}
