package Basics.Recursion;

public class _02_without_recurssion {
    public static void recurssion(int n){
        System.out.print(n + " ");
    }
    public static void reverseRecurssion(int n){
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num ; i++) {
            recurssion(i);
            reverseRecurssion(num-i+1);
        }
    }
}
