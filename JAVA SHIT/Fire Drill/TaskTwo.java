import java.util.Scanner;
public class TaskTwo{
public static void main(String [] args){
Scanner input = new Scanner (System.in);

double scoreSum = 0.0;

for(int number = 1; number <= 10; number++){
    System.out.print("Enter number: "); 
    double scores = input.nextDouble();

    scoreSum += scores; 


}

double scoreAverage = scoreSum /10.0;    
System.out.printf("Class average is %.2f%n", scoreAverage);
System.out.printf("Class sum and average is %.2f and %.2f respectively%n", scoreSum, scoreAverage);
}
}
