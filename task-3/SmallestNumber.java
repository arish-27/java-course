
class Smallest {

    int findSmallest(int[] values) {

        int min = values[0];

        for (int i = 0; i < values.length; i++) {

            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
    }
}

public class SmallestNumber {

    public static void main(String[] args) {

        int[] arr = {30, 10, 50, 5, 20};

        Smallest obj = new Smallest();

        int result = obj.findSmallest(arr);

        System.out.println("Smallest Number: " + result);
    }
}
