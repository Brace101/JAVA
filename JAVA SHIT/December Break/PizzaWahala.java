import java.util.Scanner;
    public class PizzaWahala{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);

        int numberOfSlices = 0;
        int numberOfPeople;
        int price = 0;

    System.out.println("DEAR ESTEEM CUSTOMER, YOU ARE WELCOME TO PIZZA WAHALA JOINT");
    System.out.println("Kindly go through our menulist");

String Menu = """
____________________________________________________
            |                  |                    |    
 Pizza Type | Number of slices |  Prices per Box    |
____________|__________________|____________________|           
            |                  |                    |
 SAPA SIZE  |       4          |    2,000           |
____________|__________________|____________________|
            |                  |                    |
 SMALL MONEY|       6          |    2,400           |
____________|__________________|____________________|
            |                  |                    |
 BIG BOYS   |       8          |    3,000           |
____________|__________________|____________________|              
            |                  |                    |
 ODOGWU     |       12         |    4,200           | 
____________|__________________|____________________|    

""";
    System.out.print(Menu);

    System.out.println("Dear Customer, kindly place your order here (Pizza Type)");
    String order = input.nextLine();

    System.out.println("Kindly input number of people");
    numberOfPeople = input.nextInt();

switch (order){

            case "SAPA SIZE":
                price = 2000;
                numberOfSlices = 4;
                break;

            case "SMALL MONEY":
                price = 2400;
                numberOfSlices = 6;
                break;

            case "BIG BOOYS":
                price = 3000;
                numberOfSlices = 8;
                break;
    
            case "ODOGWU":
                price = 4200;
                numberOfSlices = 12;
             
            default:
                    System.out.println("Dear Customer, you've inputted a wrong selection"); 
                    System.exit(0); 
}
        int numberOfBoxes = (int) Math.ceil((double) numberOfPeople / numberOfSlices);
        System.out.println("Number of boxes for everyone is:" + numberOfBoxes);

        int remainingSlices = (numberOfBoxes * numberOfSlices) - numberOfPeople;
        System.out.println("Remaining slices is:" + remainingSlices);

        int totalPrice = numberOfBoxes * price;
        System.out.println("The total price for each boxes is:" + totalPrice);

        System.out.println();

        System.out.println("Kinly make your payment to the account below");
        System.out.println("\tADEYEMI OLALEKAN ABIDEMI\n \t8100203675\n \tMONIEPOINT\n");

        System.out.println("Thanks for your contineous patronage, ENJOY YOUR PIZZA...");


}


}
