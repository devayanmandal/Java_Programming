import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CircleAreas1 {
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a desired file a name: ");
        String fileName = input.next();

        PrintWriter output = new PrintWriter(new File(fileName));

        output.print("\tRadius and calculated Circle area: \n\n");

        System.out.println("Enter values of radius, end with 0 or -ve number: ");

        double radius;
        do {
            radius = input.nextDouble();

            output.printf("Radius of %.2f units gives Area of %.2f sq"
                + " units\n", radius, (Math.PI * radius * radius));
        } while (radius > 0.0);

        output.close();
    }
}