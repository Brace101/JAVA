import java.util.Scanner;
public class Energy{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter weight");
    double weight = input.nextDouble();

    System.out.println("Enter finalTemperature");
    double finalTemperature = input.nextDouble();

    System.out.println("Enter initialTemperature");
    double initialTemperature = input.nextDouble();
    
    double joules = (weight * (finalTemperature - initialTemperature) * 4184);
    System.out.printf("joules is %.1f\n: ", joules);



}

}
