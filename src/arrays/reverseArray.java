package arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] revsArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            revsArr[i] = arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(revsArr));



    }
}
