package demo;

public class Pattern7 {
    public static void main(String[] args) {
        int rows=5;
        for (int i=1; i<=rows; i++){
            for (int j=rows-i; j>=1; j--){
                System.out.print("  ");
            }
            for (int s=1; s<=i; s++){
                System.out.print(s);
            }System.out.println('\n');
        }
    }
}
