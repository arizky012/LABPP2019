import java.util.*;

class Latihan5{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            int m = inp.nextInt();
            int arr[][] = new int[n][m];

            for(int i = 0 ; i < n ; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = inp.nextInt();
                }
            }
            int transpose[][] = new int[m][n];
            for (int i = 0; i < m ; i++){
                for (int j = 0; j < n ; j++){
                    transpose[i][j] = arr[j][i];
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("input invalid");
        }
    }
}