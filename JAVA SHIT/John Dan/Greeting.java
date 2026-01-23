import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Alex = "Alex";

        System.out.println("Enter your name");
        String name = input.next();

        if (name.equals(Alex)) {
            System.out.println("Hello, Friend");
        } else {
            System.out.println("Hello, Stranger");
        }
    }
}

