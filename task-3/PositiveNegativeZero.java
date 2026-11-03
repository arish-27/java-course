
class NumberCounter {

    void countValues(int[] numbers) {

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positiveCount++;
            }
            else if (numbers[i] < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("Positive Numbers: " + positiveCount);
        System.out.println("Negative Numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 20, -15, 0, 30};

        NumberCounter obj = new NumberCounter();

        obj.countValues(arr);
    }
}
