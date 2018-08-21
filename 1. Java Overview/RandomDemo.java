/*
 * Example RandomDemo
 */

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        
        final int NUM_OF_EACH = 5;
        
        // to use random numbers in Java, we first create an object
        // that is capable of generating random values
        Random randomGenerator = new Random();
        
        // we will first print random integers with no restriction
        // this means we will get numbers between about -2.1 billion and
        // +2.1 billion (-2^31 and + 2^31)
        for (int count = 0; count < NUM_OF_EACH; count++) {
            System.out.println("A random integer: " + randomGenerator.nextInt());
        }
        
        // we will next print random numbers from 0 to 10
        for (int count = 0; count < NUM_OF_EACH; count++) {
            System.out.println("A random integer between 0 and 10: " + randomGenerator.nextInt(11));
        }
        
        // next, 10 random numbers from 1 to 100
        for (int count = 0; count < NUM_OF_EACH; count++) {
            System.out.println("A random integer between 1 and 100: " + (randomGenerator.nextInt(100)+1));
        }
        
        // we can also get double values in the range 0.0 to 1.0
        for (int count = 0; count < NUM_OF_EACH; count++) {
            System.out.println("A random floating point value between 0.0 and 1.0: " + 
                randomGenerator.nextDouble());
        }
        
        // how about double values in the range 0.0 to 10.0?
        for (int count = 0; count < NUM_OF_EACH; count++) {
            System.out.println("A random floating point value between 0.0 and 10.0: " +
                (10.0 * randomGenerator.nextDouble()));
        }
    }
}
