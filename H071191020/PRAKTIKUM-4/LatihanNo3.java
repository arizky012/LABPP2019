import java.util.InputMismatchException;
import java.util.Scanner;

public class LatihanNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        try {
            int m = in.nextInt();
            int [] arrA = new int [m];
            int sumArA = 0;
            
            for (int i = 0; i < arrA.length; i++){
                arrA [i] = in.nextInt();
                sumArA += arrA[i];
            }
            
            int n = in.nextInt();
            int [] arrB = new int [n];
            int sumArB = 0;
    
            for (int j = 0; j < arrB.length; j++){
                arrB [j] = in.nextInt();
                sumArB += arrB[j];
            }
            int sum = sumArA + sumArB;
    
            for (int i = 0; i < arrA.length; i++) {
                for (int j = 0; j < arrB.length; j++) {
                    if (arrA [i] == arrB [j]){
                        sum -= arrB[j];
                    }
                }
            }
            System.out.println(sum); 
        } catch (InputMismatchException e) {
            System.out.println("Input anda salah");
        }
        
    }
}