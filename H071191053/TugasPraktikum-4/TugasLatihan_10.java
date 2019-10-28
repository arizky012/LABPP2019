import java.util.Scanner;

public class TugasLatihan_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int tall = sc.nextInt();
            int [] number = new int [tall];
    
            for (int i = 0; i < number.length; i++) {
                number [i] = sc.nextInt();
            }
            
        } catch (Exception e) {
            System.out.println("Inputan salah");
        }

        sc.close();

        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if (number[i] % number[j] != 0 && number[j] % number[i] != 0){
                    System.out.println(number[i]+" "+number[j]);
                }
            }
        }
    }
}