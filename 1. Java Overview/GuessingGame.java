/*
 * Example GuessingGame: I'm thinking of a number 1 to 100
 * guessing game
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        final int MAX_NUMBER = 100;
        
        Scanner keyboard = new Scanner(System.in);
        Random gen = new Random();
        
        // intro message
        System.out.println("I'm thinking of a number 1 to " + MAX_NUMBER + ".  Guess it!");
        
        // pick our random answer
        int answer = gen.nextInt(MAX_NUMBER) + 1;
        // and a place to keep our guesses
        int guess;
        // keep track of the number of guesses
        int numberOfGuesses = 0;
        
        do {
            
            // read in the next guess
            System.out.print("Next guess? ");
            guess = keyboard.nextInt();
            
            numberOfGuesses++;
            
            // see if it's higher or lower
            if (answer < guess) {
                System.out.println("Lower!");
            }
            else if (answer > guess) {
                System.out.println("Higher!");
            }
        } while (answer != guess);
        
        System.out.println("You got it!  It took you " + numberOfGuesses + " guesses.");
    }
}
