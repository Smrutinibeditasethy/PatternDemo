package demo;

public class Pattern4 {
    public static void main(String[] args) {
        int i, j;
        int row = 5;
        for (i=1; i<=row; i++){
            for (j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
