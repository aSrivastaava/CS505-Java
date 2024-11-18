import java.util.Random;
import java.util.Scanner;

public class HiLo {
    private int myTwoDigitNumber;
    private int count;
    private int guess;
    private final Scanner scan = new Scanner(System.in);
    private final Random myRandomNumber = new Random();

    // Constructor to generate the first random number
    public HiLo() {
        generateRandomTwoDigitNumber();
    }

    // Main game loop
    public void play() {
        boolean continuePlaying = true;
        do {
            takeGuess();

            // Check if the user wants to exit the game
            if (wantToExitGame()) {
                exit();
                break;
            }

            count++;
            if (checkGuess(guess)) {
                System.out.println("Correct!");
                System.out.println("You've guessed the number in " + count + " attempts.");

                // Ask if the user wants to continue
                continuePlaying = wantToContinue();
                if (!continuePlaying) {
                    exit();
                } else {
                    // Generate a new number for the next game
                    generateRandomTwoDigitNumber();
                }
            } else {
                // Provide feedback on whether the guess is too high or too low
                if (checkHigh(guess)) {
                    System.out.println("Nah...! Try to guess lower.");
                } else {
                    System.out.println("Nah...! Try to guess higher.");
                }
            }
        } while (continuePlaying);
    }

    // Ask if the user wants to continue playing
    private boolean wantToContinue() {
        System.out.print("Do you want to continue playing the game? (Y/N): ");
        char userContinueInput = scan.next().charAt(0);
        return userContinueInput == 'Y' || userContinueInput == 'y';
    }

    // Check if the guess is correct
    private boolean checkGuess(int guess) {
        return myTwoDigitNumber == guess;
    }

    // Generate a random two-digit number between 0 and 99
    private void generateRandomTwoDigitNumber() {
        myTwoDigitNumber = myRandomNumber.nextInt(100);
        count = 0;
    }

    // Take a guess from the user
    private void takeGuess() {
        System.out.print("Guess a number between 0 and 99 (inclusive) or -1 to quit: ");
        guess = scan.nextInt();
    }

    // Check if the guess is too high
    private boolean checkHigh(int guess) {
        return guess > myTwoDigitNumber;
    }

    // Check if the user wants to exit
    private boolean wantToExitGame() {
        return guess == -1;
    }

    // Exit the game and close scanner
    private void exit() {
        System.out.println("Exiting Game... Bye bye!");
        scan.close();
    }

}
