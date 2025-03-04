package Patterns;

public class _91_ten {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4 ; i++) {
            for (int j = 4-i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
