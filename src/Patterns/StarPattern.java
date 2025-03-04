package Patterns;

public class StarPattern {
    public static void main(String[] args) {

                    // Star pattern:
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
                    // Reverse Star pattern:
        for (int i = 0; i < 5; i++) {
            for (int j = (5-i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
