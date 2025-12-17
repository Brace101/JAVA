import java.util.Scanner;
public class ClassTaskFour{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int counter = 1;
        int evenCounter = 0;
        int oddCounter = 0;

        while(counter <= 10){
        
        System.out.println("Enter a number: ");
        int score = input.nextInt();
          counter++;
        if (score % 2 == 0)
        System.out.printf("%d is even%n", score);
      
        
              
        else 
        System.out.printf("%d is odd%n", score); 
      
           evenCounter++;
       oddCounter++;
        


        System.out.printf("Odd number frequency: %d%n", oddCounter);
        System.out.printf("Even number frequency: %d%n", evenCounter);




}
}


}

