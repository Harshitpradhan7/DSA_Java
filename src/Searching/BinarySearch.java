package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int search = 6;
        int[] arr = {1,2,3,5,6,11,20,24,29};
        int ind = (arr.length)/2;

        if (search<=arr[ind]){
            for (int i = 0; i <= ind ; i++) {
                if (search == arr[i]){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = ind+1; i < arr.length; i++) {
                if (search == arr[i]){
                    System.out.println(i);
                }
            }
        }
    }
}
