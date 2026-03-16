public class Nested9{
    public static void main (String [] args){

    int space=1;

    for (int row = 1; row <=5; row++){ 
        
        System.out.printf("%"+ space +"s", "");
        
            space++;
        
        for (int col = row; col <=5; col++){
        
                System.out.print("*");

        }
        System.out.printf("  ");


        for (int col = row; col <=5; col++){
        
                System.out.print("*");

        }
            System.out.println();
}


}}
