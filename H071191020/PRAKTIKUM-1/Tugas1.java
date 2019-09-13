import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int waktu = in.nextInt();
        in.close();
        float kecepatan = fc.nextFloat();
        float bensin = (waktu*kecepatan)/14;
        System.out.printf("Bensin yang digunakan : %.3f L", bensin);
    }
}