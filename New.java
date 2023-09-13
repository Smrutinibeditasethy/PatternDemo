package demo;

public class New {
    public static void main(String[] args) {
        int i, j;
        /*for (i=0; i<=5; i++){
            for (j=0; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        int row = 5;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
