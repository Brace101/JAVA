import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLog {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        int pin = 1234;

        ArrayList<String> transactions = new ArrayList<>();

        while (true) {

String menu = """

            ---WELCOME TO YOUR TRANSACTION LOG APP---

            1. Deposit funds

            2. Withdraw funds

            3. Show your transaction history

            4. Exit the app

""";
            
            System.out.println(menu);
            System.out.println("Enter option: ");
            int option = input.nextInt();

switch (option) {

case 1:
            System.out.print("Kindly enter deposit amount: ");
            double deposit = input.nextDouble();

            System.out.print("Kindly input your transaction PIN: ");
            int transPin = input.nextInt();

            if (transPin == pin) {
            balance += deposit;
            transactions.add("Deposited " + deposit);
            System.out.println("You have successfully deposited.");
            System.out.println("Your available balance is: " + balance);

            } else {
            System.out.println("Incorrect PIN.");
                    }

break;

case 2:
            System.out.print("Kindly enter your withdrawal amount: ");
            double withdrawal = input.nextDouble();

            System.out.print("KIndly input your transaction PIN: ");
            transPin = input.nextInt();

            if (transPin != pin) {
            System.out.println("Incorrect PIN.");

            } else if (withdrawal > balance) {
            System.out.println("Insufficient balance.");

            } else {
            balance -= withdrawal;
            transactions.add("Withdrew " + withdrawal);
            System.out.println("Withdrawal successful.");
            System.out.println("Your available balance is: " + balance);
            }
break;

case 3:
                    
            System.out.print("View your transaction history? Yes/No: ");
            String transHistory = input.nextLine();
            input.nextLine();

            if (transHistory.equalsIgnoreCase("Yes")) {
             
            } else {
            System.out.println("Transaction History:");
            for (int index = 0; index < transactions.size(); index++) {
            System.out.println((index + 1) + ". " + transactions.get(index));   

}
            if (transactions.isEmpty()) {
            System.out.println("You don't have any transaction history yet.");
}
}
break;

case 4:
            System.out.println("Thank you for using the app.");
            System.out.println("Enjoy the rest of your day.");
            
         
            System.exit(0);
        
break;
}
}
}
}

