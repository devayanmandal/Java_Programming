/*
 * Example Distance -- includes a method that returns the distance
 * between two points in the plane
 */

import java.text.DecimalFormat;
import java.util.Random;

public class Distance {

    // a method to compute the distance between two points -- takes 4 parameters
    // first two are (x,y) of one point, last two are (x,y) of the other
    public static double distance(double x1, double y1, double x2, double y2) {

        double xDiff = x1 - x2;
        double yDiff = y1 - y2;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // a main method to try this out
    public static void main(String[] args) {

        // compute the distance between the origin and (1,0)
        double dist1 = distance(0,0,1,0);
        System.out.println("(0,0) to (1,0) is " + dist1);

        // compute the distance between the origin and (1,1)
        double dist2 = distance(0,0,1,1);
        System.out.println("(0,0) to (1,1) is " + dist2);

        // we can print the result immediately without storing it in a variable
        System.out.println("(3,4) to (-2,9.7) is " + distance(3,4,-2,9.7));

        // setup for random number generation and result formatting
        Random randGen = new Random();
        DecimalFormat df = new DecimalFormat("0.000");
        
        // now we'll compute some random distances between points in (0,0) to (1,1)
        for (int count = 0; count < 10; count++) {
            // it's important that we generate and save random numbers in variables for
            // our points, because we want to make sure we use the SAME random numbers
            // for both the distance computation and the printout of the points!
            double x1 = randGen.nextDouble();
            double y1 = randGen.nextDouble();
            double x2 = randGen.nextDouble();
            double y2 = randGen.nextDouble();
            System.out.println("(" + df.format(x1) + "," + df.format(y1) + 
                               ") to (" + df.format(x2) + "," + df.format(y2) + ") is " +
                               df.format(distance(x1,y1,x2,y2)));
        }

    }
}