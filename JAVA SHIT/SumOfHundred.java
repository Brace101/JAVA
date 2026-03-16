public class SumOfHundred {
    public static void main(String[] args) {

        int sum = 0;

        for (int index = 1; index <= 100; index++) {
            sum += index;   
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
