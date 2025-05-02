package Sorting;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        int[] arr = {4,2,3,1,0};
//        int min = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length ; j++) {
//                if (arr[j] < arr [min]){
//                    min = j;
//                }
//            }
//            System.out.println(min);
//            int temp =  arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
//        System.out.println(Arrays.toString(arr));


        int[] arr = {2,1,4,5,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
