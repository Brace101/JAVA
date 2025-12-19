import java.util.Scanner;
public class Grade{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = input.nextInt();

    if (number >= 70)
    System.out.println("Excellent");

    else if (number >=60)
    System.out.println("Very Good");

    else if (number >= 50)
    System.out.println("Good, you try sha");

    else 
    System.out.println("Carry Over guy");
    
}

}
    
