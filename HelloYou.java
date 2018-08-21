import java.util.Scanner;

public class HelloYou {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        
        String name = input.next();
        System.out.println("\n\nHello " + name + "!");
    }
}