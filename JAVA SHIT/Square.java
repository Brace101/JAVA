import java.util.Scanner;
public class Square{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        System.out.println("square of num1: " + square1 );

        int square2 = num2 * num2;
        System.out.println("square of num2: " + square2 );

        int sumOfSquare = square1 + square2;
        System.out.println("sum of square: " + sumOfSquare );

        int diffOfSquare = square1 - square2;
        System.out.println("diffclearof square: " + diffOfSquare );

        int multiOfSquare = square1 * square2;
        System.out.println("multi of square: " + multiOfSquare );




        //System.out.print("num2 * num2");
        //int num2square = input.nextInt();







}

}
