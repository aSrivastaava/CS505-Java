import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Attendee {
    private String attendanceFileName;
    private ArrayList<Person> attendance = new ArrayList<Person>();

    Attendee() {
        attendanceFileName = null;
    }

    Attendee(String attendanceFileName) {
        this.attendanceFileName = attendanceFileName;
    }

    private void getAttendanceArray() {

        try {

            File attendanceFile = new File(attendanceFileName);
            Scanner scan = new Scanner(attendanceFile);

            while (scan.hasNextLine()) {
                String attendanceText = scan.nextLine();
                Email em = new Email(attendanceText);

                attendance.add(new Person(em.parseCompanyName(), em.parseEmailName()));
            }

            scan.close();

        } catch (Exception e) {
            System.err.println("Got Exception: " + e.getMessage());
        }

    }

}
