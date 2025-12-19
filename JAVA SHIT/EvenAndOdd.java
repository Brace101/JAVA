import java.util.Scanner;
public class EvenAndOdd{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
        
    System.out.print("Enter third number: ");
    int thirdNumber = input.nextInt();

    System.out.print("Enter fourth number: ");
    int fourthNumber = input.nextInt();

    System.out.print("Enter fifth number: ");
    int fifthNumber = input.nextInt();

    if(firstNumber % 2 == 0)
    System.out.println("Even");

    else 
    System.out.println("Odd");

    if(secondNumber % 2 == 0)
    System.out.println("Even");

    else 
    System.out.println("Odd");

    if(thirdNumber % 2 == 0)
    System.out.println("Even");

    else 
    System.out.println("Odd");

    if(fourthNumber % 2 == 0)
    System.out.println("Even");

    else 
    System.out.println("Odd");

    if(fifthNumber % 2 == 0)
    System.out.println("Even");

    else 
    System.out.println("Odd");



    



}


}
