import java.util.Scanner;
import java.util.Random;

public class Suggest {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(20) + 1;

        System.out.print("Guess a number between 1 and 20: ");
        int guess = input.nextInt();

       
        if (guess == randomNumber) {
            System.out.println("Correct! ");
        } else {
            System.out.println("Wrong! The number suggested was " + randomNumber);
        }
    }
}

