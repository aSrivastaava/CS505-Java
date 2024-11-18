public class Student {

    private int midtermExam;
    private int finalExam;

    public void setMidtermExam(int mid) {
        midtermExam = mid;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setFinalExam(int fin) {
        finalExam = fin;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public double calcAvg() {

        double return_value;
        return_value = (midtermExam + finalExam) / 2.0;
        return return_value;
    }

    public char getLetterGrade() {

        double avg = calcAvg(); // (midtermExam + finalExam) / 2.0;
        char grade = ' ';
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else
            grade = 'F';

        return grade;

    }

}