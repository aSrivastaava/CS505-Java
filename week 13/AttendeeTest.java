public class AttendeeTest {
    public static void main(String[] args) {
        Attendee at = new Attendee("attendance.txt");

        System.out.println("\n\nAttendance");
        at.printAttendance();

        System.out.println("\n\nHistogram");
        at.histogram();

        System.out.println("\n\nCheck Attendance");
        at.checkAttendance("bill.gates");
        at.checkAttendance("aditya.srivastava");

    }
}
