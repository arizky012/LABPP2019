import java.util.*;

class Modul2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int i = inp.nextInt();
            int j = inp.nextInt();
            int k = inp.nextInt();
            int arr1[][] = new int[i][j];
            int arr2[][] = new int[j][k];
        
            for (int a = 0; a < i; a++) {
                for (int b = 0; b < j; b++) {
                    arr1[a][b] = inp.nextInt();
                }
            }

            for (int a = 0; a < j; a++) {
                for (int b = 0; b < k; b++) {
                    arr2[a][b] = inp.nextInt();
                }
            }

            int arr3[][] = new int[i][k];
                for (int a = 0; a < i; a++) {
                    for (int b = 0; b < k; b++) {
                        arr3[a][b] = 0;
                        for (int c = 0; c < j; c++) {
                            arr3[a][b] += arr1[a][c] * arr2[c][b];
                        }
                        System.out.print(arr3[a][b] + "\t");
                    }
                    System.out.println();
                }   
                        
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("input invalid");
        }
    }
}