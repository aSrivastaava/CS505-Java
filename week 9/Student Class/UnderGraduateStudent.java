public class UnderGraduateStudent extends Student {

    UnderGraduateStudent() {
        setMidtermExam(0);
        setFinalExam(0);
    }

    UnderGraduateStudent(int midTermExam, int finalExam) {
        setMidtermExam(midTermExam);
        setFinalExam(finalExam);
    }

    public char getLetterGrade() {
        double avg = calcAvg(); // (midtermExam + finalExam) / 2.0;

        // 90-100 =A
        // 80-89 = B
        // 70-79 =C
        // 60-69 = D
        // <60 =F

        char grade = ' ';
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
