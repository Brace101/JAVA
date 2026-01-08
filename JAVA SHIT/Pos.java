import java.util.Scanner;
public class Pos{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int positives = 0;
        int negatives = 0;
        int total = 0;
        int number = 0;
        int userCount = 0;
        double average = 0.0;

        System.out.println("Warm Welcome");
        
        do{
        System.out.print("Enter numbers: ");
        number = input.nextInt();
        

        if (number < 0) {negatives += 1;
        }else if (number > 0) {positives += 1;        
        }
        userCount += 1;
        total += number;
        average = total/(positives + negatives);

       }while (number != 0);
        
        System.out.println("The number of positives is: " + positives);
        System.out.println("The number of negatives is: " + negatives);
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);
          
        

                     
}


}






