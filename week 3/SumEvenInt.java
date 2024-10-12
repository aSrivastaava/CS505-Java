/*
 * Assignment #3:
 * These are two separate questions. Each question should have its own .java
 * file.
 * 
 * Design and implement an application that reads an integer value and prints
 * out the sum of all EVEN integers between 2 and its input value, inclusive.
 * Print an error message if the input value is less than 2. Prompt accordingly
 */

// imports
import java.util.Scanner;

// Start SumEvenInt class
public class SumEvenInt {

    // start main
    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        // declare variable and getting it's value from the user using scanner object.
        int numb = 0;
        int sum = 0;

        System.out.print("Enter a number which is equal or more than 2: ");

        // validating user's input, if it's integer or not.
        if (scan.hasNextInt())
            numb = scan.nextInt();
        else {
            scan.next();
        }

        // using while to get input after validating it if it is integer and equal to or
        // greater than 2.
        while (numb < 2) {
            // user prompt
            System.out.println(
                    "Invaild Input: Entered value should be an Integer, and more than or equal to 2. Please try again....!");
            System.out.print("Enter a number which is equal or more than 2: ");

            // validating user's input, if it's integer or not.
            if (scan.hasNextInt())
                numb = scan.nextInt();
            else {
                scan.next();
            }

        }

        // closing the scanner object
        scan.close();

        // get all the even number till the numb.
        // using while loop.....!!!!
        // int number = 2;
        // while (number <= numb) {
        // // using if statement to check if number is even or not.
        // if (number % 2 == 0)
        // sum += number;

        // number++;
        // }

        // another even sum logic using while loop.

        // while (number <= numb) {
        // sum += number;
        // // add 2 to the initial numeber i.e. 2 because we know adding even+even=even.
        // number += 2;
        // }

        // Output
        System.out.println("Sum of all the EVEN integers from 2 to " + numb + " is: " + sum);

    }
    // end main

}
// End of SumEvenInt class
