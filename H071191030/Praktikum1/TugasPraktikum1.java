import java.util.Scanner;
class TugasPraktikum1{
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        double efisiensi = 14;
        int waktu = sm.nextInt();
        int kecepatan = sm.nextInt();
        sm.close();

        double bensin = kecepatan*waktu/efisiensi;
        System.out.printf("Bensin yang digunakan %.3f L", bensin);
        
    }
}