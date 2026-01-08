import java.util.Scanner;
public class NumberChecker{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
    int positives = 0;
    int negatives = 0;
            int number = 0;
            int odd = 0;
            int even = 0;
            int three = 0;
            int five = 0;

do{
        System.out.print("Enter numbers: ");
        number = input.nextInt();

        if (number < 0) {negatives += 1;
        }else if (number > 0) {positives += 1;
        
        if (number % 2 == 0) {even += 1;
        }else if (number % 2 != 0) {odd += 1;

        if (number % 3 == 0) {three += 1;
        }else if (number % 5 == 0){five += 1;
}
               
}}
}        while (number != 0);

        System.out.println("The number of odd number is: " + odd);
        System.out.println("The number of even number is: " + even);        
        System.out.println("The number of positives is: " + positives);
        System.out.println("The number of negatives is: " + negatives);
        System.out.println("The number divisible by 3 is: " + three);
        System.out.println("The number divisible by 5 is: " + five);
                
        



}}
