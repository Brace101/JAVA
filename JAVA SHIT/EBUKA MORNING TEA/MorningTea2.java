import java.util.Scanner;
public class MorningTea2{
public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String wordF = input.nextLine();

    System.out.print("Enter a number: ");
    int number = input.nextInt();
    String text = "";

    for (int index = 0; index < wordF.length(); index++){    
      for(int count =0; count < number;count++){
    text += wordF.charAt(index);
}
    }
    System.out.println(text);

}
}
