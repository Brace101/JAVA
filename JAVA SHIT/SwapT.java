import java.util.Scanner;
public class SwapT{
    public static void main (String [] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter two numbers");
       int number1 = input.nextInt();
       int number2 = input.nextInt();
     
  
       int swapNumber = number1;
       number1 = number2;
       number2=swapNumber;
       System.out.printf("%d %d\n", number1 , number2);

      
        

}




}
