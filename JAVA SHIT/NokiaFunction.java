import java.util.Scanner;
public class NokiaFunction{         
    public static void main(String[] args){  
        Scanner input = new Scanner(System.in);

String menu = """

        WELCOME NOKIA MENU("JESUS IS LORD");

    1.  Phone Book
    2.  Messages
    3.  Chat
    4.  Call Register
    5.  Tones
    6.  Settings
    7.  Call Divert
    8.  Games
    9.  Calculator
    10. Reminders
    11. Clock
    12. Profiles
    13. SIM Services
""";

System.out.println(menu);
    System.out.print("Enter Option: ");
    int option = input.nextInt();

    switch (option){  
        case 1 ->{    
       menu = """

    1. Search
    2. Service Nos.
    3. Add name 
    4. Erase
    5. Edit
    6. Assign tone
    7. Send b'card
    8. Option
    9. Speed dials
    10. Voice tags
""";
System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
        switch (option){  
            case 1 -> {System.out.println("Search");}
            case 2 -> {System.out.println("Service Nos");}
            case 3 -> {System.out.println("Add Names");}
            case 4 -> {System.out.println("Erase");}
            case 5 -> {System.out.println("Edit");}
            case 6 -> {System.out.println("Assign tone");}
            case 7 -> {System.out.println("Send b'card");}
            case 8 -> { 
    menu = """
            OPTIONS
    1. Type of views
    2. Memory Status
""";
System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();

        switch(option){ 
             case 1 -> {System.out.println("Type of view");}
             case 2 -> {System.out.println("Type of view");}
             case 3 -> {System.out.println("Enter valid number");}


             case 9 -> {System.out.println("Speed dials");}
             case 10 -> {System.out.println("voice tags");}
             default -> {System.out.println("Enter valid Number");}

        
}}}}}



    System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();


      switch (option){ 
     case 2 -> {  
        menu = """ 
    MESSAGES
        1.write messages
        2. inbox
        4. Picture Messages
        5. Template
        6. Smileys
        7. Messages settings
        8. Info Service
        9. Voice mailbox number
        10. Service command editor

 switch (option){
    case 1 -> {System.out.println(" Write message");}
    case 2 -> {System.out.println("inboxx");}
    case 3 -> {System.out.println("outbox");}
    case 4 -> {System.out.println("picture message");}
    case 5 -> {System.out.println("Template");}
    case 6 -> {System.out.println("Smileys");}
    case 7 -> {

""";    

menu ="""
            MESSAGE SETTINGS
        1. Set 1
        2. Common 3
""";
    switch(option){
        case 1 -> {
    menu ="""
            MESSAGE SETTINGS   

        1. Message centre number
        2. Message send as
        3. Message validity 

""";
     System.out.println(menu);
                  System.out.print("Enter option: ");
                    option = input.nextInt();

                    
        
}}}}
















































































}

} 

