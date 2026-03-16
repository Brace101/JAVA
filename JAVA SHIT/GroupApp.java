import java.util.Scanner;

public class GroupApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int numberOfPeople = input.nextInt();
        input.nextLine(); 

        String[] people = new String[numberOfPeople];

        for (int index = 0; index < numberOfPeople; index++) {
            System.out.print("Enter name of person " + (index + 1) + ": ");
            people[index] = input.nextLine();
        }

        System.out.println();

        System.out.print("Enter number of groups: ");
        int numberOfGroups = input.nextInt();

        System.out.println();

        for (int group = 0; group < numberOfGroups; group++) {

            System.out.println("Group " + (group + 1) + ":");

            for (int count = group; count < numberOfPeople; count += numberOfGroups) {
                System.out.println(people[count]);
            }

          
        }

      
    }
}
