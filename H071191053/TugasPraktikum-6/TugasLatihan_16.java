import java.util.Scanner;

public class TugasLatihan_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kataAwal = sc.nextLine();
        int jumlahKarakterAwal = kataAwal.length();
        int jumlahKarakterKuadrat = kataAwal.length() * kataAwal.length();
        kataAwal = kataAwal.replaceAll(" ", "");
        kataAwal = kataAwal.toUpperCase();

        int panjang = kataAwal.length() / 2;

        String kataPotong1 = kataAwal.substring(0, panjang);
        char[] kataPotong2Sementara = kataPotong1.toCharArray();
        String kataPotong2 = "";

        for (int i = kataPotong1.length() - 2; i >= 0; i--) {
            kataPotong2 += kataPotong2Sementara[i];
        }

        String hex = String.format("%x", jumlahKarakterKuadrat);
        char hexAwal = hex.charAt(0);

        String oct = String.format("%o", jumlahKarakterAwal);
        
        String palindrom = hex + kataPotong1 + kataPotong2 + oct;

        if (hexAwal >= 'A' && hexAwal <= 'z') {
            System.out.println("#" + palindrom + "?");
        } else {
            System.out.println("#" + palindrom + "!");
        }

    }
}