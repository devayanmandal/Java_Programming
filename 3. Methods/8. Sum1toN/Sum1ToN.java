/*
 * Example Sum1ToN - a method that returns the sum of the integer
 * values from 1 to a given number
 */

public class Sum1ToN {

    // our method looks like the ones we had before, except this
    // one now returns an int
    public static int sumNumbersTo(int limit) {

        // first, we accumulate a sum just like we would any other time
        int sum = 0;
        for (int number = 1; number <= limit; number++) {
            sum += number;
        }

        // but instead of using the sum in a printout or as part of some
        // subsequent computation we "return" it to whoever asked us to
        // compute this sum
        return sum;
    }

    public static void main(String[] args) {

        // for this example, we will just print out a few of these sums
        int firstSum = sumNumbersTo(10);
        System.out.println("The sum of the numbers 1-10 is " + firstSum);

        int secondSum = sumNumbersTo(82);
        System.out.println("The sum of the numbers 1-82 is " + secondSum);

        int thirdSum = sumNumbersTo(96352);
        System.out.println("The sum of the numbers 1-96352 is " + thirdSum);

        // or we can use this within a loop
        for (int number = 1; number <= 9; number++) {
            // and we can use the value as part of a printout or any other expression
            // if we do not want or need to save it in a variable
            System.out.println("The sum of the numbers 1-" + number + 
                " is " + sumNumbersTo(number));
        }
    }
}