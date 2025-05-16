package Array.TwoDimensionalArrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayUtils {

    // Ask user for array size and then input values with position message
    public static int[][] input2DArray(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements row by row:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at (" + i + ", " + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Print 2D array using Arrays.toString for each row
    public static void print2DArray(int[][] arr) {
        System.out.println("The 2D array is:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
