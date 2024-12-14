import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        Scanner scan = null;
        try {

            File attendanceFile = new File(attendanceFileName);
            scan = new Scanner(attendanceFile);

            while (scan.hasNextLine()) {
                String attendanceText = scan.nextLine();
                Email em = new Email(attendanceText);

                attendance.add(new Person(em.parseCompanyName(), em.parseEmailName()));
            }

            Collections.sort(attendance);

        } catch (Exception e) {
            System.err.println("Got Exception: " + e.getMessage());
        } finally {
            scan.close();
        }

    }

    public void printAttendance() {
        getAttendanceArray();
        for (int i = 0; i < attendance.size(); i++) {
            System.out.println(attendance.get(i));
        }
    }

    private String histogram() {
        String histogm = "";
        int index = 0;

        // System.out.print(attendance.get(index).company + "\t");
        histogm += attendance.get(index).company + "\t";
        for (int i = 0; i < attendance.size(); i++) {
            if (attendance.get(index).company.equals(attendance.get(i).company)) {
                // System.out.print("*");
                histogm += "*";
            } else {
                index = i;
                // System.out.print("\n" + attendance.get(index).company + "\t" + "*");
                histogm += "\n" + attendance.get(index).company + "\t";
            }
        }

        return histogm;

    }

    public void printHistogram() {
        System.out.println(histogram());
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

    private String checkAttendance(String name, boolean toExport) {
        boolean found = false;
        String[] fullName = name.split("\\.");
        fullName = capitalFirstChar(fullName);

        for (int i = 0; i < attendance.size(); i++) {
            if (attendance.get(i).name.equals(name)) {
                found = true;
            }
        }

        String text = "";
        if (found) {
            text = fullName[0] + " " + fullName[1] + " attended conference.";
        } else {
            text = fullName[0] + " " + fullName[1] + " has not attended conference.";
        }

        return text;
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

    public void exportToFile(String[] name) {
        BufferedWriter output = null;
        try {
            File file = new File("attendanceOutput.txt");
            output = new BufferedWriter(new FileWriter(file));
            String text = "";

            // Writing attendance
            text = "Attendance\n";
            for (int i = 0; i < attendance.size(); i++) {
                text += attendance.get(i);
                text += "\n";
            }

            text += "\n\n";

            // writing histogram
            text += "Histogram\n";
            text += histogram();

            text += "\n\n";

            // writing Check Attendance
            for (int i = 0; i < name.length; i++) {
                text += checkAttendance(name[i], true);
                text += "\n";
            }

            output.write(text);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
