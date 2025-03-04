package arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr1 = {1,2,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
     }
}
