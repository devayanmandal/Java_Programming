import java.util.Scanner;

public class RunsScored{
    public static void main(String[] args){
        final int NUMBER_OF_INNINGS = 9; //named constant
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the home team's name: "); //Home team's name
        String homeTeamName = input.next();
        
        System.out.print("Please enter the home team's score: "); //Home team's score
        int homeTeamScore = input.nextInt();
        
        System.out.print("\nPlease enter the visiting team's name: "); //Visiting team's name
        String visitingTeamName = input.next();
        
        System.out.print("Please enter the visiting team's score: "); //Visiting team's score
        int visitingTeamScore = input.nextInt();
        
        System.out.print("\nThe total score for both teams is: " + (homeTeamScore + visitingTeamScore)); //total score
        
        double averageScorePerInnings = (homeTeamScore + visitingTeamScore) / (1.0*NUMBER_OF_INNINGS); //average score per innings
        System.out.print("\nThe average score per innings is: " + averageScorePerInnings);
        
        //mixed number; whole number, fracRuns
        int wholeRuns = (homeTeamScore + visitingTeamScore) / NUMBER_OF_INNINGS;
        int fracRuns = (homeTeamScore + visitingTeamScore) % NUMBER_OF_INNINGS;
        
        System.out.print(wholeRuns + " " + fracRuns);
    }
}