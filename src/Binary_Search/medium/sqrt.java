package Binary_Search.medium;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of which you want to know the square root :");
        int n = input.nextInt();
        System.out.println("The square root of the given number "+n+" is "+sqrtNumber(n));
    }
    public static int sqrtNumber(int n){
        int ans = 0 , start = 0, end = n;
     while(start<=end){
         int mid = start+(end-start)/2;
         if(mid*mid<=n){
             ans = mid;
             start  = mid+1;
         }
         else end = mid-1;
     }
     return ans;
    }
}
