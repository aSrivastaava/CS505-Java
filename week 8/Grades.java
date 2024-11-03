class Grades {

    private int[] values = {};

    Grades() {
    };

    Grades(int[] myArray) {
        if (myArray != null)
            setValues(myArray);
    };

    public void setValues(int[] myArray) {
        if (myArray != null)
            values = myArray;
    }

    public int[] getValues() {
        return values;
    }

    public int highest() {
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > high)
                high = values[i];
        }
        return high;
    }

    public int lowest() {
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < low)
                low = values[i];
        }
        return low;
    }

    public int numOfGrades() {
        return values.length;
    }

    public double average() {
        int avg;
        int sum = 0;

        for (int i = 0; i < values.length; i++)
            sum += values[i];

        avg = sum / values.length;

        return avg;
    }

    public int numOfFailingGrades(int gradeValue) {
        int failingCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < gradeValue)
                failingCount++;
        }

        return failingCount;
    }

    public void histogram() {
        int[] valuesCount = new int[5];

        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 90)
                valuesCount[0]++;
            else if (values[i] >= 80)
                valuesCount[1]++;
            else if (values[i] >= 70)
                valuesCount[2]++;
            else if (values[i] >= 60)
                valuesCount[3]++;
            else
                valuesCount[4]++;
        }

        for (int i = 0; i < valuesCount.length; i++) {
            if (i == 0)
                System.out.print("90 - 100 \t|\t");
            else if (i == 1)
                System.out.print("80 - 89 \t|\t");
            else if (i == 2)
                System.out.print("70 - 79 \t|\t");
            else if (i == 3)
                System.out.print("60 - 69 \t|\t");
            else
                System.out.print("< 60\t\t|\t");

            for (int j = 0; j < valuesCount[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
