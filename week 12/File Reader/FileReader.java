import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        int countLine = 0;
        int countWord = 0;
        try {
            File textFileObj = new File("DemoFile.text");
            Scanner scan = new Scanner(textFileObj);

            while (scan.hasNextLine()) {

                String s = scan.nextLine();
                System.out.println(s);
                String[] strArr = s.split(" ");
                countLine++;
                countWord += strArr.length;
            }

            scan.close();
            System.out.println("Total Number of line: " + countLine);
            System.out.println("Total Number of Word: " + countWord);

        } catch (Exception e) {
            System.err.println("Got Exception: " + e.getMessage());
        }
    }
}