public class AttendeeTest {
    public static void main(String[] args) {
        Attendee at = new Attendee("attendance.txt");

        at.printAttendance();
        at.histogram();
    }
}
