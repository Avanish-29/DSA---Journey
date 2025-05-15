package Array.TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of rows ?");
        int rows = input.nextInt();
        System.out.println("Number of columns ?");
        int column = input.nextInt();
        int[][] arr = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the element at [" + i + "] " + "[" + j + "]" + " position");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("\nPrinting 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        setZero(arr);
        System.out.println("\nPrinting after replacing :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZero(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;
        boolean firstRow = false, firstColum = false;

        //Check karo pehle row me zero toh nahi
        for(int j=0 ; j<column; j++){
            if(arr[0][j] == 0){
                firstRow = true;
                break;
            }
        }

        //Check karo pehle column me zero toh nahi
        for(int i=0 ; i<row; i++){
            if(arr[i][0] == 0){
                firstColum = true;
                break;
            }
        }

        // marking the zero element
        for (int i = 1; i <row ; i++) {
            for (int j = 1; j <column ; j++) {
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // ab karenge zero se replace
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if(arr[i][0] == 0 || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }
        // ab first row aur column ka bhi kar dete hain kuch
        if(firstRow){
            for(int j=0; j<column ; j++){
                arr[0][j] = 0;
            }
        }
        if(firstColum){
            for (int i=0 ; i<row; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
