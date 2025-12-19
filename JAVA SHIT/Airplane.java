import java.util.Scanner;
public class Airplane{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

       System.out.println("Enter velocity in meter");
       double velocity = input.nextDouble();

       System.out.println("Enter acceleration in meter");
       double acceleration = input.nextDouble();

       double length = velocity * velocity / 2 * acceleration;
       System.out.printf("length for this is %f\n: ", length); 

}

}


