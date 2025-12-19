import java.util.Scanner;
public class Temperature {
public static void main (String [] args ){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Temerature in kelvin");
        double tempk = input.nextDouble();
        double tempc = tempk - 273.15;
        double tempf = ((tempk - 273.15)*9/5) +32;
        
        System.out.printf("Your temperature in kelvin is %f %n", tempk);
        System.out.printf("Your temperature in celsius is %f%n;", tempc);
        System.out.printf("Your temperature in fahrenheit is %f%n;" ,tempf);




}


}
