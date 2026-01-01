import java.util.Scanner;
public class BookSuggestion{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

    String moreSuggest = "yes";

while (true){

String Menu = """

    WELCOME TO THE BOOK SUGGESTION SYSTEM!
    1.  Get Suggestion
    2.  Add Book
    3.  Remove Book
    4.  Update Bok
    5.  Show all books

""";
    System.out.println(Menu);   
    System.out.print("Enter Option: ");
    int option = input.nextInt();
    input.nextLine();

switch (option){
        case 1 ->{

Menu = """
        ---Book of the day---
            Book Title: The Hobbit
            Author: JOhn ROnald Reuel
            Number of pages: 47
""";
    System.out.println(Menu);

    while(true){
    System.out.println("Would you like to get another suggestion: Yes/No?");
    moreSuggest = input.nextLine();

    if (moreSuggest.equalsIgnoreCase("yes")){  

Menu = """
        Book Tite: The Mystery
        Author: Jeffery Matthew
        NUmber of pages: 12

""";
    System.out.println(Menu);








}}}}}}}
