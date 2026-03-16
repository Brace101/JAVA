public class Nest1{
    public static void main (String [] arg){
    
    for (int row = 1; row <= 5; row++) {

         for (int column = 1; column <= row; column++) {
         System.out.print("*");
         }


         for (int column = 10; column >=row+row; column--) {
            
                System.out.print("*");
         }
         System.out.println();
        }

    for (int row = 5; row >= 1; row--) {
        for (int column = 1; column <= row; column++) {
             System.out.print("4");
             }
             System.out.println();
            }



}
}
