package Basics.Maths;

public class hcf {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        for (int i = 1; i <= a/2; i++) {
            if (a%i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 1; i <= b/2; i++) {
            if (a%i == 0){
                System.out.print(i+ " ");
            }
        }


    }
}
