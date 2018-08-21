import java.util.Scanner;

public class Sum2ToNBy2A {
    public static void main (String [] args) {
        System.out.print("Enter the upper limit for the value of the sum: ");

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt(); //17

        int total = 0;
        int num = 0;

        if (limit > 0) {
            
            if (num % 2 = 0) {
                
                for (num = 0; num > 0 ;num++) {
                    total += num;                    
                }
                
            } else {
               System.out.println("Even numbers only.");             
            }
            
        } else {
            System.out.println("Positive values only.");
        }
    }
}