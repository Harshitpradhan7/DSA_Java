package arrays;

public class _2_secondLargest {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,5};
        int largest0 =  arr[arr.length-1];
        int sec_largest = 0;

        // Sorted array --> brute force method:
        for (int i = arr.length-2 ; i >= 0 ; i--) {
            if(largest0 != arr[i]){
                sec_largest = arr[i];
                break;
            }
        }
        System.out.println(sec_largest);

        // Better Approach: BigO(2n)
        int []arr1 = {2,1,4,6,3,5,7,6,8,0};
        int largest1 = arr1[0];
        int sec_largest1 = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]> largest1){
                largest1=arr1[i];
            }
        }
        System.out.println(largest1);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > sec_largest1 && arr1[i] != largest1 ){
                sec_largest1 = arr1[i];
            }
        }
        System.out.println(sec_largest1);

        // Optimized Approach:
        int []arr2 = {2,1,4,6,3,5,5,2,5,6,7,9};
        int largest = arr2[0];
        int sLargest = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > largest){
                sLargest = largest;
                largest = arr2[i];
            }else {
                if (arr2[i]> sLargest && arr2[i] < largest){
                    sLargest = arr2[i];
                }
            }
        }
        System.out.println(largest);
        System.out.println(sLargest);
    }
}
