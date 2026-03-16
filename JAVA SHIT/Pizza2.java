public class Pizza2 {

    public static void main(String[] args){
        
        String order = "";
        int numberOfPeople = 0;

        int numberOfSlices;
        int price;

        double numberOfBoxes;
        double remainingSlices;
        double totalPrice;
        
        PizzaWahalaPt2.displayWelcomeMessage();
        PizzaWahalaPt2.displayMenu();
        
        numberOfSlices = PizzaWahalaPt2.getNumberOfSlices(order);
        price = PizzaWahalaPt2.getPrice(order);

        numberOfBoxes = PizzaWahalaPt2.getBoxes(numberOfPeople, numberOfSlices);
        remainingSlices = PizzaWahalaPt2.getRemainingSlices(numberOfBoxes, numberOfSlices, numberOfPeople);
        totalPrice = PizzaWahalaPt2.getTotalPrice(numberOfBoxes, price);

        System.out.println("Number of slices per box: " + numberOfSlices);
        System.out.println("Price per box: " + price);
        System.out.println("Number of boxes needed: " + numberOfBoxes);
        System.out.println("Remaining slices: " + remainingSlices);
        System.out.println("Total price: " + totalPrice);

        PizzaWahalaPt2.displayAccountDetails();
        PizzaWahalaPt2.displayThankYouMessage();
    }
}
