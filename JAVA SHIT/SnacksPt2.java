public class SnacksPt2 {
    
    public static String printMenu() {
        return """
         ___________________________________________________
        |                |                  |               |   
        |Collection Rate |Amount per parcel |  Base Pay     |
        |________________|__________________|_______________|
        |                |                  |               | 
        | Less than 50   |              160 |    5,000      |
        |________________|__________________|_______________|       
        |                |                  |               |
        | 50 - 59        |              200 |    5,000      |
        |________________|__________________|_______________|
        |                |                  |               |
        | 60 - 69        |              250 |    5,000      |
        |________________|__________________|_______________|
        |                |                  |               |
        | >=70           |              500 |    5,000      |
        |________________|__________________|_______________|
        """;
    }

        public static double calculatePayment(double deliveries) {

        double payment = 0;

        if (deliveries < 0) {
            return 0;
        }

        else if (deliveries <= 50) {
            payment = (deliveries * 160) + 5000;
        }

        else if (deliveries <= 59) {
            payment = (deliveries * 200) + 5000;
        }

        else if (deliveries <= 69) {
            payment = (deliveries * 250) + 5000;
        }

        else {
            payment = (deliveries * 500) + 5000;
        }

        return payment;
    }

    public static String displayPayment(double payment) {

        if (payment == 0) {
            return "There is no payment";
        }else{

        return "The payment for the day is: " + payment;
        }
    }

    public static String checkMoreDispatcher(String moreRider, int counter) {

        if (moreRider.equalsIgnoreCase("Yes")) {
            counter++;
            return "yes";
        }

        else if (moreRider.equalsIgnoreCase("No")) {
            System.out.println("Thanks using this app");
            return "no";
        }

        else {
            System.out.println("Invalid input");
            return "invalid";
        }
    }

}

