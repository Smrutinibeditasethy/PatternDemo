package demo;

public class Pattern6 {
    public static void main(String[] args) {
        int r, c, s;
        int rows = 5;
        for (r = 1; r <= rows; r++) {
            for (c =rows-r; c>=1; c--) {
                System.out.print("  ");
            }
            for (s=1; s<=r; s++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}

