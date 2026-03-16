public class PizzaWahalaPt2 {
    
    public static void displayWelcomeMessage() {
        System.out.println("DEAR ESTEEM CUSTOMER, YOU ARE WELCOME TO PIZZA WAHALA JOINT");
        System.out.println("Kindly go through our menu list");
    }

    public static void displayMenu(){

        String menu = ("""
            ___________________________________________________
           |           |                  |                    |  
           |Pizza Type | Number of slices |  Prices per Box    |
           |___________|__________________|____________________|           
           |           |                  |                    | 
           | SAPA SIZE |       4          |    2,000           |
           |___________|__________________|____________________|
           |           |                  |                    |   
           |SMALL MONEY|       6          |    2,400           |
           |___________|__________________|____________________|
           |           |                  |                    |    
           | BIG BOYS  |       8          |    3,000           |
           |___________|__________________|____________________|
           |           |                  |                    |     
           | ODOGWU    |       12         |    4,200           |
           |___________|__________________|____________________|
        """);

        System.out.println(menu);
    }

    public static int getNumberOfSlices(String order) {

        switch (order) {
            case "SAPA SIZE":
                return 4;
            case "SMALL MONEY":
                return 6;
            case "BIG BOYS":
                return 8;
            case "ODOGWU":
                return 12;
            default:
                System.out.println("Wrong selection");
                return 0;
        }
    }

    public static int getPrice(String order) {

        switch (order) {
            case "SAPA SIZE":
                return 2000;
            case "SMALL MONEY":
                return 2400;
            case "BIG BOYS":
                return 3000;
            case "ODOGWU":
                return 4200;
            default:
                return 0;
        }
    }

    public static double getBoxes(double numberOfPeople, double numberOfSlices) {
        return Math.ceil(numberOfPeople / numberOfSlices);
    }

    public static double getRemainingSlices(double numberOfBoxes, double numberOfSlices, double numberOfPeople) {
        return (numberOfBoxes * numberOfSlices) - numberOfPeople;
    }

    public static double getTotalPrice(double numberOfBoxes, double price) {
        return numberOfBoxes * price;
    }

    public static void displayAccountDetails() {
        System.out.println("Kindly make your payment to the account below");
        System.out.println("\tADEYEMI OLALEKAN ABIDEMI");
        System.out.println("\t8100203675");
        System.out.println("\tMONIEPOINT");
    }

    public static void displayThankYouMessage() {
        System.out.println("Thanks for your continuous patronage, ENJOY YOUR PIZZA...");
    }

}
