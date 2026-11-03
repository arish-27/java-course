
class EvenOdd {

    void countNumbers(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}

public class EvenOddCount {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        EvenOdd obj = new EvenOdd();

        obj.countNumbers(numbers);
    }
}
