package _practice_leetcode_45_days.Day_1;

import java.util.Arrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = 0; k < j; k++) {
                    sum = Arrays.stream(arr).sum();
                    System.out.println(sum);
                }
            }
        }
    }
}
