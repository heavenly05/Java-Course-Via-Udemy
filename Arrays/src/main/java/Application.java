import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // Ah, glorious arrays. My CS professor was not a fan of my excessive use of them for every project, well vectors to be exact

        int value = 7;

        // This is a reference to a list of integer values
        int[] values;

        // This allocates enough memory to the reference label values for 3 integer values
        values = new int[3];

        // Indexing, or the position within an array. The position will always start with 0, 1, 2... and so on.

        // This will print out the first index of the array. Java is nice enough to provide default values for all array elements...
        ///... And in the case for integers, that value is zero.
        System.out.println(values[0]);

        // You can declare the value of each index position just like any variable. (reference name) = (value)
        values[0] = 10;
        values[1] = 15;
        values[2] = 20;

        // The most common way for iterating through an array is using a for-loop.
        for (int i = 0; i < values.length-1; i++){

            System.out.println(values[i]);

        }

        // Another way of initializing an array is like so. This saves a step by allocating memory and declaring values at the same time.

        int[] numbers = {5, 6, 7};

        // However it can be quite annoying if the data set is super large, so you can once again use a for-loop to do this exact thing.

        int[] integerValues = new int[301];

        for (int i = 0; i < integerValues.length-1; i++) {
            integerValues[i] = i;
        }

        // This will create an array with 300 elements from 0 to 300. This method can be used for making array's via file reading, or literally anything else

        System.out.println(Arrays.toString(integerValues));


    }
}
