import java.util.Scanner;
public class TaskDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] digits = new int[5];

        System.out.print("Enter the 5 numbers:");

        for (int index = 0; index < 5; index++) {
            digits[index] = input.nextInt();
        }

        for (int index = 0; index < 5; index++) {
            if (digits[index] % 2 == 0) {
                System.out.print(digits[index]);
            }
        }

}
    public static int[] sortingMethodForArray(int[] number) {

        for (int counter = 0; counter < number.length - 1; counter++) {

            for (int index = 0; index < number.length - 1; index++) {

                if (number[index] < number[index + 1]) {

                    int temp = number[index];
                    number[index] = number[index + 1];
                    number[index + 1] = temp;
                }
            }
        }
         
    }

}



