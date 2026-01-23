import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite pet");
        String pet = input.next();

        if (pet.equalsIgnoreCase("dog")) {
            System.out.println("Woof! Dogs are awesome ");

        } else if (pet.equalsIgnoreCase("cat")) {
            System.out.println("Meow! Cats are cool ");

        } else {
            System.out.println("Cool choice, but I love dogs ");
        }
    }
}


