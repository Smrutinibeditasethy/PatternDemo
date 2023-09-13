package demo;

public class Pattern9 {
    public static void main(String[] args) {
        int i, j;
        int rows = 5;
        for (i = 1; i <= rows; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }
}
