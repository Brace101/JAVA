import java.util.Scanner;
public class ClassTaskFive{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int sum = 0;
        int counter = 1;
        
        while (counter <= 10){

        System.out.printf("Enter score %d: ",counter);
        int score = input.nextInt();

        sum += score
        counter++;

        double  average = (double) sum/10;
        System.out.printf("THe average score is $.2f%n", average); 







}
}
}
