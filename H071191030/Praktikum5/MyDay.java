import java.util.Scanner;

public class MyDay {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);

            int days = ka.nextInt();

            System.out.println(tahun(days) + " tahun");
            System.out.println(bulan(days) + " bulan");
            System.out.println(hari(days) + " hari");

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    public static int tahun(int days) {
        int tahun = days / 365;
        return tahun;
    }

    public static int bulan(int days) {
        int bulan = (days % 365) / 30;
        return bulan;
    }

    public static int hari(int days) {
        int hari = (days % 365) % 30;
        return hari;
    }
}