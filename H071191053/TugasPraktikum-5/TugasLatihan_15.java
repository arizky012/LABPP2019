import java.util.Scanner;

public class TugasLatihan_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
        int days = sc.nextInt();
        } catch(Exception e){
            System.out.println("Salah input");
        }
        sc.close();
        konversiHari(days);

    }

    public static void konversiHari (int a){
        
        int tahun = a/365;
        int sisaTahun = a%365;
        int bulan = sisaTahun/30;
        int hari = sisaTahun%30;

        System.out.printf("%d tahun\n%d bulan\n%d hari",tahun,bulan,hari);
    }
}