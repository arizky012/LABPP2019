import java.util.Scanner;

public class TugasModul2 {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {
            
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("\nInput angka sesuai dengan Menu yang diinginkan");
        int menu = ka.nextInt();

        switch (menu) {
        case 1:
            System.out.println("** Pilih Bangun Datar ** \n1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Jajar Genjang \n6. Trapesium \n7. Belah Ketupat \n8. Layang-Layang");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
            int bangunDatar = ka.nextInt();

            switch (bangunDatar) {
            case 1:
                System.out.println("Input Panjang Sisi");
                double s = ka.nextDouble();
                double luasPersegi = Math.pow(s, 2);
                System.out.println("Luas persegi = " + luasPersegi);
                break;
            case 2:
                System.out.println("Input Panjang");
                double p = ka.nextDouble();
                System.out.println("Input Lebar");
                double l = ka.nextDouble();
                double luasPersegiPanjang = p * l;
                System.out.println("Luas persegi panjang = " + luasPersegiPanjang);
                break;
            case 3:
                System.out.println("Input Alas");
                double a = ka.nextDouble();
                System.out.println("Input Tinggi");
                double t = ka.nextDouble();
                double luasSegitiga = (a * t) / 2;
                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;
            case 4:
                System.out.println("Input jari-jari lingkaran");
                double r = ka.nextDouble();
                double luasLingkaran = Math.PI * Math.pow(r, 2);
                System.out.println("Luas Lingkaran = " + luasLingkaran);
                break;
            case 5:
                System.out.println("Input Alas");
                double a2 = ka.nextDouble();
                System.out.println("Input Tinggi");
                double t2 = ka.nextDouble();
                double luasJajarGenjang = (a2 * t2);
                System.out.println("Luas Jajar Genjang = " + luasJajarGenjang);
                break;
            case 6:
                System.out.println("Input Sisi Atas");
                double sa = ka.nextDouble();
                System.out.println("Input Sisi Bawah");
                double sb = ka.nextDouble();
                System.out.println("Input Tinggi");
                double t3 = ka.nextDouble();
                double luasTrapesium = (sa + sb) * t3 / 2;
                System.out.println("Luas Trapesium = " + luasTrapesium);
                break;
            case 7:
                System.out.println("Input Diagonal 1");
                double d1 = ka.nextDouble();
                System.out.println("Input Diagonal 2");
                double d2 = ka.nextDouble();
                double luasBelahKetupat = d1 * d2 / 2;
                System.out.println("Luas Belah Ketupat = " + luasBelahKetupat);
                break;
            case 8:
                System.out.println("Input Diagonal 1");
                double di1 = ka.nextDouble();
                System.out.println("Input Diagonal 2");
                double di2 = ka.nextDouble();
                double luasLayang = di1 * di2 / 2;
                System.out.println("Luas Layang-Layang = " + luasLayang);
                break;
            default:
                System.out.println("Inputan tidak valid");
                break;
            }
            break;

        case 2:
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus \n2. Balok \n3. Prisma Segitiga \n4. Limas Segi Empat \n5. Limas Segi Tiga \n6. Tabung \n7. Kerucut \n8. Bola");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan");
            int BangunRuang = ka.nextInt();

            switch (BangunRuang) {
            case 1:
                System.out.println("Input Panjang Sisi");
                double s2 = ka.nextDouble();
                double volumeKubus = Math.pow(s2, 3);
                System.out.println("Volume Kubus = " + volumeKubus);
                break;
            case 2:
                System.out.println("Input Panjang");
                double p2 = ka.nextDouble();
                System.out.println("Input Lebar");
                double l2 = ka.nextDouble();
                System.out.println("Input Tinggi");
                double tg2 = ka.nextDouble();
                double volumeBalok = 2 * p2 * l2 + 2 * p2 * tg2 + 2 * l2 * tg2;
                System.out.println("Volume Balok = " + volumeBalok);
                break;
            case 3:
                System.out.println("Input Alas Segitiga");
                double as = ka.nextDouble();
                System.out.println("Input Tinggi Segitiga");
                double ts = ka.nextDouble();
                System.out.println("Input Tinggi Prisma");
                double tp = ka.nextDouble();
                double volumePrisma = (as * ts * tp) / 2;
                System.out.println("Volume Prisma Segitiga = " + volumePrisma);
                break;
            case 4:
                System.out.println("Input Panjang Alas");
                double p3 = ka.nextDouble();
                System.out.println("Input Tinggi Limas");
                double tl = ka.nextDouble();
                double volumeLimasSegiempat = Math.pow(p3, 2) * tl / 3;
                System.out.println("Volume Limas Segi Empat = " + volumeLimasSegiempat);
                break;
            case 5:
                System.out.println("Input Alas Segitiga");
                double as1 = ka.nextDouble();
                System.out.println("Input Tinggi Segitiga");
                double ts1 = ka.nextDouble();
                System.out.println("Input Tinggi Limas");
                double tl1 = ka.nextDouble();
                double volumeLimasSegitiga = as1 * ts1 * tl1 / 6;
                System.out.println("Volume Limas Segitiga = " + volumeLimasSegitiga);
                break;
            case 6:
                System.out.println("Input Jari-jari Lingkaran");
                double jl = ka.nextDouble();
                System.out.println("Input Tinggi Tabung");
                double tt = ka.nextDouble();
                double volumeTabung = Math.PI * Math.pow(jl, 2) * tt;
                System.out.println("Volume Tabung = " + volumeTabung);
                break;
            case 7:
                System.out.println("Input Jari-jari Lingkaran");
                double jk = ka.nextDouble();
                System.out.println("Input Tinggi Kerucut");
                double tk = ka.nextDouble();
                double volumeKerucut = (Math.PI * Math.pow(jk, 2) * tk) / 3;
                System.out.println("Volume Kerucut = " + volumeKerucut);
                break;
            case 8:
                System.out.println("Input Jari-jari Bola");
                double jb = ka.nextDouble();
                double volumeBola = (Math.PI * Math.pow(jb, 3)) * 4 / 3;
                System.out.println("Volume Bola = " + volumeBola);
                break;
                
            default:
                System.out.println("Inputan tidak valid");
                break;
            }
        break;
        default:
        System.out.println("Inputan tidak valid");}

            
        } catch (Exception e) {
         System.out.println("Inputan tidak valid");
        }
        ka.close();
    }

}