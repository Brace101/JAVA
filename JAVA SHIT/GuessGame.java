import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {

        int trials = 3;
        int guess = 0;

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int defaultNumber = random.nextInt(10)+1;

        for (int count = 1; count <= trials; count++) {
        
        System.out.print("Guess a number between 1 to 10: ");
        guess = input.nextInt();
        }

        if (guess == defaultNumber){
        System.out.println("Congratulations!!! You've just guessed right'");
        
        }else{
        System.out.println("Guess Again");
        }



}
    }

