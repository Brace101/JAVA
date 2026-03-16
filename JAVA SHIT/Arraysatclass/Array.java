public class Array{
    public static void main (String [] args){

//    String [] names = new String[5];
//    names [0] = "Lekan";
//    names [1] = "Victor";
//    names [2] = "Ola";
//    names [3] = "Wisdom";
//    names [4] = "Gbasa";
//
//    System.out.println(names[2]);


                //FORLOOP

//       String [] foods = {"Rice" , "Beans" , "Eba"};
//
//    for (int number = 0; number < 3; number++){
//
//       System.out.println(foods[number]);
//}

        //ENHANCED FOR LOOP

//        String [] foods = {"Rice" , "Beans" , "Eba"};
//    
//        for (String food:foods);
//
//        System.out.println(foods);


            //ASSIGNING NUMBERS TO ARRAY

//         int [] numbers = {0 , 1 , 2 , 3 , 4};
//
//    int total = 0;
//
//    for (int index = 0; index < 5; index ++){
//        
//        total += numbers[index];
//}
//     System.out.print(total);      

                //CLASSWORK

//    int [] numbers = {0 , 1 , 2 , 3 , 4};
//
//    int total = 0;
//
//    for (int index = 0; index< numbers.length; index ++){
//        
//        total += numbers[index];
//}
//     System.out.print(total);       
//     

        //Swap an Array

//    String [] food = {"Rice" , "Beans" , "Yam"};
//
//        food [0] = "plantain"
//
//        System.out.print(food[0]);

       //CLASSWORK 1
    
//    double total = 0;
//    double average = 0;
//    int counter = 0;
//
//      double [] number = {0 , 1 , 2, 3,4, 5, 6, 7, 8, 9};
//
//    for (int numbers = 0; numbers < 10; numbers++){
//        
//        total += number[numbers];
//        average = total / 10;
//    if (number[numbers] > average){
//       counter++;
//        }
//        
//}
//        
//        System.out.println(total);
//        System.out.println(average);
//        System.out.println(counter);

        //CLASSWORK 2

//    int [] number = {3, -1, 7, 0, 9};
//
//    for (int numbers = 0; numbers < 4; numbers++){
//        
//        if (number < 0){
//       continue;
//}
//        if (number == 0){
//        break;
//}
//        System.out.println(number);
//
//}

        //CLASSWORK 3

        int [] number = {45, 12, 98, 33, 27};
        int highest = number[0];
        int lowest = number[4];

        for (int index= 0; index < 5; index++){
        
        if (number[index] > highest)
           highest = number[index];

           if (number[index] < lowest)
            lowest =  number[index];
}

        System.out.println("Lowest number is : " + lowest);
        System.out.println("Highest number is : " + highest);

        
//}
//
//

}}
