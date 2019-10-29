import java.util.InputMismatchException;
import java.util.Scanner;
class HariKeTahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n--- Hari Ke Tahun, Bulan, Hari ---\n");
            System.out.print("Input hari : ");
            int hari = input.nextInt();
            hari = Math.abs(hari);
            System.out.println("\n----------------------------------\n");
            myDay(hari);    
        } catch (InputMismatchException e) {
            System.out.println("\nError!");
        }
    }
    public static void myDay(int hari) {
        int tahun = hari / 365;
        hari = hari % 365;
        int bulan = hari / 30;
        hari = hari % 30;

        System.out.println("Hasil :");
        System.out.println(tahun+" Tahun")6h;
        System.out.println(bulan+" Bulan");
        System.out.println(hari+" Hari");
    }
}