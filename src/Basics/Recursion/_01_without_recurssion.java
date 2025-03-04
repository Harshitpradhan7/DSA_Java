package Basics.Recursion;

public class _01_without_recurssion {
    public static int recursion(int n){
//        System.out.println(n);
        return n;
    }
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        int abc;
        for (int i = num; i > 0 ; i--) {
            sum += recursion(i)  ;
        }
        System.out.println(sum);

    }
}
