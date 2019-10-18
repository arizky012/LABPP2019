import java.util.Scanner;

public class FPB {

    public static void main(String[] args) {
        try {
            Scanner ka = new Scanner(System.in);

            int m = ka.nextInt();
            int n = ka.nextInt();
            int hasil = cariFPB(m, n);
            System.out.printf("FPB dari %d dan %d = %d", m, n, hasil);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }

    }

    public static int cariFPB(int m, int n) {

        int fpb = 0;
        int min = m < n ? m : n;

        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                fpb = i;
            }

        }
        return fpb;

    }

}