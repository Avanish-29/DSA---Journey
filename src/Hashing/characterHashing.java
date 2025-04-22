package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class characterHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String c = input.next();
        int[] hash = new int[26];
        for(int s : c.toCharArray()){
            hash[s - 'a']++;
        }

        for (int i = 0; i <hash.length; i++) {
            if(hash[i]>0)
            System.out.println((char)(i+'a') + " appears " + hash[i] + " times in the array");
        }
    }
}
