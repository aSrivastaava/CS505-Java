/*
Assignment #4

1)	[20 points] Write a program that will read an integer value from the user and output (print) whether the number is an odd or even number.
C:> Enter a number:   5
        The number is an odd number..
*/

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declare variable
        int inputNumber = 0;
        boolean validInput = false;

        // taking input after validating it if inputNumber is integer.
        while (!validInput) {
            System.out.print("Enter a number: ");

            if (scan.hasNextInt()) {
                inputNumber = scan.nextInt();
                validInput = true;
            } else {
                System.out.println("Invaild Input: Input should be an integer. Try again...!");
                scan.next();
            }

        }
        scan.close();

        if (inputNumber % 2 == 0) {
            System.out.println("The number is an even number..");
        } else {
            System.out.println("The number is a odd number..");
        }

    }
}
