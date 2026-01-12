import java.util.Scanner;
public class SubjectScore{
public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of subjects: ");
    int subject = input.nextInt();

    System.out.println("Enter score for subject 1: ");
    int subject1 = input.nextInt();

    System.out.println("Enter score for subject 2: ");
    int subject2 = input.nextInt();

    System.out.println("Enter score for subject 3: ");
    int subject3 = input.nextInt();

    int totalScore = subject1 + subject2 + subject3;
    
    int averageScore = subject1 + subject2 + subject3/3;

    if (score >= 90)
        System.out.println("A");

        else if (score >= 89)
        System.out.println("B");

        else if (score >= 74)
        System.out.println("c");

        else if (score >= 59)
        System.out.println("D");

        else

        
    

}}
