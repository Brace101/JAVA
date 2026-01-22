import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("How many students do you have? ");
    int studentNum = input.nextInt();

    System.out.println("How many subject do they offer? ");
    int subjectOffer = input.nextInt();

    int[][] studentGrade = new int [studentNum][subjectOffer];

    for (int index = 0; index < studentNum; index++){

    for (int number = 0; number < subjectOffer; number++){

while (true){

     System.out.println("Enter subject " + (number+1) + " scores for student " + (index+1) + ": ");
     int score = input.nextInt();

        if (score >= 0 && score <= 100){
        studentGrade[index][number] = score;
        break;
        } else {
        System.out.println("You have entered an invalid score. Score should be greater than 0 or less than 100.");        
}}


    }
    }
  
System.out.println("""

Saving>>>>>>>>>>>>>>>>>>>>>>>>
Information saved successfully

""");
System.out.println();
for (int index = 1; index < 100; index++) System.out.print("=");

String headLine = "\nStudent\t ";

for (int subject = 0; subject < subjectOffer; subject++) headLine += "Subject " + (subject + 1) + "\t";
headLine += "TOTAL\tAVE\tPOS";
System.out.println(headLine);

    for (int index = 1; index <= 100; index++) System.out.print("=");

String      















}



}
