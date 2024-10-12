/*
 * Assignment #3:
 * These are two separate questions. Each question should have its own .java
 * file.
 * 
 * Write a program that will read an integer value from the user and output
 * (print) the absolute value of the number. Do not use java API – Math.abs()
 * 
 * C:> Enter a number: -3
 * The absolute value of the number is: 3
 */

// imports
import java.util.Scanner;

// Start AbsoluteCalc class
public class AbsoluteCalc {

    // start main
    public static void main(String[] args) {

        // creating scanner object.
        Scanner scan = new Scanner(System.in);

        // declare variable.
        int numb = 0;
        int absoluteValue;
        boolean validInput = false;

        // using while to get the number if it's an integer.
        while (!validInput) {
            // user prompt
            System.out.print("Enter a number: ");

            // validating user's input, if it's integer or not.
            if (scan.hasNextInt()) {
                numb = scan.nextInt();
                validInput = true;
            } else {
                System.out.println("Invaild Input: Entered value should be an Integer. Please try again....!");
                scan.next();
            }

        }

        // using if statement to get absoluteValue.
        if (numb <= 0)
            absoluteValue = numb * -1;
        else
            absoluteValue = numb;

        // Output.
        System.out.println("The absolute value of the number " + numb + " is: " + absoluteValue);

        // closing the scanner object.
        scan.close();

    }
    // end main

}
// End of AbsoluteCalc class
