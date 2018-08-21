/*
 * Example GradingBreakdown -- compute averages based on a grading breakdown,
 * prompt for actual grade values for each category, then
 * compute and report a final average
 *
 * This version uses a method to read and error check keyboard inputs
 */

import java.util.Scanner;

public class GradingBreakdownBetter {

    // method to perform a more general error checked input
    // this will repeatedly prompt for and read in values
    // until one in the proper range is encountered, at which
    // point it will return that value.
    
    // we need the Scanner, since the main method creates our keyboard Scanner
    // and it will be needed in this method, so it becomes a parameter
    // we send a String called "gradeCategory" that we will use as part of the
    // prompt we issue so the person knows which category to use
    // and we send the max value of the input for error checking
    
    // once a valid answer is read it, it is returned, so our method returns
    // a double value
    public static double readValidInput(Scanner s, String gradeCategory, double maxVal) {

        // we will call our result the more generic "answer" since we don't know
        // which category we are reading
        double answer = 0.0;
        do {
            System.out.print("How many " + gradeCategory + " points did you earn (total available: " +
                maxVal + ")? ");
            answer = s.nextDouble();
            if ((answer < 0.0) || (answer > maxVal)) {
                System.out.println("Response must be in the range 0.0 to " + maxVal + "!");
            }
        } while ((answer < 0.0) || (answer > maxVal));
     
        return answer;
    }

    public static void main(String[] args) {

        // constants for the points and percentages for each grade component
        final double LA_POINTS = 150;
        final double LA_PERCENTAGE = 5;

        final double LAB_POINTS = 305;
        final double LAB_PERCENTAGE = 10;

        final double PROJECT_POINTS = 200;
        final double PROJECT_PERCENTAGE = 15;

        final double EXAM1_POINTS = 75;
        final double EXAM1_PERCENTAGE = 20;

        final double EXAM2_POINTS = 75;
        final double EXAM2_PERCENTAGE = 25;

        final double FINAL_POINTS = 100;
        final double FINAL_PERCENTAGE = 25;

        System.out.println("This program will help you determine your course average.");
        System.out.println("Please enter your raw scores for each grading category when prompted.");

        // create a keyboard Scanner
        Scanner keyboard = new Scanner(System.in);

        // accumulate total grade here
        double overallGradeEarned = 0.0;

        // lecture assignments:
        // read in and error check number of LA points
        double laPointsEarned = readValidInput(keyboard, "lecture assignment", LA_POINTS);

        // compute contribution to total grade for lecture assignments
        double laGradeEarned = laPointsEarned / LA_POINTS * LA_PERCENTAGE;
        overallGradeEarned += laGradeEarned;

        System.out.println("Earned " + laGradeEarned + " grade points out of " + LA_PERCENTAGE + " possible.");

        // lab assignments:
        // read in and error check number of lab points
        double labPointsEarned = readValidInput(keyboard, "lab", LAB_POINTS);

        // compute contribution to total grade for lab assignments
        double labGradeEarned = labPointsEarned / LAB_POINTS * LAB_PERCENTAGE;
        overallGradeEarned += labGradeEarned;

        System.out.println("Earned " + labGradeEarned + " grade points out of " + LAB_PERCENTAGE + " possible.");
    
        // project assignments:
        // read in and error check number of project points
        double projectPointsEarned = readValidInput(keyboard, "project", PROJECT_POINTS);

        // compute contribution to total grade for project assignments
        double projectGradeEarned = projectPointsEarned / PROJECT_POINTS * PROJECT_PERCENTAGE;
        overallGradeEarned += projectGradeEarned;

        System.out.println("Earned " + projectGradeEarned + " grade points out of " + PROJECT_PERCENTAGE + " possible.");


        // exam 1:
        // read in and error check number of exam1 points
        double exam1PointsEarned = readValidInput(keyboard, "exam 1", EXAM1_POINTS);

        // compute contribution to total grade for exam 1
        double exam1GradeEarned = exam1PointsEarned / EXAM1_POINTS * EXAM1_PERCENTAGE;
        overallGradeEarned += exam1GradeEarned;

        System.out.println("Earned " + exam1GradeEarned + " grade points out of " + EXAM1_PERCENTAGE + " possible.");

         // exam 2:
        // read in and error check number of exam2 points
        double exam2PointsEarned = readValidInput(keyboard, "exam 2", EXAM2_POINTS);

        // compute contribution to total grade for exam 2
        double exam2GradeEarned = exam2PointsEarned / EXAM2_POINTS * EXAM2_PERCENTAGE;
        overallGradeEarned += exam2GradeEarned;

        System.out.println("Earned " + exam2GradeEarned + " grade points out of " + EXAM2_PERCENTAGE + " possible.");
   
        // final exam:
        // read in and error check number of final points
        double finalPointsEarned = readValidInput(keyboard, "final", FINAL_POINTS);

        // compute contribution to total grade for final exam
        double finalGradeEarned = finalPointsEarned / FINAL_POINTS * FINAL_PERCENTAGE;
        overallGradeEarned += finalGradeEarned;

        System.out.println("Earned " + finalGradeEarned + " grade points out of " + FINAL_PERCENTAGE + " possible.");
    
        // now, we are ready to report an overall average
        System.out.println("Your overall course average is " + overallGradeEarned + ".");
    }

}