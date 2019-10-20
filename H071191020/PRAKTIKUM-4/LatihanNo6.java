import java.util.InputMismatchException;
import java.util.Scanner;

class LatihanNo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();

            if(n > 2) {
                System.out.println("Inputan hanya 0 dan 1");
                int matriks [][] = new int [n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matriks [i][j] = in.nextInt();
                    }
                }
                in.close();
                
                int x = 0;
                for (int i = 1; i < n-1; i++) {
                    for (int j = 1; j < n-1; j++) {
                        if (matriks[i][j] == 0) {
                            if(matriks[i][j] != matriks[i][j - 1] && matriks[i][j] != matriks[i][j + 1] && matriks[i][j] != matriks[i - 1][j] && matriks[i][j] != matriks[i + 1][j]){
                                System.out.println(i+","+j);
                                x++;
                            } 
                        }
                    }
                }
                if (x == 0) {
                    System.out.println("Tidak ada");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input anda salah");
        }
    }
}