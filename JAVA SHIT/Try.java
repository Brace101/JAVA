import java.util.ArrayList;
import java.util.Scanner;

public class Try{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Double> productPieces = new ArrayList<>();
        ArrayList<Double> productUnit = new ArrayList<>();

        String moreItems = "Yes";

        while (true) {

            System.out.print("Enter product name: ");
            productName.add(input.nextLine());

            System.out.print("Enter product per pieces: ");
            productPieces.add(input.nextDouble());

            System.out.print("Enter product unit: ");
            productUnit.add(input.nextDouble());

            input.nextLine();

            System.out.print("Add more items? (Yes or No): ");
            moreItems = input.nextLine();

            if (moreItems.equalsIgnoreCase("No")) {
                break;
 }
            System.out.println("What else would you like to buy?");
 }

    
}
}

