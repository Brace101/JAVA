import java.util.Arrays;

public class TaskFiveArray {

    public static int[] oddIndex(int[] arr) {
        int[] result = new int[arr.length / 2];
        int resultIndex = 0;

        for (int i = 1; i < arr.length; i += 2) {
            result[resultIndex] = arr[i];
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(oddIndex(numbers)));
    }
}

