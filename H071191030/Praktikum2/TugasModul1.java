import java.util.InputMismatchException;
import java.util.Scanner;

public class TugasModul1 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);

        try {
            int a = ka.nextInt();
            int b = ka.nextInt();
            int c = ka.nextInt();
            int d = ka.nextInt();
            int e = ka.nextInt();
            ka.close();
            int Ganjil = 0;
            int Genap = 0;
            int Positif = 0;
            int Negatif = 0;
        if (a > 0 && a % 2 == 1) {
                Positif += 1;
                Ganjil += 1;
        } else if (a > 0 && a % 2 == 0) {
                Positif += 1;
                Genap += 1;
        } else if (a < 0 && a % 2 == 1) {
                Negatif += 1;
                Ganjil += 1;
        } else if (a == 0) {
                Genap += 1;
        } else {
                Negatif += 1;
                Genap += 1;
            }
        if (b > 0 && b % 2 == 1) {
                Positif += 1;
                Ganjil += 1;
        } else if (b > 0 && b % 2 == 0) {
                Positif += 1;
                Genap += 1;
        } else if (b < 0 && b % 2 == 1) {
                Negatif += 1;
                Ganjil += 1;
        } else if (b == 0) {
                Genap += 1;
        } else {
                Negatif += 1;
                Genap += 1;
            }
        if (c > 0 && c % 2 == 1) {
                Positif += 1;
                Ganjil += 1;
        } else if (c > 0 && c % 2 == 0) {
                Positif += 1;
                Genap += 1;
        } else if (c < 0 && c % 2 == 1) {
                Negatif += 1;
                Ganjil += 1;
        } else if (c == 0) {
                Genap += 1;
        } else {
                Negatif += 1;
                Genap += 1;
            }
        if (d > 0 && d % 2 == 1) {
                Positif += 1;
                Ganjil += 1;
        } else if (d > 0 && d % 2 == 0) {
                Positif += 1;
                Genap += 1;
        } else if (d < 0 && d % 2 == 1) {
                Negatif += 1;
                Ganjil += 1;
        } else if (d == 0) {
                Genap += 1;
        } else {
                Negatif += 1;
                Genap += 1;
            }
        if (e > 0 && e % 2 == 1) {
                Positif += 1;
                Ganjil += 1;
        } else if (e > 0 && e % 2 == 0) {
                Positif += 1;
                Genap += 1;
        } else if (e < 0 && e % 2 == 1) {
                Negatif += 1;
                Ganjil += 1;
        } else if (e == 0) {
                Genap += 1;
        } else {
                Negatif += 1;
                Genap += 1;
            }

            System.out.println(Genap + " Angka Genap");
            System.out.println(Ganjil + " Angka Ganjil");
            System.out.println(Positif + " Angka Positif");
            System.out.println(Negatif + " Angka Negatif");

        } catch (InputMismatchException e) {
            
            System.out.println("Inputan Tidak Valid");
        }

    }
}
