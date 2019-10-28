import java.util.Scanner;

public class TugasLatihan_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
    
            int[][] arr1 = new int[a][b];
            int[][] arr2 = new int[b][c];
            int[][] arrHasil = new int[a][c];
    
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
    
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < c; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("inputan salah");
        }

        sc.close();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < b; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                arrHasil[i][j] = sum;
            }
        }
        System.out.println("hasilnya adalah");
        for (int i = 0; i < arrHasil.length; i++) {
            for (int j = 0; j < arrHasil[0].length; j++) {
                System.out.print(arrHasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}