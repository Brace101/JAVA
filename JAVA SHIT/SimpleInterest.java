import java.util.Scanner;
public class SimpleInterest {

   public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print ("Enter principal amount:");
    double principalamount=input.nextDouble();

    System.out.print("Enter rate:");
    double rate=input.nextDouble();

     System.out.print("Enter interest:");
     int time=input.nextInt();

     double interest = (double)(principalamount*rate*time)/100;
     System.out.printf("Your simple intrest is %f%n", interest);

    }

}
