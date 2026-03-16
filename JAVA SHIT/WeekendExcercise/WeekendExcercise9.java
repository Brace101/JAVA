import java.util.Scanner;

public class WeekendExcercise9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Divisors of " + number + " are:");

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                System.out.print(index + " ");
            }
        }
    }
}


