import java.util.Scanner;


public class TugasPraktikum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        float c = a*b/14.0f  ;
       
        System.out.println("bensin yang digunakan : " + c + " L");
    }
}