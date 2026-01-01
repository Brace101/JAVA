import java.util.Scanner;
public class Pounds{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number in pounds: ");
    double pounds = input.nextDouble();

    double kilogram = pounds * 0.454;
    System.out.println("55.5 pounds is: " + kilogram);




}

}



