package demo;

public class Pattern5 {
    public static void main(String[] args) {
        int i, j;
        int rows = 5;
        char alpha = 'A';
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(alpha);
            }
            alpha++;
            System.out.print("\n" );
        }
    }
}