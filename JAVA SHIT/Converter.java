import java.util.Scanner;
public class Converter{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

       System.out.print("Enter celcius: ");
       double celcius = input.nextDouble();

       double Fahrenheit = (9.0 / 5) * celcius + 32;

       System.out.printf("43 celsius is 109.4 %.1f\n", celcius);

      
}


}
