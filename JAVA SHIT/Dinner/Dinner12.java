import java.util.Scanner;

public class Dinner12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        for (int index = 0; index < word.length(); index++) {
            System.out.println(word.charAt(index));
        }

    }
}
