import java.util.Scanner;
public class Milage{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        while (counter <= tripNumber){

        System.out.println("Enter miles driven: ");
        int milesdriven = input.nextInt();

        System.out.println("Enter galoons of fuel used: ");
        int galoons = input.nextInt();

        double milesperGallon = (double) milesdriven/gallons;

        System.out.printf("The miles per gallon for trip %d is %.2f%n", counter, milesPerGallon );

        sumOfMilesPerGallon += milesPerGallon;
        
        counter++;

        double averageMIlesPerGallon = sumOfMilesPerGallon/tripNumber;

        System.out.printf("The averagemiles per gallon for %d trips is %.2f%n");
    
        


}

}





}
