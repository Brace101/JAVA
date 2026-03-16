import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int  divisor = 2;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {
                count++;
            }
        }

        if (count == 0 && number > 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
