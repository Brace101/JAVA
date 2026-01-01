import java.util.Scanner;
public class CardValidator{
        public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean notDigitOnly=false;
       
      
        int sum=0;
        

        System.out.print("Hello, kinldy enter your card details  to verify: ");
        String cardDetails = input.nextLine();

        if (cardDetails.startsWith("4")){
        System.out.println("Your card is VisaCard");
}
        else if (cardDetails.startsWith("5")){
        System.out.println("Your card is MasterCard");
}
        else if (cardDetails.startsWith("37")){
        System.out.println("Your card is American Express card");
}
        else if (cardDetails.startsWith("6")){
        System.out.println("Your card is Discoverycard");    
} 
        else 
        System.out.println("Invalid card number");


        if (cardDetails.length() >= 13 && cardDetails.length() <= 16) {

        for (int index = 0; index < cardDetails.length(); index++) {
        if (!Character.isDigit(cardDetails.charAt(index))) {
            notDigitOnly = true;
            break;
        }
    }

        if (notDigitOnly) {
        System.out.println("Card is invalid");
    }   else {
        System.out.println("Card is valid");
}
}
        for (int index=cardDetails.length()-1; index >=0 ; index--){
        int digit = cardDetails.charAt(index)-'0';

        if (index%2==0) {
                digit *= 2;
                if (digit > 9) {
                    digit =  digit/10 + digit%10;
        }
        }       
        sum += digit;
       }     

        if (sum % 10 == 0) {
            System.out.println("Card is valid");
        } else {
            System.out.println("Card is invalid");
        }
}
}

    
    
   
        
  



















































