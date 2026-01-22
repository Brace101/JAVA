import java.util.Scanner;
import java.util.Arrays;

public class TaskThreeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int index = 0; index < scores.length; index++) {
            System.out.print("Enter score " + (index + 1) + ": ");
            scores[index] = input.nextInt();
        }

        System.out.println("Scores entered:");
        
        for (int score : scores) {
            System.out.print(score + " "); 
        }
    }
}

