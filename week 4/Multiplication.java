/*
Assignment #4

2)	[80 points] Computers are playing an increasing role in education.  Write a program that will help elementary school children learn multiplication.  
    Use the Random class in the java.util package to produce two positive one-digit integers.  The format to generating this number is as follows:
*/

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();

        // declare variable
        boolean toExit = false;
        int userAnswer = 0;
        int validAnswer = 0;
        while (!toExit) {

            // generating two random one digit numbers.
            int number1 = Math.abs(generateRandom.nextInt() % 10);
            int number2 = Math.abs(generateRandom.nextInt() % 10);
            while (!toExit) {
                System.out.println("How much is " + number1 + " times " + number2 + " ?");
                validAnswer = number1 * number2;

                // checking if the user has entered an integer or not.
                if (scan.hasNextInt()) {
                    userAnswer = scan.nextInt();
                } else {
                    System.out.println("Invaild Input: Input should be an integer. Try again...!");
                    scan.next();
                }

                // checking if the user answer is correct or not. Also checking for the exit
                // condition i.e. if user value is -1.
                if (userAnswer == -1) {
                    toExit = true;
                } else if (userAnswer == validAnswer) {
                    System.out.println("Very Good!");
                    toExit = true;
                } else
                    System.out.println("No. Please try again or -1 to Exit.");
            }

            // making correction to the exit condition if user has given correct answer and
            // doesn't want to exit.
            if (userAnswer != -1) {
                toExit = false;
            }
        }

        scan.close();

    }
}
