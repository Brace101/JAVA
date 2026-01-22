public class FireDrill1 {

    public static void main(String[] args) {
        createNumbers();
    }

    public static void createNumbers() {
        int[] numbers = new int[10];

        for (int index = 0; index < 10; index++) {
            numbers[index] = index + 1;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}


