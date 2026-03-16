import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        double largest = numbers[0];
        double secondLargest = numbers[0];

        System.out.println("Enter 5 numbers:");

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Number " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            } 
            else if (numbers[index] > secondLargest && numbers[index] != largest) {
                secondLargest = numbers[index];
            }
        }

        System.out.println("Second largest number is: " + secondLargest);

     
    }
}
