import java.util.Scanner;

public class VolCon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        int vowel = 0;
        int consonant = 0;

        for (int index = 0; index < word.length(); index++) {
        char charac = Character.toLowerCase(word.charAt(index)); 
        if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u') {
        vowel++;
        }
        char ch = Character.toLowerCase(word.charAt(index));
        if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || 
        ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')  {
        consonant++;
        }
}
        System.out.println("The vowels appears " + vowel + " times.");
        System.out.println("The Consonant appears " + consonant + " times.");
    
}

}



