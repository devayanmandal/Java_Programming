import java.math.BigInteger;
import java.util.Scanner;

/*
 * Example Powers: examples of recursive methods to compute
 * powers of a number.
 *
 * Updated to use long for exponents and BigIntegers for base and answer
 * values to be able to compute much larger problem sizes.
 */

public class Powers {

    // a main method to try out our power-computing methods below
    public static void main(String args[]) {

        // read in the base and exponent from a Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Let's compute the value of some integer raised to a power.");
        System.out.print("First, enter the base: ");
        long base = s.nextLong();
        long exponent = 0L;
        do {
            System.out.print("Next, enter the exponent (>=0): ");
            exponent = s.nextLong();
            if (exponent < 0L) {
                System.out.println("Negative exponents are not allowed");
            }
        } while (exponent < 0L);

        // now we compute in three different ways, using the methods below.

        System.out.println("" + base + "^" + exponent + ", computed three ways:");
        System.out.println("Method using a loop: " + loopPower(BigInteger.valueOf(base), exponent));
        System.out.println("Method using straightforward recursion: " + recPower(BigInteger.valueOf(base), exponent));
        System.out.println("Method using smarter recursion: " + fastRecPower(BigInteger.valueOf(base), exponent));
    }

    // compute the power using a good old fashioned loop
    public static BigInteger loopPower(BigInteger base, long exponent) {

        BigInteger answer = BigInteger.ONE;
        for (long i=0; i<exponent; i++) {
            answer = answer.multiply(base);
        }
        return answer;
    }

    // the straightforward recursive approach
    public static BigInteger recPower(BigInteger base, long exponent) {

        // our base case is exponent == 0
        if (exponent == 0L) {
            return BigInteger.ONE;
        }

        // otherwise, we have to do some work, b^n = b * b^{n-1}
        return base.multiply(recPower(base, exponent-1L));
    }

    // a more efficient recursive approach, based on the idea
    // that we can compute a power b^{2n} as (b*b)^n
    public static BigInteger fastRecPower(BigInteger base, long exponent) {

        // base case is again exponent == 0
        if (exponent == 0L) {
            return BigInteger.ONE;
        }

        // now, see if the exponent is even or odd
        if (exponent % 2L == 1L) {
            // it's odd, so use straightforward recursion to get
            // down to an even case
            return base.multiply(fastRecPower(base, exponent-1L));
        }

        // if we got here, it's even, so we can do better
        return fastRecPower(base.multiply(base), exponent/2L);
    }
}