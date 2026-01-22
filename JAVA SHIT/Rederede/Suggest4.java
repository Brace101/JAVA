import java.util.Scanner;
import java.util.Random;

public class Suggest4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(20) + 1;
        int guess;

        while (true) {
            System.out.print("Guess a number between 1 and 20: ");
            guess = input.nextInt();

            if (guess != randomNumber) {
                System.out.println("Incorrect.");
            } else {
                System.out.println("Correct.");
                break; 
            }
        }

        
    }
}

