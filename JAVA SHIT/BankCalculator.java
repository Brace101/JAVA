import java.util.Scanner;
public class BankCalculator{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        String moreCalculation = "Yes";

while (true){

        System.out.println("Enter the principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterest = input.nextDouble();

        System.out.println("Enter the duration in years: ");
        double duration = input.nextDouble();
        input.nextLine();

        double rate = (annualInterest/100)/12;

        double monthlyPayment = principalAmount * (rate * Math.pow(1 + rate,duration*12)) / (Math.pow(1 + rate, duration*12) - 1);
        System.out.printf("Your monthlyPayment is %.2f\n", monthlyPayment);

        System.out.println("Do you want to calculate more? Yes or No");
        moreCalculation = input.nextLine();


if (moreCalculation.equalsIgnoreCase("No")){
break; 
        

}

        

    }
}

}

