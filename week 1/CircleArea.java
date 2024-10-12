// Assignment #1

// Write a program to calculate the area of a circle ( 3.1425*r*r ). 
// The program will output the area of the circle based on a radius value initialized in the program.

public class CircleArea {

    // main class
    public static void main(String[] args) {

        // variables declaration
        final double PI;
        int radius;
        double area;

        // variables initialization
        PI = 3.1425;
        radius = 5;
        area = PI * (radius * radius);

        // printing area
        System.out.println("Area of the circle with radius - " + radius + " is: " + area);

    } // end main
} // end CircleArea
