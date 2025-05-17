package Array.TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int n = input.nextInt();
        System.out.println("Enter the number of col: ");
        int r = input.nextInt();

        //System.out.println("The value at position n="+n+" and r="+r+" is: "+ pascalRowCol(n,r));

       // System.out.println("The entire row of pascal triangle of row = "+n + " is : "+ rowPascal(n));

        System.out.println("The Pascal Triangle is : " );
        List<List<Long>> triangle = Maketriangle(n);
        for(List<Long> row : triangle){
            for(Long val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }


    // Row and Column is given and you have to return the value at that position
    public static int pascalRowCol(int n,int r) {
        int ans = 1;
        for (int i = 0; i < r; i++) {
            ans = ans * (n - i) / (i + 1);
        }
        return ans;
    }

    // Row will be given,you have to print the all elements in that row
    public static List<Integer> rowPascal(int n){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        for (int i = 0; i < n; i++) {
            list.add(ans);
            ans = ans * (n-i)/(i+1);
        }
        return list;
    }

    // Printing entire Pascal triangle
    public static List<List<Long>> Maketriangle(int n){
        List<List<Long>> triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Long> row = new ArrayList<>();
            long res = 1;
            for (int j = 0; j <= i; j++) {
                row.add(res);
                res = res * (i-j)/(j+1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}
