public class WeekendExcercise7 {
    public static void main(String[] args) {

        double sum = 0;

        for (double index = 1; index <= 100; index++) {
            sum += index;
        }

        double average = sum / 100;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
