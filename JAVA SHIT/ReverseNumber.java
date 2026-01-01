import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = input.next();

        String reversed = "";

        for (int i = number.length() - 1; i >= 0; i--) {
        reversed += number.charAt(i);

        System.out.println("Reversed number: " + reversed);



}

}

}
