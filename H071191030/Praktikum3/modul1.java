import java.util.Scanner;

class modul1 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {

            System.out.println("Masukkan nilai awal");
            int x = ka.nextInt();
            System.out.println("Masukkan nilai akhir");
            int y = ka.nextInt();
            int j = 0;
            int k = 0;
            ka.close();
            System.out.println("Rentang nilai:");

            if (x <= y) {
                j = x;
                k = y;

            } else {
                j = y;
                k = x;
            }
            for (int i = j; i <= k; i++) {
                if (i > 0 && i % 2 == 0) {
                    System.out.println(i + " genap positif");
                } else if (i < 0 && i % 2 == 0) {
                    System.out.println(i + " genap negatif");
                } else if (i < 0 && i % 2 == -1) {
                    System.out.println(i + " ganjil negatif");
                } else if (i > 0 && i % 2 == 1) {
                    System.out.println(i + " ganjil positif");
                } else {
                    System.out.println(i + " nol");
                }
            }

        } catch (Exception e) {

            System.out.println("Inputan tidak valid");
        }
    }

}
