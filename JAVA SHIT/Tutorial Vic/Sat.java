//
//public class Sat{
//   
//    public static int getFactorial(int number){
//    
//    int factorial = 1;
//
//    for (int count = number; count >=1; count --){
//    
//    factorial = count * factorial;
//    }
//    return factorial;
//
//   }   
//
//    }
//    
// 

   
//public class Sat{
//    public static int product(int firstNumber, int secondNumber) {
//        
//        return firstNumber * secondNumber; 
//   
//    }
//
//    public static double product(double firstNumber, double secondNumber) {
//        
//        return firstNumber * secondNumber;
//     
//   
//    }
//}


//
//public class Sat{
//   
//    public static int getReversal(int [] number){
//
//    int odd = 0;
//    int even = 0;
//    
//    for (int count = number; count < number.length; count ++){
//    
//    if (number[index] % 2 == 0){
//    }
//    if (number[index] !% 2 == 0){
//    }
//    
//   }
//    return number(index);
//   }
//
//
//}
//
//    }

import java.util.ArrayList;
public class TransactionLog{

    public static double depositMoney(double amount, double accountBalance, ArrayList <String> transactions){

        accountBalance = accountBalance + amount;
    
    String transactionDetails = String.format("Deposited: N%.2f|New Balance: N%.2f:" , amount, accountBalance);
    
    transactions.add(transactionDetails);

    return accountBalance;
} 

    }

import java.util.ArrayList;
public class TransactionLog{

    public static double withdrawMoney(double amount, double accountBalance, ArrayList <String> transactions){
    
        if (amount <= accountBalance && amount > 0){
             accountBalance = accountBalance - amount;
    String transactionDetails = String.format("Withdrew: N%.2f | New Balance: N%.2f:" , amount, accountBalance); 
    return accountBalance;
    }
    
    if (amount > accountBalance){
    System.out.println("Insufficient Funds");    
    }else{
    System.out.println("Invalid Input"); 

    transactions.add(transactionDetails);

    return accountBalance;
} 

    }

























