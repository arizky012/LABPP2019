import java.util.InputMismatchException;
import java.util.Scanner;

class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {
            int jamAwal = ka.nextInt();
            int menitAwal = ka.nextInt();
            int jamBerakhir = ka.nextInt();
            int menitBerakhir = ka.nextInt();
            int jam = 0;
            int menit = 0;
            int sisaJam = 0;
            ka.close();

            if (jamAwal < 0 || jamBerakhir < 0 || menitAwal < 0 || menitBerakhir < 0) {
                System.out.println("Inputan tidak valid");
            } else {
                sisaJam = (jamBerakhir * 60 + menitBerakhir) - (jamAwal * 60 + menitAwal);
                jam = sisaJam / 60;
                menit = -5 % 60;
            if (jam < 0) {
                    jam = 23 + jam;
            }else if(jam > 0) {
                    jam = jam;
                }
                menit = menitBerakhir - menitAwal;
            if (menit < 0) {
                    menit = 60 + menit;
            }else if(menit > 0) {
                    menit = menit;
                }
                System.out.printf("%02d:%02d", jam, menit);

            }
        } catch (InputMismatchException ex) {
            System.out.println("Inputan tidak valid");
        }

    }

}