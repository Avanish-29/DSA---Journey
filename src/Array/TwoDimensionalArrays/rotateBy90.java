package Array.TwoDimensionalArrays;

import java.util.Scanner;

public class rotateBy90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtils.input2DArray(input);
        rotate(arr);
        ArrayUtils.print2DArray(arr);
    }
    public static void rotate(int[][] arr){
        // Pehle transpose karenge
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i; j <col ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Fir ab reverse karenge
        for (int i = 0; i <row ; i++) {
            int start = 0, end = row-1;
            while(start<= end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++; end--;
            }
        }
    }
}
