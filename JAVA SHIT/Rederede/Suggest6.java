import java.util.Scanner;
import java.util.Random;

public class Suggest6 {
    public static void main(String[] args) {
            
        int guess = 0;

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(20) + 1;

while (true){
        
        System.out.print("Guess a number between 1 and 20: ");
        guess = input.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! ");
        } else



  }      


   
}
}
