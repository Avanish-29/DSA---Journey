package Array.OneDimensionalArray;

import Array.TwoDimensionalArrays.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mergeIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr =  ArrayUtils.input2DArray(input);
        ArrayUtils.print2DArray(arr);
        System.out.println("The merged Intervals are : ");
        arr = merged(arr);
        ArrayUtils.print2DArray(arr);

    }
    public static int[][] merged(int[][] arr){
        Arrays.sort(arr,(a,b) ->Integer.compare(a[0],b[0]));
        List<int[]> temp = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(temp.isEmpty() || temp.get(temp.size()-1)[1]<start){
                temp.add(new int[] {start,end});
            }
            else {
                temp.get(temp.size() - 1)[1] = Math.max(temp.get(temp.size() - 1)[1], end);
            }
        }
        return temp.toArray(new int[temp.size()][]);
    }
}
