/*
 * Example NumberInfo: a method that takes a parameter
 */

import java.util.Random;

public class NumberInfo {

    // a method to take an int as a parameter and print the number,
    // its square, and its square root
    public static void showNumberInfo(int num) {

        // within this method, num acts like a local variable
        // that is initialized to whatever is passed in the
        // parentheses when we call it
        System.out.println(num + " squared is " + (num * num) +
            " and its square root is " + Math.sqrt(num));
    }

    public static void main(String[] args) {

        // we'll use some random numbers
        Random randGen = new Random();

        // call the method, this time setting the num parameter to 2
        showNumberInfo(2);

        // now, call the method 6 times, with the numbers 5 through 10
        for (int number = 5; number <= 10; number++) {
            showNumberInfo(number);
        }

        // call it 5 more times, with random numbers in the 0-99 range
        for (int index = 1; index <= 5; index++) {
            int randomNumber = randGen.nextInt(100);
            showNumberInfo(randomNumber);
        }
    }
}