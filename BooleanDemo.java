/*
 * Example BooleanDemo: demonstrate a variety of constructs related
 * to boolean (true/false) data
 */

import java.util.Scanner;

public class BooleanDemo {

    public static void main(String[] args) {

        // construct a Scanner for keyboard input
        Scanner input = new Scanner(System.in);

        // read in 3 numbers that will be used in subsequent comparisons
        System.out.print("Enter 3 integer values: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.println("Using x=" + x + ", y=" + y + ", z=" + z);

        // demonstrate the basic arithmetic comparisons, note that we can
        // print out the result of comparison operator
        System.out.println("x == y is " + (x==y));  // is x equal to y?
        System.out.println("x != y is " + (x!=y));  // not equal
        System.out.println("x < y is " + (x<y));
        System.out.println("x > y is " + (x>y));
        System.out.println("x <= y is " + (x<=y));
        System.out.println("x >= y is " + (x>=y));

        // boolean logical operators
        System.out.println("!(x < y) is " + !
        (x<y)); // not x<y
        // logical and -- both must be true for result to be true
        System.out.println("(x < y) && (y < z) is " + ((x < y) && (y < z)));
        // logical or -- both must be false for result to be false
        System.out.println("(x < y) || (y < z) is " + ((x < y) || (y < z)));
        
        // we can also declare boolean variables to hold true/false values
        boolean haveNegative = (x < 0) || (y < 0) || (z < 0);
        System.out.println("haveNegative is " + haveNegative);
        
        boolean allNegative = (x < 0) && (y < 0) && (z < 0);
        System.out.println("allNegative is " + allNegative);
        
        boolean allSame = (x == y) && (y == z);
        System.out.println("allSame is " + allSame);
        
        // we can use these boolean variables anywhere we would have a
        // boolean expression
        System.out.println("allNegative && allSame is " + (allNegative && allSame));
        
        // and we can combine these operators: && happens before ||
        System.out.println("(x < 0) && (y < 0) || (z < 0) is " + ((x < 0) && (y < 0) || (z < 0)));
        System.out.println("(x < 0) || (y < 0) && (z < 0) is " + ((x < 0) || (y < 0) && (z < 0)));
        System.out.println("((x < 0) || (y < 0)) && (z < 0) is " + (((x < 0) || (y < 0)) && (z < 0)));
        
    }
}
