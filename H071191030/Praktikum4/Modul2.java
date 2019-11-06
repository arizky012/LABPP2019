import java.util.Scanner;
public class Modul2 {

    public static void main(String[] args) {
        try {
         
        Scanner ka = new Scanner(System.in);
        int i = ka.nextInt();
        int j = ka.nextInt();
        int k = ka.nextInt();
        int [][] matriksA = new int [i][j];
        int [][] matriksB = new int [j][k];

        //matriks a
        for(int a= 0; a < i; a++){
            for(int b = 0; b < j; b++){
                matriksA [a][b] = ka.nextInt(); 
            }
        }
        //matriks b
        for(int b = 0; b < j; b++){
            for(int c = 0; c < k; c++){
                matriksB  [b][c] = ka.nextInt();
            }
        }System.out.println();
        ka.close();

        //matriks a * matriks b
        for (int a = 0; a < i; a++){
            for(int c = 0; c< k; c++){
                int hasil = 0;
                for(int b = 0; b<j; b++){
                    hasil += matriksA[a][b]*matriksB[b][c];
                }System.out.print(hasil + " ");
            }System.out.println();
        }   
        } catch (Exception e) {
         System.out.println("Inputan tidak valid");
        }
    }
}