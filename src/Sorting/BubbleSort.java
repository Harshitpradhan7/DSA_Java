package Sorting;

import java.util.Arrays;

// O(n^2)
public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        boolean isSwaped = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped){
                break;
            }else {
                count++;
            }

        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,3,7,9,0,3};
        int[] arr1 = {3,2,1};
        int[] res = bubbleSort(arr1);
        System.out.println(Arrays.toString(res));
    }
}
