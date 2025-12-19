import java.util.Scanner;
public class Cylinder{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter radius: ");
    double radius = input.nextDouble();

    System.out.println("Enter length: ");
    int length = input.nextInt();

    double pi = 3.1415;

    double area = radius * radius * pi;
    System.out.printf("Area is: %.4f\n ", area);

    double volume = area * length;
    System.out.printf("volume is: %.1f\n ", volume);


}

}
