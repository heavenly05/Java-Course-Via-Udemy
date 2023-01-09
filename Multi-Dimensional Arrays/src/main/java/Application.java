import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // Normal int[] arrays are a one-dimensional array. Goes in the horizontal direction
         int[] values = {3, 5, 2343};
         System.out.println(Arrays.toString(values));

         // This is the standard constructor for a multidimensional array, or an array of arrays. It will be displayed both horizontally and vertically.
        int[][] grid = {
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };

        // To access specific values from this array. You would use the index in this format, Row -> column
        // Row 1, column 1, which should be 4.
        int number = grid[1][1];

        // And you can print the whole thing using an Arrays class function.
        // Arrays.toString() for one dimensional arrays
        // Arrays.deepToString() for multidimensional arrays

        System.out.println(Arrays.deepToString(grid));

        // To loop through multidimensional array, you use a nested for loop.

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++){

                System.out.print(grid[row][col] + "\t");

            }

            System.out.println();

        }

    }
}
