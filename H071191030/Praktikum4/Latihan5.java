import java.util.Scanner;

public class Latihan5 {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);
            int n = ka.nextInt();
            int m = ka.nextInt();
            int matriks[][] = new int[n][m];
            int i, j;

            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    matriks[i][j] = ka.nextInt();
                }
            }
            ka.close();
            // Transpose matriks:
            for (i = 0; i < m; i++) {
                System.out.println();
                for (j = 0; j < n; j++) {
                    System.out.print(matriks[j][i] + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }

    }
}