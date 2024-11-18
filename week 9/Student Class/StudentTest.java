public class StudentTest {
    public static void main(String[] args) {
        // Declare a reference variable of type Student
        Student bob;

        // Create an instance of UnderGraduateStudent with specific scores
        bob = new UnderGraduateStudent(35, 95);
        System.out.println("Bob's UnderGrad Grade Letter: " + bob.getLetterGrade());

        // Create an instance of GraduateStudent with specific scores
        bob = new GraduateStudent(35, 95);
        System.out.println("Bob's Graduate Grade Letter: " + bob.getLetterGrade());
    }
}
