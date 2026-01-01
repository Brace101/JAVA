import java.util.Scanner;
import java.util.Arrays;

public class ArrayTry{
        public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        double number[] = new double[20];
        double sum = 0;
        int counter = 20;

    for (int count=0;count<20;count++){
        System.out.printf("Enter number%d: ", counter);
        number[count]=input.nextDouble();

        sum += number[count];
        counter--;
      
        
       
        
        

}

        double average = sum/20;

System.out.println("The sum is:" + sum);
System.out.println("The average is:" + average);






}

}

