/*
 * Example SumOfSquares
 */

import javax.swing.JOptionPane;

public class SumOfSquares {

    // a method that takes 2 parameters, both numbers, and then computes
    // the sum of their squares and prints a message.
    // num1 and num2 act like variables that are initialized to the first
    // and second parameters in each call to sumSquares from somewhere else
    public static void sumSquares(int num1, int num2) {
        
        int sumSq = num1 * num1 + num2 * num2;
        JOptionPane.showMessageDialog(null, "The sum of the squares of " + num1 
            + " and " + num2 + " is " + sumSq);
    }
    
    public static void main(String[] args) {
    
        // we haven't used JOptionPanes much lately, so let's.
        
        // we need two integers to operate on
        String input = JOptionPane.showInputDialog("Please enter the first number");
        int firstNum = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Please enter the second number");
        int secondNum = Integer.parseInt(input);
        
        // call our method.  The value of firstNum will be used to initialize
        // num1 in the method, secondNum will be used to initialize num2 in 
        // the method
        sumSquares(firstNum, secondNum);
        
    }
}