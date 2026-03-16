import java.util.Scanner;

public class WeekendExcercise14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        while(number > 0){
            int digit = number % 10;  

            if(digit % 2 == 0){        
                sum += digit;
 }

            number = number / 10;    
  }

        System.out.println("Sum of even digits = " + sum);
    }
}
