
class AverageCalculator {

    double calculateAverage(int[] values) {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum = sum + values[i];
        }

        double average = (double) sum / values.length;

        return average;
    }
}

public class ArrayAverage {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        AverageCalculator obj = new AverageCalculator();

        double result = obj.calculateAverage(arr);

        System.out.println("Average: " + result);
    }
}
