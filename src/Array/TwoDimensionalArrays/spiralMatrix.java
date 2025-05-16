package Array.TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtils.input2DArray(input);
        System.out.println("The actual Matrix is : ");
        ArrayUtils.print2DArray(arr);
        System.out.println("Spiral is :"+spiral(arr));
    }
    public static List<Integer> spiral(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int top = 0, right = matrix[0].length-1, bottom = matrix.length-1, left = 0;
        while(top<=bottom && left<=right){
            // Left to right
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            //Upar se niche
            for(int i=top ; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            //Right se left
            if(top<=bottom){
                for(int i=right; i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //Niche se Upar
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
