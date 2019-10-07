import java.math.BigInteger;
import java.util.Scanner;

public class TugasModul_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
        int x = sc.nextInt();
        sc.close();
        
        BigInteger fb1 = BigInteger.valueOf(1);
        BigInteger fb2 = BigInteger.valueOf(0);
        BigInteger fn = BigInteger.valueOf(0);

        System.out.print(fb2 + " " + fb1 + " ");

        for (int i = 0; i < x; i++){
            fn = fb1.add(fb2);
            System.out.print(fn + " ");
            fb2 = fb1;
            fb1 = fn;
        }
    } catch(Exception e){
        System.out.println("Inputan Tidak Valid");
    }
    }
}