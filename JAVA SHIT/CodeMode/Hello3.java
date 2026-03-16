import java.util.Scanner;
public class Hello3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter Number");
    int number = input.nextInt();

    if (number >= 1000){
    System.out.printf("%,d%n", number );
}
    else if (number < 1000){
    System.out.println("$" + number);
}





}}

