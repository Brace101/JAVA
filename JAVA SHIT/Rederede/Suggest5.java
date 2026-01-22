import java.util.Scanner;
import java.util.Random;

public class Suggest5 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(20) + 1;
        int guess;
        int attempts = 0; 

        while (true) {
            System.out.print("Guess a number between 1 and 20: ");
            guess = input.nextInt();
            attempts++; 

            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }
        }

       
    }
}

