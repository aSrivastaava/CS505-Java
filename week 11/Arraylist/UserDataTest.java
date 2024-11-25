import java.util.ArrayList;
import java.util.Scanner;

public class UserDataTest {
    public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean continueUserInput = true;

        while (continueUserInput) {
            System.out.println("Enter Input {first_name<tab>last_name<tab>zip_code}:");
            String userInput = scan.nextLine();

            if (userInput.equals("-1")) {
                continueUserInput = false;
            } else {
                String[] tempUserInput = userInput.split("\t");
                if (tempUserInput.length == 3) {
                    try {
                        String firstName = tempUserInput[0];
                        String lastName = tempUserInput[1];
                        int postalCode = Integer.parseInt(tempUserInput[2]);

                        Data data = new Data(firstName, lastName, postalCode);
                        dataList.add(data);
                    } catch (Exception e) {
                        System.out.println("Invalid postal code. Please enter a valid integer.");
                    }
                } else {
                    System.out.println("Invalid input format. Please use the format: first_name<tab>last_name<tab>zip_code");
                }
            }
        }
        scan.close();

        System.out.println("\nData List:");
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(dataList.get(i));
        }

    }
}
