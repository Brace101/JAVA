import java.util.Scanner;
public class SimpleAtm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 1000;
        int pin = 1234;

        while (true) {

            String menu = """
            ---WELCOME TO YOUR TRACKING SYSTEM---

            1. Deposit funds
            2. Withdraw funds
            3. Show current balance
            4. Exit the app
            """;

            System.out.println(menu);
            System.out.print("Enter option: ");
            int option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Kindly enter deposit amount: ");
                    double deposit = input.nextDouble();

                    System.out.print("Kindly input your transaction PIN: ");
                    int transPin = input.nextInt();

                    if (transPin == pin) {
                        balance = balance + deposit;
                        System.out.println("You have successfully deposited.");
                        System.out.println("Your available balance is: " + balance);
                    } else {
                        System.out.println("Incorrect PIN.");
                    }
                    break;

                case 2:
                    System.out.print("Kindly enter your withdrawal amount: ");
                    double withdrawal = input.nextDouble();

                    System.out.print("Kindly input your transaction PIN: ");
                    transPin = input.nextInt();

                    if (transPin != pin) {
                        System.out.println("Incorrect PIN.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance = balance - withdrawal;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Your available balance is: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for choosing us.");
                    System.out.println("Enjoy the rest of your day.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
