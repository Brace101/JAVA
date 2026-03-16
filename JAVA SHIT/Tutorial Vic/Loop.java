public class Loop{
    public static void main (String [] args){

    for (int row = 5; row >= 1; row--){

        for (int space = 5; space >=row+1; space--){
                
            System.out.print("  ");
}
        for (int column =1; column <= row; column++){

            System.out.print("* ");

}
            System.out.println();
        }   

    for (int row = 1; row <= 5; row ++){

        for (int column = 1; column <= row; column ++){

            System.out.print("*" + " ");
}
            
            System.out.println();

}
}


}
