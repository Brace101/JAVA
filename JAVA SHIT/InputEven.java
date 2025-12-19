import java.util.Scanner;
public class InputEven{
public static void main(String [] args){
Scanner input = new Scanner (System.in);

for (int number = 1; number<= 10; number++){
System.out.print ("Enter number");
int Number = input.nextInt();

if(number%2==0) {
        System.out.printf("%d is an even number %n ", number);



}

}
}

}
