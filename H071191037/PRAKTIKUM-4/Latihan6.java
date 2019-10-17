import java.util.*;

class Latihan6{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            int arr[][] = new int[n][n];
            boolean find = false;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = inp.nextInt();
                }
            }
            
            for (int i = 1; i < n-1  ; i++) {
                for (int j = 1; j < n-1 ; j++) {
                    if(arr[i][j] == 0 && i != 0 && j != 0 && i != n-1 && j != n-1){
                        if(arr[i-1][j] == 1 && arr[i+1][j] == 1 && arr[i][j-1] == 1 && arr[i][j+1] == 1){
                            System.out.println("berada di index = "+ i + ","+ j);
                            find = true;
                        }
                    }
                }
            }

            if(!find){
                System.out.println("tidak ditemukan");
            }

            
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("input invalid");
        }
    }
}