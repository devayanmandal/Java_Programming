/*
 * Example LittlePrimes: print whether a small number (1-10) is prime or composite.
 * Demonstrates multiple cases performing the same code in a switch statement.
 */

import java.util.Scanner;

public class LittlePrimes {

    public static void main(String[] args) {

        // we'll read in a number with a Scanner
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number 1-10: ");
        int number = kbd.nextInt();

        switch (number) {
            case 1:
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println(number + " is composite.");
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println(number + " is prime.");
                break;
            default:
                System.out.println(number + " is out of the allowed range (1-10)");
                break;
        }

    }
}