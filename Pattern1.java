package demo;

public class Pattern1 {
    public static void main(String[] args) {
        int i,j, row= 5;
        for (i=0; i<=row; i++){
            for (j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
