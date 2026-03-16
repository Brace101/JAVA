import java.util.Scanner;
    public class CollectName {
    public static void main(String[] args) {
    userName(); userMail(); phoneNumber(); houseAddress(); 
}
      
    public static String userName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your name: ");
        String name = input.nextLine();
        return name;  
    }
    
    public static String userMail() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your Email: ");
        String email = input.nextLine();
        return email;  
    }
     
     public static String phoneNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your phone number: ");
        String number = input.nextLine();
        return number;  
   }
    
    public static String houseAddress() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your house address: ");
        String address = input.nextLine();
        return address;  
   }
    
}

        ArrayList<String> userInfo = new ArrayList<>();
       
