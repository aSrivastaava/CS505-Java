public class Array {

    public static double calcAvg(int[] arr) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {

        int[] myArray = { 90, 80, 70, 85, 95 };

        double average = calcAvg(myArray);
        System.out.println("Average of the given array is " + average);
    }

}