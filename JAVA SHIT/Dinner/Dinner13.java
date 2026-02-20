import java.util.Scanner;

public class Dinner13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        int count = 0;

        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == 'e') {
                count++;
            }
        }

        System.out.println("The letter 'e' appears " + count + " times.");
    }
}
