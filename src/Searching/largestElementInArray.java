package Searching;

public class largestElementInArray {
    public static void main(String[] args) {
        int largest = 0;
        int[] arr = {125,256,34,589,6,101,20,284,29};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
