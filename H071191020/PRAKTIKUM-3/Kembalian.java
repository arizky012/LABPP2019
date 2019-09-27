import java.util.InputMismatchException;
import java.util.Scanner;

public class Kembalian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int harga = in.nextInt();
            int bayar = in.nextInt();
            int back = bayar-harga;
            int seratus = 0 , limaPuluh = 0 , duaPuluh = 0 , sepuluh = 0 , lima=0 , dua = 0, seribu = 0 ;
            in.close();

            if (harga <= bayar) {
                while(back >= 100000){
                    back -= 100000;
                    seratus++;
                } while (back >= 50000) {
                    back -= 50000;
                    limaPuluh++;
                } while (back >= 20000) {
                    back -= 20000;
                    duaPuluh++;
                } while (back >= 10000) {
                    back -= 10000;
                    sepuluh++;
                } while (back >= 5000) {
                    back -= 5000;
                    lima++;
                } while (back >= 2000) {
                    back -= 2000;
                    dua++;
                } while (back >= 1000) {
                    seribu++;
                }
                System.out.println("Jumlah Kembalian");
                System.out.printf("%d Uang Rp. 100.000\n", seratus);
                System.out.printf("%d Uang Rp. 50.000\n", limaPuluh);
                System.out.printf("%d Uang Rp. 20.000\n", duaPuluh);
                System.out.printf("%d Uang Rp. 10.000\n", sepuluh);
                System.out.printf("%d Uang Rp. 5.000\n", lima);
                System.out.printf("%d Uang Rp. 2.000\n", dua);
                System.out.printf("%d Uang Rp. 1.000\n", seribu); 
            } else {
                System.out.printf("Uang Anda kurang : Rp. %d ", (harga-bayar));
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}