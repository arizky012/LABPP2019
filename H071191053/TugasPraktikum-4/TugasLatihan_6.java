import java.util.Scanner;

public class TugasLatihan_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        try {
            int total1 = sc.nextInt();
            int [] arr1 = new int [total1];
            int totalarr1 = 0;
            
            for (int i = 0; i < arr1.length; i++){
                arr1 [i] = sc.nextInt();
                totalarr1 += arr1[i];
            }
            
            int total2 = sc.nextInt();
            int [] arr2 = new int [total2];
            int totalarr2 = 0;
    
            for (int j = 0; j < arr2.length; j++){
                arr2 [j] = sc.nextInt();
                totalarr2 += arr2[j];
            }
            int sum = totalarr1 + totalarr2;
    
    
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1 [i] == arr2 [j]){
                        System.out.print(arr2[j] + " ");
                        sum -= arr2[j];
                    }
                }
            }
    
        
            System.out.println("\n" + sum);
            
        } catch (Exception e) {
            System.out.println("Inputan Salah");
        }
    }
}