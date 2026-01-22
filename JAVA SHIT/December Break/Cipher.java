import java.util.Scanner;
public class Cipher{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    String newWord = "";

    System.out.println("Enter a word: ");
    String word = input.nextLine();

    System.out.println("Enter number: ");
    int number = input.nextInt();

for (int index = 0; index <word.length(); index++){ 
    char eachWord = word.charAt(index);
    int figNum = eachWord + number;
    char finalfig=(char) figNum;
    newWord = newWord + finalfig; 
    

}
    System.out.println(newWord);
    

}

}
