import java.util.Scanner;
public class ClassTaskThree{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int counter = 1;
        while (counter <= 10){

        System.out.println("Enter a number: ");
        int score = input.nextInt();

        if (score % 2 == 0)
        System.out.printf("%d is even%n", score);

        else 
        System.out.printf("%d is odd%n", score); 
        
        counter++;



// counter in 10 numbers 

}

}

}
