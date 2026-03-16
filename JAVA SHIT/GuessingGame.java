import java.util.Scanner;   

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 7;   
        int guessNumber = 0;

        System.out.println("=== Welcome to the Number Guessing Game ===");

        while (guessNumber != secretNumber) {

            System.out.print("Enter your guess: ");
            guessNumber = input.nextInt();

            if (guessNumber < secretNumber) {
                System.out.println("Guess Number Too low! Try again.");
            } 
            else if (guessNumber > secretNumber) {
                System.out.println("Guess Number Too high! Try again.");
            } 
            else {
                System.out.println("Congratulations! you've successfully guessed the correct number.");
            }
        }

      
    }
}
