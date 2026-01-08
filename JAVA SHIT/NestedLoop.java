import java.util.Scanner;
public class NestedLoop{
    public static void main (String [] arg){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter start number");
    int firstNum = input.nextInt();
    
    System.out.println("Enter finish number");
    int secondNum = input.nextInt();
    
        for (int index = firstNum; index <= secondNum; index++){
        for (int john = 1; john <=secondNum; john++){

        System.out.print(index*john + "\t");
}
        System.out.println();
}
                  

}}
