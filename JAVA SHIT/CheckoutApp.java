import java.util.Scanner;
import java.util.ArrayList;
    public class CheckoutApp{
        public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int counter = 0; 

        System.out.println("Enter customer's name: ");
        String customerName = input.nextLine();

        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Double> pricePieces = new ArrayList<>();
        ArrayList<Double> productUnit = new ArrayList<>();
    
        double discount=0;
        double subTotal=0;

        System.out.println("Enter date && Time: ");
        String DateTime = input.nextLine();
        
        while (true){

        System.out.println("Enter product name: ");
        productName.add(input.nextLine());

        System.out.println("Enter price per pieces: ");
        pricePieces.add(input.nextDouble());
        
        
        System.out.println("Enter product unit: ");
        productUnit.add(input.nextDouble());

        subTotal+= pricePieces.get(counter) * productUnit.get(counter);

   
        double vat = subTotal * 0.075;
    
        input.nextLine();
        
        System.out.println("Add more items? Yes Or No");
        String moreItems = input.nextLine();
        
        if (moreItems.equalsIgnoreCase("Yes")){
        counter++;
        
        }else{
        
        System.out.println("Enter discount in percentage without % symbol");
        discount = input.nextDouble();
        discount= (subTotal * 0.02);

        System.out.println("Enter Cashier name: ");
        String cashierName = input.nextLine();
        input.nextLine();
        double total= subTotal - discount;
        double billTotal = subTotal-discount+vat;

        
        System.out.printf("""
        WELCOME TO SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
        Tel: 08100203675
        Date && TIme: %s
        Cashier's name: %s
        Customer's name: %s
        =========================================================================
                                   ITEM    QTY     PRICE   TOTAL(NGN)
        -------------------------------------------------------------------------
              """,DateTime,cashierName,customerName);

            for(int index = 0; index < productName.size(); index++){ 
                           
                    double productSum = pricePieces.get(index) * productUnit.get(index);

              System.out.printf(" %8s       %6.2f       %11.2f      %13.2f%n",productName.get(index),pricePieces.get(index),productUnit.get(index),productSum);

}

System.out.printf(          """
        -------------------------------------------------------------------------
                                                subTotal:       %.2f
                                                discount:       %.2f
                                                vat @ 0.075:    %.2f
        =========================================================================
                                                  Bill Total:   %.2f
        =========================================================================
        THIS IS NOT AN RECEIPT KINDLY PAY %.2f

                                                                          
""", subTotal,discount,vat,billTotal,billTotal);

        System.out.println("How much did the customer give you?");
        double giveYou = input.nextInt();

        double Balance = giveYou - billTotal;


        System.out.printf("""
        WELCOME TO SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
        Tel: 08100203675
        Date && TIme: %s
        Cashier's name: %s
        Customer's name: %s
        ========================================================================
                                   ITEM    QTY     PRICE   TOTAL(NGN)
        ------------------------------------------------------------------------
""", DateTime,cashierName,customerName);
            
        for(int index = 0; index < productName.size(); index++){
              
                double productSum = pricePieces.get(index) * productUnit.get(index);
  
            System.out.printf("          %8s %6.2f %11.2f %13.2f%n",productName.get(index),pricePieces.get(index),productUnit.get(index),productSum);
              
}
        System.out.printf("""
        ------------------------------------------------------------------------
                                                subTotal:       %.2f
                                                discount:       %.2f
                                                vat @ 0.075:    %.2f
        ========================================================================
                                                Bill Total:     %.2f
                                                Amount paid:     %.2f
                                                Balance:         %.2f                        
        ========================================================================
                              THANKS FOR YOUR PATRONAGE
        ========================================================================

                                                                          
""", subTotal,discount,vat,billTotal,giveYou,Balance);
break;   
}

        
            

}
}

}


