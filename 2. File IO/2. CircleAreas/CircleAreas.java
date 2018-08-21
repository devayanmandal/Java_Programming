/*
 * Example CircleAreas: a program that reads in a series of numbers,
 * ending in a negative or 0 value, and prints the results to a given file.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CircleAreas {
    public static void main(String[] args) throws IOException {
        
        // first, a Scanner to be used to read in a file name
        // and the series of numbers from the keyboard.
        Scanner keyboard = new Scanner(System.in);
        
        // next, we read the file name
        System.out.print("Enter the file name to use to store results: ");
        String fileName = keyboard.next();
        
        // now we are ready to open our file for writing
        PrintWriter outFile = new PrintWriter(new File(fileName));
        
        // next, we will loop until we get a 0
        double radius;
        do {
            System.out.print("Enter the radius of the next circle: ");
            radius = keyboard.nextDouble();
            
            if (radius > 0.0) {
                outFile.printf("%.2f %.2f\n", radius, (Math.PI * radius * radius));
            }
        } while (radius > 0.0);
        
        outFile.close();
    }
}