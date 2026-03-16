import java.util.Scanner;
public class LoopTask4{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    int pass = 0;
    int fail = 0;
    int scoreCounter = 0;
    
    while (scoreCounter <= 15){

    System.out.print("Enter score: ");
    int score = input.nextInt();

    pass = scoreCounter < 45;
    fail = scoreCounter >= 45;
    scoreCounter = scoreCounter + 1;
    }

    System.out.printf("%number of pass is %d%n", pass);
    System.out.printf("%number of fail is %d%n", fail);    

        }    

}
