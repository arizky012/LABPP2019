import java.util.InputMismatchException;
import java.util.Scanner;

class EndOfLife {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            while (true){
                int jam = 6, menit = 0;
                float m = in.nextFloat(), detik = (m*240);
                if (0 <= m && m < 360) {
                    int detik1 = (int) detik;
                    while (detik1 >= 3600) {
                        detik1 -= 3600;
                        jam++;
                    } while (detik1 >= 60) {
                        detik1 -= 60;
                        menit++;
                    } 
                    jam %= 24;
                    if (jam >= 5 && jam <= 10) {
                        System.out.println("Selamat Pagi");
                    } else if (jam > 10 && jam <= 15) {
                        System.out.println("Selamat Siang");
                    } else if (jam > 15 && jam <=18) {
                        System.out.println("Selamat Sore");
                    } else if (jam > 18 && jam <= 19) {
                        System.out.println("Selamat Petang");
                    } else if (jam > 19 && jam <= 24) {
                        System.out.println("Selamat malam");
                    } else {
                        System.out.println("Dini Hari");
                    } 
                    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik1);
                } else {
                    System.out.println("Tidak Valid");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}