import java.util.Scanner;

public class Dinner16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        int count = 0;

        for (int index = 0; index < word.length(); index++) {
            char ch = Character.toLowerCase(word.charAt(index)); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("The vowels 'aeiou' appear " + count + " times.");
    }
}
