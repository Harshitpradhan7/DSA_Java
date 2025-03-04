package Patterns;

public class _9_nine {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5-i-1; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 5-i-1; j > 0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(5-i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
