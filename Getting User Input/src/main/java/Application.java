import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // To get user input, you would use the scanner object type
        Scanner input = new Scanner(System.in);

        //This is a simple prompt that will appear telling the user what they should be inputting into the program
        System.out.println("Enter a line of text: ");

        //Next line will collect anything the user types before pressing the return/enter key.
        String line = input.nextLine();

        // The Scanner object has plenty of different functions for different input types. This is for integers specifically
        System.out.println("Enter an integer");
        int value = input.nextInt();

        System.out.println("You have entered: " + line + " And have entered " + value);

    }
}
