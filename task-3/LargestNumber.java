
class Largest {

    int findLargest(int[] numbers) {

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}

public class LargestNumber {

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 15};

        Largest obj = new Largest();

        int result = obj.findLargest(arr);

        System.out.println("Largest Number: " + result);
    }
}
