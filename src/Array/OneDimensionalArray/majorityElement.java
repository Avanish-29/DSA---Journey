package Array.OneDimensionalArray;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The majority element is: " + majority(arr));
    }

    public static int majority(int[] arr) {
        int element = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                cnt++;
            }
        }
        if (cnt > arr.length / 2) {
            return element;
        }
        return -1;
    }
}




    // Better Approach
//        public static int majority(int[] nums) {
//            Map<Integer,Integer> temp = new HashMap<>();
//            int maxValue = 0;
//            int element = 0;
//            for(int e : nums){
//                temp.put(e,temp.getOrDefault(e,0)+1);
//            }
//            for(Map.Entry<Integer,Integer> entry : temp.entrySet()){
//                if(entry.getValue() > maxValue){
//                    maxValue = entry.getValue();
//                    element = entry.getKey();
//                }
//            }
//            return element;
//        }
