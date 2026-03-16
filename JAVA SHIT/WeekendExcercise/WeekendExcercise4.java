import java.util.Scanner;

public class WeekendExcercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int count = 0;

        for (int index = 0; index < word.length(); index++) {
            if (Character.isLowerCase(word.charAt(index))) {
                count++;
            }
        }

        System.out.println("Number of uppercase letters: " + count);
    }
}
