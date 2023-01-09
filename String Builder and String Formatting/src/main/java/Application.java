// At this point in the course, I do not know anything so more notes will be written



public class Application {

    public static void main(String[] args) {

        // What this is doing is creating a new string each time by adding the current info string to whatever is said...
        // to be added. This is inefficient apparently, so a better way will be shown.
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // This is the better way to avoid unnecessary memory usage
        StringBuilder sb = new StringBuilder("");

        // Rather than creating a new string everytime, a Stringbuilder object allows it to be appended onto, ...
        // maintaining the original object, and saving memory and time
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        // There is a shortcut, however. The append method returns a reference to the stringbuilder itself,...
        // meaning you can use 'Method Chaining' as shown below.
        StringBuilder s = new StringBuilder();

        s.append("My name is Rodger").append(" ").append("I am a skydiver");

        System.out.println(s.toString());
        // There is StringBuffer that is a thread safe version of StringBuilder. So keep that in mind

        // ====================== Formatting ==============================

        System.out.print("Here is some text.\tThat was a tab\nThat was a new line.");
        System.out.println(" More text");

        // Printf() means print format. You can imbed values into the string rather than using '+' s
        // %d is for numbers
        // %s is for text
        // %S is for upper case text
        // %n is for forcing line breaks
        // %f is for floating point (.2 will set the value to only 2 decimal places)
        // Putting a number between % and the letter dictates the width of the area the text or whatever will take up

        // There are a lot more but those are from a random website I found
        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120) ;

        for(int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "Here is some text");
        }

        System.out.printf("Total value: %.2f\n", 5.653);
        System.out.printf("Total value: %5.1f\n", 343.23423);

    }
}
