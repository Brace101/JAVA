import java.util.Scanner; 
    public class Arithmetic{
        public static void main (String [] args){
        Scanner input = new Scanner(System.in);

    System.out.println ("Enter first number");
    int firstNumber = input.nextInt();

    System.out.println ("Enter second number");
    int secondNumber = input.nextInt();

    int firstSquare = firstNumber * firstNumber;

    int secondSquare = secondNumber * secondNumber;

    int sumOfSquares = firstSquare + secondSquare;

    int diffOfSquares = firstSquare - secondSquare;

    System.out.printf("The square of %d is %d%n",firstNumber,firstSquare);

    System.out.printf("The square of %d is %d%n", secondNumber,secondSquare);

    System.out.printf("The sum of squares is %d%n", sumOfSquares);

    System.out.printf("The diff between the squares is %d%n", diffOfSquares);
    
  /* System.out.print = (first number*first number) (second number*second number);
    System.out.printf("The square of %d is %d%n", firstNumber, (firstNumber * firstNumber));  
  
    System.out.printf("first number*first number") + ("second number*second number");
/*    System.out.printf("first number*first number") - ("second number*second number");



}

}
