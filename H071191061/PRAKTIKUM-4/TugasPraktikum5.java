import java.util.InputMismatchException;
import java.util.Scanner;
class TugasPraktikum5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int i = input.nextInt();
            int j = input.nextInt();
            int k = input.nextInt();
            int [][] matriksA = new int [i][j];
            int [][] matriksB = new int [j][k]; 
            System.out.println();

            for (int a = 0; a < i; a++) {
                for (int b = 0; b < j; b++) {
                    matriksA [a][b] = input.nextInt();
                }
            }
            System.out.println();

            for (int b = 0; b < j; b++) {
                for (int c = 0; c < k; c++) {
                    matriksB [b][c] = input.nextInt();
                }
            }
            System.out.print("\nHasil :\n");

            for (int a = 0; a < i; a++) {
                for (int c = 0; c < k; c++) {
                    int hasil = 0;
                    for (int b = 0; b < j; b++) {
                        hasil += matriksA[a][b] * matriksB[b][c];
                    }
                    System.out.print(hasil+ " ");
                }
               System.out.println();
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Error!");
        }finally{
            input.close();
        }
    }
}