import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // String arrays work pretty much identically to integer arrays

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = " to ";
        words[2] = "you";

        // Dang I did not know you could do this.

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        // This will print out the value of each element of the array. Very cool
        for(String fruit: fruits){

            System.out.println(fruit);

        }
    }
}
