import java.util.Scanner;
public class Snacks{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);

        double payment = 0;
        int counter = 0;
        double numOfDelivery = 0;
        String rider="start";

String riderMenu = ("""
        
         ___________________________________________________
        |                |                  |               |   
        |Collection Rate | Amount per parcel|  Base Pay     |
        |________________|__________________|_______________|
        |                |                  |               | 
        | Less than 50%  |              160 |    5,000      |
        |________________|__________________|_______________|       
        |                |                  |               |
        | 50 - 59%       |              200 |    5,000      |
        |________________|__________________|_______________|
        |                |                  |               |
        | 60 - 69%       |              250 |    5,000      |
        |________________|__________________|_______________|
        |                |                  |               |
        | >=70%          |              500 |    5,000      |
        |________________|__________________|_______________|
                                  

""");
System.out.print(riderMenu);
    

while (rider=="start"){

    System.out.println("Enter number of successful delivery: ");
    numOfDelivery = input.nextDouble();
    input.nextLine();

    if (numOfDelivery < 0){
    System.out.println("Theres no payment for you");
    }

    else if (numOfDelivery <=50){
    payment = (numOfDelivery * 160) + 5000;
    System.out.println("The paymennt for the day is: " + payment);

    }else if
    (numOfDelivery > 50 && numOfDelivery <= 59){
    payment = (numOfDelivery * 200) + 5000;
    System.out.println("The paymennt for the day is: " + payment);
    }

    else if
    (numOfDelivery > 60 && numOfDelivery <= 69){
    payment = (numOfDelivery * 250) + 5000;
    System.out.println("The paymennt for the day is: " + payment);
    }

    else if
    (numOfDelivery >= 70){
    payment = (numOfDelivery * 500) + 5000;
    System.out.println("The paymennt for the day is: " + payment);

    }
System.out.println();

    while(rider=="start"){
    System.out.println("Would you like to calculate for more dipatcher? Yes / No");
    String moreRider = input.nextLine();
   

    if (moreRider.equalsIgnoreCase("Yes")){
        counter++;
        break;
        }
    else if (moreRider.equalsIgnoreCase("No")){
        System.out.println("Thanks usng this app");
        rider="stop";        
        break; 
        } else{
                    System.out.println("INvalid input");
                    continue;
        }
        }   
}    

}
    }   

