import java.util.Scanner;

public class TriangleCalculation {
    public static void main(String[] args) {
        Triangle tri = new Triangle();

        Scanner scan = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        System.out.println("Enter the lenght of side 1:");
        side1 = scan.nextInt();

        System.out.println("Enter the lenght of side 2:");
        side2 = scan.nextInt();

        System.out.println("Enter the lenght of side 3:");
        side3 = scan.nextInt();

        scan.close();

        if (tri.isTriangle(side1, side2, side3)) {
            tri.setSides(side1, side2, side3);

            System.out.println("No sides are equal - Scalene: " + tri.isScalene());
            System.out.println("Any two sides are equal - Isosceles: " + tri.isIsosceles());
            System.out.println("All three sides are equal - Equilateral: " + tri.isEquilateral());
            System.out.println("Perimeter: " + tri.calculatePerimeter());
        } else {
            System.out.println("Invalid Triangle...! Please enter a valid sides for a triangle.");
        }
    }
}