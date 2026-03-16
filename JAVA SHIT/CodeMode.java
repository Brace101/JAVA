import java.util.Scanner;
public class CodeMode{
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter Number");
    int number = input.nextInt();

    if (number >= 5000){
    System.out.println("\"Large Number\"");
}
    else if (number >= 1000 && number <= 4999){
    System.out.println("\"Medium Number\"");
}
    else {
    System.out.println("\"Small number\"");
    }
}}
