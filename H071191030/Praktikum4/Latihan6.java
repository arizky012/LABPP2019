import java.util.Scanner;

public class Latihan6 {

    public static void main(String[] args) {
        try {
        
            Scanner ka = new Scanner(System.in);
            int n = ka.nextInt();
            int arr [][] = new int [n][n];
            boolean find = false;
    
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    arr[i][j] = ka.nextInt();
                }
            }
    
            for(int i = 1; i < n-1; i++){
                for(int j = 1; j < n-1; j++){
                    if (arr[i][j] == 0 && arr[i][j] != arr[i-1][j] && arr[i][j] != arr[i+1][j]) {
                        if(arr[i][j] != arr[i][j-1] && arr[i][j] != arr[i][j+1]){
                            System.out.printf("%d,%d" , i,j);
                            find = true;
                            
                        }
                    }
                }
            }
            if(!find){
                System.out.println("Tidak Ditemukan");
            }
    
                 
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
        
    }
}