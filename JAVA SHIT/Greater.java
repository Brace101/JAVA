import java.util.Scanner;
public class Greater{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if(number > 100)
        System.out.println("NUmber is greater than 100");

        else 
        System.out.println("Number is not greater than 100");

}

}
