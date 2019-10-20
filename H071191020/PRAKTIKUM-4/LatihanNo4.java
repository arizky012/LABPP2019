import java.util.InputMismatchException;
import java.util.Scanner;

class LatihanNo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int arrA [] = new int [n];
            for (int i = 0; i < n; i++) {
                arrA [i] = in.nextInt();
            }
            int nilai = 0; 
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arrA[i] == arrA[j]) {
                        nilai = arrA[i];
                        System.out.printf("Terdapat angka yang sama yaitu %d yang terletak di Index %d,%d\n", arrA[i], i, j);
                    }
                }
            }
            if (nilai == 0) {
                System.out.println("Tidak ada nilai yang sama");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input anda salah");
        }
    }
}