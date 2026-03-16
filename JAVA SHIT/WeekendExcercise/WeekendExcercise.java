import java.util.Scanner;

public class WeekendExcercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Word ");
        String word = input.nextLine();

        String reversed = "";

        for (int index = word.length()-1; index >= 0; index--) {
            reversed += word.charAt(index);
        }

        System.out.println("Reversed string: " + reversed);
    }
}


