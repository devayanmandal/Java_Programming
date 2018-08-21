import java.math.BigInteger;
import java.util.Scanner;

public class Powers1 {

    public static void main(String args[]) {

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
        
        System.out.println("" + base + "^" + exponent + ", computed three ways:");
        System.out.println("Method using a loop: " + loopPower(BigInteger.valueOf(base), exponent));
        System.out.println("Method using straightforward recursion: " + recPower(BigInteger.valueOf(base), exponent));
        System.out.println("Method using smarter recursion: " + fastRecPower(BigInteger.valueOf(base), exponent));
    }

    public static BigInteger loopPower(BigInteger base, long exponent) {
        
        BigInteger answer = BigInteger.ONE;
        for (long i=0; i<exponent; i++) {
            answer = answer.multiply(base);
        }
        return answer;
    }

    public static BigInteger recPower(BigInteger base, long exponent) {

        if (exponent == 0L) {
            return BigInteger.ONE;
        }

        return base.multiply(recPower(base, exponent-1L));
    }
    
    public static BigInteger fastRecPower(BigInteger base, long exponent) {

        if (exponent == 0L) {
            return BigInteger.ONE;
        }

        if (exponent % 2L == 1L) {

            return base.multiply(fastRecPower(base, exponent-1L));
        }

        return fastRecPower(base.multiply(base), exponent/2L);
    }
}