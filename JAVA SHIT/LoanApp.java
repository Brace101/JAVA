import java.util.Scanner;

public class LoanApp{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Loan Amount: ");
    int loanAmount = input.nextInt();

    System.out.println("Enter loan period in number of years: ");
    int loanPeriod = input.nextInt();

    System.out.println("Interest Rate       Monthly Payment    Total Payment");

    for (double rate = 5.0; rate <= 10.0; rate += 0.25){
    
    double monthlyInterestRate = rate / 1200;

    int numberOfMonths = loanPeriod * 12;

    double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

    double totalPayment = monthlyPayment * numberOfMonths;

    System.out.printf("%.3f%%        %.2f        %.2f\n", rate, monthlyPayment, totalPayment);


}


}

    }
