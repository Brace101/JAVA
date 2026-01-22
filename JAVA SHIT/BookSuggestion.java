import java.util.Scanner;
import java.util.ArrayList;
public class BookSuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> bookTitle = new ArrayList<>();
        ArrayList<Integer> numberOfPages = new ArrayList<>();
        ArrayList<String> Author = new ArrayList<>();
        
        bookTitle.add("The Hobitt");
        numberOfPages.add(320);
        Author.add("J.R.R. Tolkien");

 while (true) {

     String menu = """
                    
     ------WELCOME TO THE BOOK SUGGESTION SYSTEM!-----
                1. Get Suggestion
                2. Add Book
                3. Remove Book
                4. Update Book
                5. Show all books
                0. Exit
                    
 """;
        System.out.println(menu);

        System.out.print("Enter Option: ");
        int option = input.nextInt();
        input.nextLine();

switch (option) {

case 1 -> {
        

while (true) {
        System.out.print("Would you like to get another suggestion? (Yes/No): ");
        String moreSuggest = input.nextLine();

        if (moreSuggest.equalsIgnoreCase("yes")) {
        System.out.println("""

        --- Another Suggestion ---
        Title: The Mystery
        Author: Jeffrey Matthew
        Pages: 97
""");
        } else if (moreSuggest.equalsIgnoreCase("no")) {
break;
        } else {
        System.out.println("Please enter Yes or No.");
        }
        }
        }

        case 2 -> {
        System.out.print("Kindly enter book title to add: ");
        String title = input.nextLine();
        
        System.out.print("Kindly enter the Author: ");
        String author = input.nextLine();

        System.out.print("Kindly enter the number of pages: ");
        int page = input.nextInt();
        
        System.out.println(title + " added successfully!");
        }

        case 3 -> {
        System.out.print("Kindly enter book title to remove: ");
        String title = input.nextLine();
        System.out.println(title + " removed successfully!");
        }

        case 4 -> {
        System.out.print("Kindly enter book title to update: ");
        String title = input.nextLine();
        System.out.println(title + " updated successfully!");
        }

        case 5 -> {
        System.out.println("""
        --- All Books ---
        1. The Hobbit
        2. The Mystery
""");
        }

        case 0 -> {
        System.out.println("Thank you for using the Book Suggestion System!");
        System.exit(0);
        }

        default -> System.out.println("Invalid option. PLease Try again.");
 }
 }
    }
}

