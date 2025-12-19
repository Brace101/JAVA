import java.util.Scanner;
public class Add{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();

        //int sum = num1 + num2 + num3 + num4;

        System.out.printf("sum is %d%n" , num1 + num2 + num3 + num4);
        




}


}
