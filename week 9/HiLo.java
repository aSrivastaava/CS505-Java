import java.util.Random;

public class HiLo {

    private int myTwoDigitNumber;

    public boolean checkGuess(int guess) {
        if (myTwoDigitNumber == guess)
            return true;
        else
            return false;
    }

    public int getRandomNumber() {
        return myTwoDigitNumber;
    }

    public void generateRandomTwoDigitNumber() {
        Random myRandomNumber = new Random();
        myTwoDigitNumber = Math.abs(myRandomNumber.nextInt() % 100);
    }

    public boolean checkHigh(int guess) {
        if (guess < myTwoDigitNumber)
            return true;
        else
            return false;
    }

}