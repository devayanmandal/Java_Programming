/*
 * Example Sum1ToNRec: computing a sum with a simple recursive method
 */

public class Sum1ToNRec {

    // a recursive version of the sumNumbersTo method
    public static int sumNumbersTo(int limit) {

        // first, we check for the base case
        if (limit == 1) return 1;

        // otherwise, we have to make a recursive method call to compute the
        // sum of the first limit-1 numbers, then add in limit to get our answer
        return sumNumbersTo(limit - 1) + limit;
    }

    public static void main(String[] args) {

        // for this example, we will just print out a few of these sums
        int firstSum = sumNumbersTo(10);
        System.out.println("The sum of the numbers 1-10 is " + firstSum);

        int secondSum = sumNumbersTo(82);
        System.out.println("The sum of the numbers 1-82 is " + secondSum);

        // we skip this case, since it leads to an error: a stack overflow!
        // more on this later.
        //int thirdSum = sumNumbersTo(96352);
        //System.out.println("The sum of the numbers 1-96352 is " + thirdSum);

        // or we can use this within a loop
        for (int number = 1; number <= 9; number++) {
            // and we can use the value as part of a printout or any other expression
            // if we do not want or need to save it in a variable
            System.out.println("The sum of the numbers 1-" + number + 
                " is " + sumNumbersTo(number));
        }
    }
}