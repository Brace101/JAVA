import java.util.Scanner;
public class Velocity{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

       System.out.print("Enter starting velocity: ");
       double startingVelocity = input.nextDouble();

       System.out.print("Enter ending velocity: ");
       double endingVelocity = input.nextDouble();

       System.out.print("Enter time: ");
       double time = input.nextDouble();

       double acceleration = (endingVelocity - startingVelocity) / time;
       System.out.printf("acceleration is %f\n: ", acceleration);

       
        

}

}
    
