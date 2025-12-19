import java.util.Scanner;
public class ClassTask{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter score: ");
        int score = input.nextInt();

        if (score >= 70){
        System.out.println("A");
        System.out.println("You be Agba");}
        
        else if (score >= 60){
        System.out.println("B");
        System.out.println("you sef no bad o");}

        else if (score >= 50)
        System.out.println("C");

        else if (score >= 40)
        System.out.println("D");

        else 
        System.out.println("YOU BE OLODO");

//Grade Task


}

}
