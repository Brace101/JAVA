import java.util.Scanner;

public class Dinner15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        String result = "";

        for (int index = 0; index < word.length(); index++) {
            result += Character.toLowerCase(word.charAt(index));
        }

        System.out.println("Converted string: " + result);
    }
}
