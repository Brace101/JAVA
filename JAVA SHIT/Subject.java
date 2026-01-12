import java.util.Scanner;
public class Subject{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);

        int numberOfSubjects;
        int score;
        int totalScore = 0;
        double average;
        char grade;

      
        System.out.print("Enter number of subjects: ");
        numberOfSubjects = input.nextInt();

       
        for (int index = 1; index <= numberOfSubjects; index++) {
            System.out.print("Enter score for subject " + index + ": ");
            score = input.nextInt();

            totalScore += score;
        }

  
        average = totalScore/numberOfSubjects;

        if (average >= 90) { grade = 'A';
        } else if (average >= 75) { grade = 'B';
        } else if (average >= 60) { grade = 'C';
        } else if (average >= 50) { grade = 'D';
        } else { grade = 'F';
        }

        System.out.println("Total Score is: " + totalScore);
        System.out.println("Average Score is: " + average);
        System.out.println("Final Grade is: " + grade);

    }
}

