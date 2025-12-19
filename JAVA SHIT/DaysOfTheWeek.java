import java.util.Scanner;
public class DaysOfTheWeek{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

    System.out.print("Enter days : ");
    int num = input.nextInt();

if (num % 7 == 1)
       System.out.printf("it will be saturday in %d day time%n",num);
if (num % 7 == 2)
       System.out.printf("it will be sunday in %d day time%n",num);
if (num % 7 == 3)
       System.out.printf("it will be monday in %d day time%n",num);
if (num % 7 == 4)
       System.out.printf("it will be teusday in %d day time%n",num);
if (num % 7 == 5)
       System.out.printf("it will be wednesday in %d day time%n",num);
if (num % 7 == 6)
       System.out.printf("it will be thursday in %d day time%n",num);
if (num % 7 == 0)
       System.out.printf("it will be friday in %d day time%n",num);










}











}
