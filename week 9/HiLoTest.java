import java.util.Scanner;

public class HiLoTest {
    public static void main(String[] args) {
        HiLo game = new HiLo();

        Scanner scan = new Scanner(System.in);
        int guess = 0;
        char continueGame = 'y';
        while (continueGame == 'y') {
            System.out.print("Guess a random number between 0 and 99 (inclusive) or -1 to quit: ");
            guess = scan.nextInt();
            int count = 0;
            game.generateRandomTwoDigitNumber();
            while (guess != -1) {
                if (game.checkGuess(guess)) {
                    System.out.println("Correct...!");
                    System.out.println("You've guessed the number in " + count + " time(s).");
                    guess = -1;
                } else {
                    if (game.checkHigh(guess))
                        System.out.println("Nah...! try to guess higher.");
                    else
                        System.out.println("Nah...! try to guess lower.");
                }
                guess = scan.nextInt();
                count++;
            }
            System.out.println("Do you want to play again? (y/n)");
            continueGame = scan.next().charAt(0);
        }
        scan.close();
    }
}
