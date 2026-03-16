import java.util.Scanner;

public class WeekendExcercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int position = -1; 

        for (int index = 0; index < word.length(); index++) {
            char ch = Character.toLowerCase(text.charAt(index));

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {

                position = index;
                break;
            }
        }

        if (position != -1) {
            System.out.println("First vowel found at index: " + position);
        } 
        }
    }

