import java.util.Scanner;
public class MiniCalculator{

    public static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    
    public static double addition(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
     public static double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber, double thirdNumber){
        return firstNumber - secondNumber - thirdNumber;
    }
    public static double division(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public static double division(double firstNumber, double secondNumber, double thirdNumber){
        return firstNumber / secondNumber / thirdNumber;
    }
     public static double multiplication(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
    
    public static double multiplication(double firstNumber, double secondNumber, double thirdNumber){
        return firstNumber * secondNumber * thirdNumber;
    }
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);    
    
    double result = 0;
    double answer = 0;

    System.out.println("Enter First Number");
    double firstNumber = input.nextDouble();

    System.out.println("Enter operator");
    char Operator = input.next().charAt(0);

    System.out.println("Enter Second Number");
    double secondNumber = input.nextDouble();
    
    System.out.println("Enter Third Number");
    double thirdNumber = input.nextDouble();
   
    
    if (Operator == '+'){
    result = addition(firstNumber , secondNumber);
    answer = addition(firstNumber , secondNumber, thirdNumber);
    System.out.println("Result is:" + result);
    System.out.println("Answer is : " + answer);
    }
    
    else if  (Operator == '-'){
    result = subtract(firstNumber , secondNumber);
    answer = subtract(firstNumber , secondNumber, thirdNumber);
    System.out.println("Result is:" + result);
    System.out.println("Answer is : " + answer);
    }

    else if  (Operator == '/'){
    if (secondNumber == 0) {
     System.out.println("Number cant be divided by zero");
        }
    else{
    result = division(firstNumber , secondNumber);
    answer = division(firstNumber , secondNumber, thirdNumber);
        }
    System.out.println("Result is:" + result);
    System.out.println("Answer is : " + answer);
    }

    else if (Operator == '*'){
    result = multiplication(firstNumber , secondNumber);
    answer = multiplication(firstNumber , secondNumber, thirdNumber);
    System.out.println("Result is:" + result);
    System.out.println("Answer is : " + answer);
    }
    


}
}


