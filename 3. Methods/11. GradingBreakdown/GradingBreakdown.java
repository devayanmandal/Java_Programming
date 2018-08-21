/*
 * Example GradingBreakdown -- compute averages based on a grading breakdown,
 * prompt for actual grade values for each category, then
 * compute and report a final average
 */

import java.util.Scanner;

public class GradingBreakdown {

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
        double laPointsEarned = 0.0;
        do {
            System.out.print("How many lecture assignment points did you earn (total available: " +
                LA_POINTS + ")? ");
            laPointsEarned = keyboard.nextDouble();
            if ((laPointsEarned < 0.0) || (laPointsEarned > LA_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + LA_POINTS + "!");
            }
        } while ((laPointsEarned < 0.0) || (laPointsEarned > LA_POINTS));

        // compute contribution to total grade for lecture assignments
        double laGradeEarned = laPointsEarned / LA_POINTS * LA_PERCENTAGE;
        overallGradeEarned += laGradeEarned;

        System.out.println("Earned " + laGradeEarned + " grade points out of " + LA_PERCENTAGE + " possible.");

        // lab assignments:
        // read in and error check number of lab points
        double labPointsEarned = 0.0;
        do {
            System.out.print("How many lab points did you earn (total available: " +
                LAB_POINTS + ")? ");
            labPointsEarned = keyboard.nextDouble();
            if ((labPointsEarned < 0.0) || (labPointsEarned > LAB_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + LAB_POINTS + "!");
            }
        } while ((labPointsEarned < 0.0) || (labPointsEarned > LAB_POINTS));

        // compute contribution to total grade for lab assignments
        double labGradeEarned = labPointsEarned / LAB_POINTS * LAB_PERCENTAGE;
        overallGradeEarned += labGradeEarned;

        System.out.println("Earned " + labGradeEarned + " grade points out of " + LAB_PERCENTAGE + " possible.");
    
        // project assignments:
        // read in and error check number of project points
        double projectPointsEarned = 0.0;
        do {
            System.out.print("How many project points did you earn (total available: " +
                PROJECT_POINTS + ")? ");
            projectPointsEarned = keyboard.nextDouble();
            if ((projectPointsEarned < 0.0) || (projectPointsEarned > PROJECT_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + PROJECT_POINTS + "!");
            }
        } while ((projectPointsEarned < 0.0) || (projectPointsEarned > PROJECT_POINTS));

        // compute contribution to total grade for projects
        double projectGradeEarned = projectPointsEarned / PROJECT_POINTS * PROJECT_PERCENTAGE;
        overallGradeEarned += projectGradeEarned;

        System.out.println("Earned " + projectGradeEarned + " grade points out of " + PROJECT_PERCENTAGE + " possible.");


        // exam 1:
        // read in and error check number of exam1 points
        double exam1PointsEarned = 0.0;
        do {
            System.out.print("How many exam1 points did you earn (total available: " +
                EXAM1_POINTS + ")? ");
            exam1PointsEarned = keyboard.nextDouble();
            if ((exam1PointsEarned < 0.0) || (exam1PointsEarned > EXAM1_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + EXAM1_POINTS + "!");
            }
        } while ((exam1PointsEarned < 0.0) || (exam1PointsEarned > EXAM1_POINTS));

        // compute contribution to total grade for exam 1
        double exam1GradeEarned = exam1PointsEarned / EXAM1_POINTS * EXAM1_PERCENTAGE;
        overallGradeEarned += exam1GradeEarned;

        System.out.println("Earned " + exam1GradeEarned + " grade points out of " + EXAM1_PERCENTAGE + " possible.");

         // exam 2:
        // read in and error check number of exam2 points
        double exam2PointsEarned = 0.0;
        do {
            System.out.print("How many exam2 points did you earn (total available: " +
                EXAM2_POINTS + ")? ");
            exam2PointsEarned = keyboard.nextDouble();
            if ((exam2PointsEarned < 0.0) || (exam2PointsEarned > EXAM2_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + EXAM2_POINTS + "!");
            }
        } while ((exam2PointsEarned < 0.0) || (exam2PointsEarned > EXAM2_POINTS));

        // compute contribution to total grade for exam 2
        double exam2GradeEarned = exam2PointsEarned / EXAM2_POINTS * EXAM2_PERCENTAGE;
        overallGradeEarned += exam2GradeEarned;

        System.out.println("Earned " + exam2GradeEarned + " grade points out of " + EXAM2_PERCENTAGE + " possible.");
   
        // final exam:
        // read in and error check number of final points
        double finalPointsEarned = 0.0;
        do {
            System.out.print("How many final points did you earn (total available: " +
                FINAL_POINTS + ")? ");
            finalPointsEarned = keyboard.nextDouble();
            if ((finalPointsEarned < 0.0) || (finalPointsEarned > FINAL_POINTS)) {
                System.out.println("Response must be in the range 0.0 to " + FINAL_POINTS + "!");
            }
        } while ((finalPointsEarned < 0.0) || (finalPointsEarned > FINAL_POINTS));

        // compute contribution to total grade for final
        double finalGradeEarned = finalPointsEarned / FINAL_POINTS * FINAL_PERCENTAGE;
        overallGradeEarned += finalGradeEarned;

        System.out.println("Earned " + finalGradeEarned + " grade points out of " + FINAL_PERCENTAGE + " possible.");
    
        // now, we are ready to report an overall average
        System.out.println("Your overall course average is " + overallGradeEarned + ".");
    }

}