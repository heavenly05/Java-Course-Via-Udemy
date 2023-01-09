import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Switch can only be used for certain types of variables. The most common being integer and strings

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();


        // John Purrell says that switch isn't really used in professional coding, but it looks so much nicer than a ton of...
        // ... if statements, else-ifs, all that junk. This is way more compact and I need to use it more because I like it.

        switch(text) {
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped.");
                break;

            default:
                System.out.println("Command not recognized.");
        }

    }
}
