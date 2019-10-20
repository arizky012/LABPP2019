import java.util.InputMismatchException;
import java.util.Scanner;

class ModulNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();

            while (i > 0 && j > 0 && k >0) {

                int [][] matriksA = new int[i][j];
                for (int a = 0; a < i; a++) {
                    for (int b = 0; b < j; b++) {
                        matriksA[a][b] = in.nextInt();
                    }
                }
                System.out.println();
                int [][] matriksB = new int[j][k];
                for (int a = 0; a < j; a++) {
                    for (int b = 0; b < k; b++) {
                        matriksB[a][b] = in.nextInt(); 
                    }
                }
                System.out.println();
                int [][] hasil = new int[i][k];
                for (int a = 0; a < i; a++) {
                    for (int b = 0; b < k; b++) {
                        int x = 0;
                        for (int c = 0; c < j; c++) {
                            x += matriksA[a][c]*matriksB[c][b];
                        }
                        hasil[a][b] = x;
                    }
                } for (int a = 0; a < i; a++) {
                    for (int b = 0; b < k; b++) {
                        System.out.print(hasil[a][b]+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Inputan Tidak Sesuai");
        } catch (InputMismatchException e) {
            System.out.println("Inputan anda salah");
        }
    }
}