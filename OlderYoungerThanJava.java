import java.util.Scanner;

public class OlderYoungerThanJava {
    public static void main (String[] args){
        final int PRESENT_YEAR = 2015;
        final int JAVA_BIRTH_YEAR = 1995;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the individual's year of birth: ");
        int individualBirthYear = input.nextInt();
        
        System.out.print("\nThe individual's age is:  " + ((PRESENT_YEAR) - individualBirthYear));
        
        if ((JAVA_BIRTH_YEAR) > individualBirthYear){
            System.out.print("\nThe individual is older than Java.");
        } else {
            System.out.print("\nThe individual is younger than Java.");
        }
    }
}
