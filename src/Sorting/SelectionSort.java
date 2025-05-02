package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "; " + b);
    }
    static void selectionSortAlgo(int[] arr){
        int min = arr[0];
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if(arr[i] < min){
                    int temp = min;
                    min = arr[i];


                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,4,3};
        selectionSortAlgo(arr);

//        int a = 3;
//        int b = 5;
//        System.out.println(a + "; " + b);
//        swap(a,b);
//        System.out.println(a + "; " + b);
    }
}
