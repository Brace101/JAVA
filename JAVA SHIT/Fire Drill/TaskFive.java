import java.util.Scanner;
public class TaskFour{
public static void main(String [] args){
Scanner input = new Scanner (System.in);

int scoreEven = 0;

for(int number = 1; number <= 10; number++){
    System.out.print("Enter number: "); 
    int scores = input.nextInt();

if(scores % 2 == 0){
        scoreEven += scores;

}
}

 System.out.printf("the sum of the even indexed score is %d%n", scoreEven);
}
}
