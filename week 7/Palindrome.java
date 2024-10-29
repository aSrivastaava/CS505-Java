public class Palindrome {

    public static boolean isPalindrome(char[] myPalindrome) {

        for (int i = 0; i < myPalindrome.length / 2; i++) {
            if (myPalindrome[i] != myPalindrome[myPalindrome.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[] myCharArray = { 'R', 'A', 'C', 'E', 'C', 'A', 'R' };
        // char[] myCharArray = { 'E', 'Y', 'E' };
        // char[] myCharArray = { 'D', 'O', 'N', 'T' };
        // char[] myCharArray = { 'I', 'M' };
        // char[] myCharArray = { 'A', 'D', 'A', 'M' };
        if (isPalindrome(myCharArray)) {
            System.out.println("this is a palindrome");
        } else {
            System.out.println("this is not a palindrome");
        }

    }
}