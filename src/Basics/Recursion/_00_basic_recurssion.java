package Basics.Recursion;

public class _00_basic_recurssion {
    public static int count = 0;
    public static void r1(){
        if (count == 5) return;
        System.out.println(5-count);
        count += 1;
        r1();
    }

    public static int factorial(int n){
        if(n==1 || n==0) return 1;
        if (n<0) return 0;
        return n * factorial(n-1);
    }

    public static void reverseArray(int[] arr){
        
    }
    public static void main(String[] args) {
//        r1();
        System.out.println(factorial(10));
    }
}
