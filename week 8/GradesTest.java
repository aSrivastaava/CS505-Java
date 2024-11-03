import java.util.Scanner;

public class GradesTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of grades to input:\t");
        int noOfInput = scan.nextInt();
        int[] grades = new int[noOfInput];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade\s" + (i + 1) + ":\t");
            grades[i] = scan.nextInt();
        }

        Grades g = new Grades(grades);
        // Grades g = new Grades();
        // g.setValues(grades);

        System.out.println("Press 1: To calculate the highest grade.");
        System.out.println("Press 2: To calculate the lowest grade.");
        System.out.println("Press 3: To get number of grades.");
        System.out.println("Press 4: To calculate the average grade.");
        System.out.println("Press 5: To calculate number of failing grades.");
        System.out.println("Press 6: To get histogram of all the grades.");
        int choice = scan.nextInt();
        scan.close();

        if (choice == 1)
            System.out.println("Highest grade:\t" + g.highest());
        else if (choice == 2)
            System.out.println("Lowest grade:\t" + g.lowest());
        else if (choice == 3)
            System.out.println("Total number of the grades:\t" + g.numOfGrades());
        else if (choice == 4)
            System.out.println("Averge of all the grades:\t" + g.average());
        else if (choice == 5)
            System.out.println("Number of failing grades are\s" + g.numOfFailingGrades(choice));
        else if (choice == 6) {
            System.out.println("Histogram:");
            g.histogram();
        } else
            System.out.println("Invalid Choice...!");

    }
}
