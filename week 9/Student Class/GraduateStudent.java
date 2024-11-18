public class GraduateStudent extends Student {

    GraduateStudent() {
        setMidtermExam(0);
        setFinalExam(0);
    }

    GraduateStudent(int midTermExam, int finalExam) {
        setMidtermExam(midTermExam);
        setFinalExam(finalExam);
    }

    public char getLetterGrade() {
        double avg = calcAvg(); // (midtermExam + finalExam) / 2.0;

        // 90-100 =A
        // 80-89 = B
        // 70-79 =C
        // <70 = F

        char grade = ' ';
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
