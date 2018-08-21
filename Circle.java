import java.util.Scanner;

public class Circle {
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the circle's radius: ");
        double radius = input.nextDouble();
        
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        
        System.out.println("\nThe circle's area is " + area + " square units and the perimeter is " + perimeter + " units.");
    }
}