import java.util.Scanner;
public class CodeMode2{
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter Number");
    int number = input.nextInt();

    if (number >= 1000){
    System.out.printf("$%,d%n" , number);
    }

}}

