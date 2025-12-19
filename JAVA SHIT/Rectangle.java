import java.util.Scanner;
public class Rectangle{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter lenght: ");
        int lenght = input.nextInt();

        System.out.print("Enter breath: ");
        int breath = input.nextInt();

        int area = lenght * breath;
        System.out.println("area :" + area);



}

}


        
