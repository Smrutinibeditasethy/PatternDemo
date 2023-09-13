package demo;

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;
        int i,j;
        for (i = 1; i <= rows; i++) {
            char alpha= 'A';
            for (j = 1; j <= i; j++) {
                System.out.print(alpha);
                alpha++;
            }

            System.out.println();
        }
        }
    }