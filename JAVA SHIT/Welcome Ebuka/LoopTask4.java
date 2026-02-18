import java.util.Scanner;

public class LoopTask4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pass = 0;
        int fail = 0;
        int scoreCounter = 0;

        while (scoreCounter < 15) {

            System.out.print("Enter score: ");
            int score = input.nextInt();

            if (score >= 45) {
                pass++;
            } else {
                fail++;
            }

            scoreCounter++;
        }

        System.out.printf("Number of pass is %d%n", pass);
        System.out.printf("Number of fail is %d%n", fail);
    }
}

