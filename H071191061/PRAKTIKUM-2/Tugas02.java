import java.util.InputMismatchException;
import java.util.Scanner;
class Tugas02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    try {
        //Menu
        System.out.println("\n----------------> MENU <----------------");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("----------------------------------------");
        System.out.print("\nInput angka yang sesuai dengan menu yang diinginkan : ");
        int pilih = input.nextInt();
        
        if (pilih == 1){
            System.out.println(" ");
            System.out.println("-------> PILIH BANGUN DATAR <-------");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah ketupat");
            System.out.println("8. Layang-layang");
            System.out.println("-------------------------------------");
            System.out.print("\nInput angka sesuai dengan nomor");
            System.out.print(" bangun datar yang diinginnkan : ");
            int datar = input.nextInt();
            if (datar == 1){
                System.out.print("Input sisi : ");
                int spersegi = input.nextInt();
                int luasPersegi = spersegi * spersegi;
                System.out.println("Luas persegi = " +luasPersegi);
            }else if (datar == 2){
                System.out.print("Input panjang : ");
                int pPJ = input.nextInt();
                System.out.print("Input lebar   : ");
                 int lPJ = input.nextInt();
                int luasPersegiPanjang = pPJ * lPJ;
                System.out.println("Luas persegi panjang = " +luasPersegiPanjang);

            }else if (datar == 3){
                System.out.print("Input alas   : ");
                int aSegitiga = input.nextInt();
                System.out.print("Input tinggi : ");
                int tSegitiga = input.nextInt();
                double luasSegitiga = aSegitiga *  tSegitiga / 2.0;
                System.out.println("Luas Segitiga = " +luasSegitiga); 
            }else if (datar == 4){
                System.out.print("Input jari-jari : ");
                int rLingkaran = input.nextInt(); 
                double luasLingkaran = Math.PI * Math.pow(rLingkaran, 2);
                System.out.printf("Luas lingkaran = %.2f\n " ,luasLingkaran);
            }else if (datar == 5){
                System.out.print("Input alas   : ");
                int alasJg = input.nextInt();
                System.out.print("Input tinggi : ");
                int tinggiJg = input.nextInt();
                int luasJajarGenjang = alasJg * tinggiJg;
                System.out.println("Luas jajar genjang = " +luasJajarGenjang); 
            }else if (datar == 6){
                System.out.print("Input alas         : ");
                int alasT = input.nextInt();
                System.out.print("Input sisi sejajar : ");
                int sisS = input.nextInt();
                System.out.print("Input tinggi       : ");
                int tinggiT = input.nextInt();
                double luasTrapesium = (alasT + sisS) * tinggiT / 2.0;
                System.out.println("Luas trapesium = "+luasTrapesium); 
            }else if (datar == 7){
                System.out.print("Input d1 : ");
                int d1 = input.nextInt();
                System.out.print("input d2 : ");
                int d2 = input.nextInt();
                double luasBelahKetupat = d1 * d2 / 2.0;
                System.out.println("Luas belah ketupat = "+luasBelahKetupat);
            }else if (datar == 8){
                System.out.print("Input d1 : ");
                int d1L = input.nextInt();
                System.out.print("Input d2 : ");
                int d2L =input.nextInt();
                double luasLayang = d1L * d2L / 2.0;
                System.out.println("Luas layang-layang = "+luasLayang);
            }else{
                System.out.println("\nAngka yang anda masukan tidak valid");
            }

        }else if (pilih == 2){
            System.out.println("\n-------> PILIH BANGUN RUANG <-------");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma segitiga");
            System.out.println("4. Limas segiempat");
            System.out.println("5. Kerucut");
            System.out.println("6. Tabung");
            System.out.println("7. Bola");
            System.out.println("-------------------------------------");
            System.out.print("\nInput angka sesuai dengan nomor");
            System.out.print(" bangun ruang yang diinginnkan : ");
            int ruang = input.nextInt();
            if (ruang == 1){
                System.out.print("Input sisi : ");
                int sisi = input.nextInt();
                int volumeKubus = sisi * sisi * sisi;
                System.out.println("Volume Kubus = "+volumeKubus);
            }else if (ruang == 2){
                System.out.print("Input panjang : ");
                int p = input.nextInt();
                System.out.print("Input Lebar   : ");
                int l = input.nextInt();
                System.out.print("Input tinggi  : ");
                int tB = input.nextInt();
                int vBalok = p * l * tB;
                System.out.println("Volume Balok = "+vBalok);
            }else if (ruang == 3){
                System.out.print("Input alas segitiga   : ");
                int alasSegi = input.nextInt();
                System.out.print("Input tinggi segitiga : ");
                int tinggiSegi = input.nextInt();
                System.out.print("Input tinggi          : ");
                int tinggiPrisma = input.nextInt();
                double volumePrisma = (alasSegi * tinggiSegi / 2.0) * tinggiPrisma;
                System.out.println("Volume prisma = "+volumePrisma);
            }else if (ruang == 4){
                System.out.print("Input sisi segi empat : ");
                int sisilimas = input.nextInt();
                System.out.print("Input tinggi          : ");
                int tLimas = input.nextInt();
                int volumeLimas = sisilimas * sisilimas * tLimas;
                System.out.println("Volume Limas = "+volumeLimas);
            }else if (ruang == 5){
                System.out.print("Input jari-jari : ");
                int jariKerucut = input.nextInt();
                System.out.print("Input tinggi    : ");
                int tinggiKerucut = input.nextInt();
                double volumeKerucut = (Math.PI * Math.pow(jariKerucut, 2)) * tinggiKerucut;
                System.out.printf("Volume Kerucut = %.2f\n ",volumeKerucut);
            }else if (ruang == 6){
                System.out.print("Input jari-jari : ");
                int rT = input.nextInt();
                System.out.print("Input tinggi    : ");
                int tT = input.nextInt();
                double volumeTabung = (Math.PI*Math.pow(rT, 2)) * 2 * tT;
                System.out.printf("Volume tabung  = %.2f\n ",volumeTabung);
            }else if (ruang == 7){
                System.out.print("Input jari-jari : ");
                int rB = input.nextInt();
                double volumeBola = Math.PI * Math.pow(rB, 2) * (rB + rB) / 3.0;
                System.out.printf("Volume bola = %.2f\n ",volumeBola); 
            }else {
                System.out.println("\nAngka yang anda masukkan tidak valid!");
            }
        }else {
            System.out.println("\nAngka yang anda masukkan tidak valid!");
        }
    }catch (InputMismatchException pilih) {
        System.out.println(" ");
        System.out.println("Inputan tidak valid!");
    }finally {
        input.close();
    }

    }
}