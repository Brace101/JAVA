import java.util.Scanner;
public class Divisible{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if(number % 5 == 0)
        System.out.println("NUmber is divisible by 5");

        else
        System.out.println("NUmber is not divisible by 5");



}

}

