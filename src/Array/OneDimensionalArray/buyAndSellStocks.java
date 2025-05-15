package Array.OneDimensionalArray;

import java.util.Scanner;

public class buyAndSellStocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum profit could be : " + profit(arr));
    }
    public static int profit(int[] prices){
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i]-buy > profit){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}
