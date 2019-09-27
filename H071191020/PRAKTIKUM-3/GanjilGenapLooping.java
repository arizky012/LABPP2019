import java.util.InputMismatchException;
import java.util.Scanner;

public class GanjilGenapLooping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int fq = x;
            if (x>y) {
                x=y;
                y=fq;
            }
            in.close();
            for (int i = x; i <= y; i++) {
                if ( i < 0 ) {
                    if ( i % 2 != 1) {
                        System.out.printf("%d ganjil negatif\n", i);
                    } else {
                        System.out.printf("%d genap negatif\n", i);
                    }
                } else if ( i > 0) {
                    if ( i % 2 != 1) {
                        System.out.printf("%d ganjil positif\n", i);
                    } else {
                    System.out.printf("%d genap positif\n", i);
                    }
                } else {
                    System.out.printf("%d nol\n", i);
                }
            }   
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}