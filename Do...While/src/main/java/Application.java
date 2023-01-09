import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        /*
        \\ This version of the code uses a while loop to determine whether the user has inputted the specified number or not
        \\ This is inefficient because it requires an initial value to be gathered for the while loop to even start looping

        // Create Scanner object
            Scanner scanner = new Scanner(System.in);
        // Initial input
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
        // Loop until user inputs a specific integer value
            while (value != 5) {
                System.out.println("Enter a number: ");
                value = scanner.nextInt();
            }
         */

        // This version uses a do...while loop which negates that problem by checking the condition after the code has run, not before.

        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();

        } while(value != 5);

        System.out.println("Got 5!");


    }
}
