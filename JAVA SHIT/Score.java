import java.util.Scanner;
public class Score{
public static void main (String [] args){
    Scanner input = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = input.nextInt();

        if (score >= 70)
        System.out.println("A");

        else if (score >= 60)
        System.out.println("B");

        else if (score >= 50)
        System.out.println("c");

        else if (score >= 40)
        System.out.println("D");

        else 
        System.out.println("OLODO NI E JO");




        


}

}
