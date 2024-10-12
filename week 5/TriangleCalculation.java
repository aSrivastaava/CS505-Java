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

        tri.setSides(side1, side2, side3);

        System.out.println("Scalene: " + tri.isScalene());
        System.out.println("Isosceles: " + tri.isIsosceles());
        System.out.println("Equilateral: " + tri.isEquilateral());
        System.out.println("Perimeter: " + tri.calculatePerimeter());
    }
}