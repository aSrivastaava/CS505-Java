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

    private void sortAttendance() {
        Collections.sort(attendance);
    }

    public void printAttendance() {
        getAttendanceArray();
        sortAttendance();
        for (int i = 0; i < attendance.size(); i++) {
            System.out.println(attendance.get(i));
        }
    }

    public void histogram() {
        int index = 0;

        System.out.print(attendance.get(index).company + "\t");
        for (int i = 0; i < attendance.size(); i++) {
            if (attendance.get(index).company.equals(attendance.get(i).company)) {
                System.out.print("*");
            } else {
                index = i;
                System.out.print("\n" + attendance.get(index).company + "\t" + "*");
            }
        }

    }

    private String[] capitalFirstChar(String[] str) {
        if (str == null || str.length == 0) {
            return str;
        } else {
            for (int i = 0; i < str.length; i++) {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
            }

            return str;
        }
    }

    public void checkAttendance(String name) {
        boolean found = false;
        String[] fullName = name.split("\\.");
        fullName = capitalFirstChar(fullName);

        for (int i = 0; i < attendance.size(); i++) {
            if (attendance.get(i).name.equals(name)) {
                found = true;
            }
        }

        if (found) {
            System.out.println(fullName[0] + " " + fullName[1] + " attended conference.");
        } else {
            System.out.println(fullName[0] + " " + fullName[1] + " not attended conference.");
        }
    }
}
