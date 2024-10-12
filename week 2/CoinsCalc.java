/*
Assignment #2

Write a program that reads an integer value between 0 and 100 (inclusive), representing the amount of a purchase in cents.  Produce an error message if the input value is not in range.  If the input is valid, determine the amount of change that would be received from one dollar, and print the number of quarters, dimes, nickels, and pennies that should be returned.  Maximize the coins with the highest value.
Follow the format below.

	Enter the purchase amount [0-100 ]:  36

OUTPUT:
	Your change of 64 cents is given as:
	  2 Quarters
	  1 Dimes
	  0 Nickels
	  4 Pennies

HINT:  64 / 25 equals 2, and 64 % 25 equals 14

Note: Quarter=25; Dime=10; Nickel=5; Penny=1

Use the following lines of code to read an integer from the user.  The Scanner object will be used.
Don't forget to import the java.util.Scanner package. 

import java.util.Scanner;

public static void main(String[] args) {

   // Declare a data type Scanner
   
	int number;
	Scanner scan = new Scanner (System.in);

	System.out.println("Input a number: ");
        number = scan.nextInt();

   // .....program logic goes here .....

} // end main

*/

// imports
import java.util.Scanner;

// start CoinsCalc class
public class CoinsCalc {

	// start main
	public static void main(String[] args) {

		// creating object for scanner
		Scanner scan = new Scanner(System.in);

		// declaring and initialising variables
		int quarters = 0;
		int dime = 0;
		int nickels = 0;
		int pennies = 0;
		int amount;

		// Getting amount value.
		// using do while because it will execute the loop atleast once to get the
		// amount value
		// then while statement can control the loop to get the input between 0 and 100
		// both inclusive.
		do {
			System.out.print("Enter the purchase amount [0-100 ]: ");
			amount = scan.nextInt();
		} while (amount <= 0 || amount >= 100);

		// another way to get controlled input i.e. to compare the value after taking
		// input
		// but this way our code with terminate and have to run it again.
		/*
		 * amount = scan.nextInt();
		 * if (amount <= 0 || amount >= 100) {
		 * System.out.println("Oop..! You have to enter amount between 0 to 100...!");
		 * return;
		 * }
		 */

		// closing scanner object because we don't need any input now.
		scan.close();

		int remainginAmount = 100 - amount;

		System.out.println("Your change of " + remainginAmount + " cents is given as: ");

		// Calculation for Quarters
		// using ternary operator to calculate and assign the result
		// only if the result is greater than 0.
		quarters = ((remainginAmount / 25) > 0) ? (remainginAmount / 25) : 0;
		remainginAmount %= 25;
		System.out.println(quarters + " Quarters");

		// Calculation for dime
		// using ternary operator to calculate and assign the result
		// only if the result is greater than 0.
		dime = ((remainginAmount / 10) > 0) ? (remainginAmount / 10) : 0;
		remainginAmount %= 10;
		System.out.println(dime + " Dimes");

		// Calculation for nickels
		// using ternary operator to calculate and assign the result
		// only if the result is greater than 0.
		dime = ((remainginAmount / 5) > 0) ? (remainginAmount / 5) : 0;
		remainginAmount %= 5;
		System.out.println(nickels + " Nickels");

		// Calculation for pennies
		pennies = remainginAmount;
		System.out.println(pennies + " Pennies");

	}
	// end main
}
// end CoinsCalc class