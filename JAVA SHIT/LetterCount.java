import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        char[] letters = word.toCharArray();   // store letters in array

        for (int i = 0; i < letters.length; i++) {
            int count = 1;

            for (int j = i + 1; j < letters.length; j++) {

                if (letters[i] == letters[j]) {
                    count++;
                    letters[j] = '0';   // mark counted letters
                }
            }

            if (letters[i] != '0') {
                System.out.println(letters[i] + " appears " + count + " times");
            }
        }
    }
}
