import java.util.InputMismatchException;
import java.math.BigInteger;
import java.util.Scanner;

class Tugas3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            BigInteger a1 = BigInteger.valueOf(0);
            BigInteger a2 = BigInteger.valueOf(1);
            BigInteger a3 = BigInteger.valueOf(0);
            inp.close();
            if(n <= 0){
                System.out.println("Nilai n harus lebih besar dari 0");
                return;
            }
            for(int i = 0; i < n; i++){
                a3 = a1;
                a1 = a1.add(a2);
                a2 = a3;
                System.out.printf("%d ",a3);
            }
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}