package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int search = 24;
        int[] arr = {1,2,3,54,6,11,20,24};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search){
                System.out.println("Element found at index: "+ i);
            }
        }
    }
}
