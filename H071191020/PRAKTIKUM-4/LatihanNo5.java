import java.util.InputMismatchException;
import java.util.Scanner;

class LatihanNo5 {
    public static void main(String[] args) {
        //Tranpose Matriks
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int m = in.nextInt();

            int [][] arrA = new int [n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arrA [i][j] = in.nextInt();
                }
            }
            in.close();
            System.out.println();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arrA [j][i] + " ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan anda salah");
        }
    }
}