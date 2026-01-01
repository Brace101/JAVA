import java.util.Scanner;                                                          
    public class ArithmeticTwo{                                                     
        public static void main (String [] args){
        Scanner input = new Scanner(System.in);                                    

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int firstSquare = number1 * number1;
        System.out.println("square of number1: " + firstSquare);

        int secondSquare = number2 * number2;
        System.out.println("square of number2: " + secondSquare );
        

        int sumOfSquare = firstSquare + secondSquare;
        System.out.println("sum of square: " + sumOfSquare);
        

        int diffeOfSquare = firstSquare - secondSquare;
        System.out.println("diff of square: " + diffeOfSquare);
        
        
        int multiOfSquare = firstSquare * secondSquare;
        System.out.println("multi of square: " + multiOfSquare);
        


}

}

                         
