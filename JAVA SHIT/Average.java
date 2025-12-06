import java.util.Scanner;
public class Average {
public static void main (String [] args){
Scanner input = new Scanner(System.in);

    System.out.print ("Enter Score1");
    int score1 = input.nextInt();
    
    System.out.print ("Enter Score2");
    int score2 = input.nextInt();

    System.out.print ("Enter Score3");
    int score3 = input.nextInt();

    int total = score1 + score2 + score3;
    double average = (double)(score1+ score2 + score3)/3;
    System.out.printf("Your total is : %d%n," ,total);
    

}

}
