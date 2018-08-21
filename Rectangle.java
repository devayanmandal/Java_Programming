import java.util.Scanner;

public class Rectangle {
    public static void main (String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the rectangle's length: ");     
        int length = input.nextInt();
        
        System.out.print("Please enter the rectangle's width: ");
        int width = input.nextInt();
        
        int area = length * width;
        int perimeter = 2*length + 2*width;
        
        System.out.println("\nThe rectangle's area is " + area + " square units and the perimeter is " + perimeter + " units.");
    }
}