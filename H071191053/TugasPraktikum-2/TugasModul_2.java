import java.util.Scanner;

public class TugasModul_2 {
    public static void main(String[] args) {
      
      try {  Scanner sc = new Scanner(System.in);

        System.out.println("menu\n1.mencari luas bangun datar\n2.mencari volume bangun ruang\n\ninput angka sesuai dengan menu yang diinginkan");
        int a = sc.nextInt();
        switch (a){
            case 1 :
            System.out.println("pilih bangun datar");
            System.out.println("1. persegi\n2. persegi panjang\n3. segitiga\n4. lingkaran\n5. jajar genjang\n6. trapesium\n7. belah ketupat\n8. layang-layang");
            System.out.println("\ninput angka sesuai dengan nomor bangun datar yang di inginkan : ");
            int b = sc.nextInt();
            switch (b){
                case 1 :
                System.out.println("Input sisi");
                double sisiPersegi =  sc.nextDouble();
                System.out.println("luas persegi = " + Math.pow(sisiPersegi, 2));
                break;

                case 2:
                System.out.println("Input panjang");
                int sisiPersegiPanjang = sc.nextInt();
                System.out.println("Input lebar");
                int lebarPersegiPanjang = sc.nextInt();
                System.out.println("Luas Persegi Panjang = " + (sisiPersegiPanjang * lebarPersegiPanjang));
                break;

                case 3 :
                System.out.println("Input Alas Segitiga");
                double alasSegitiga = sc.nextInt();
                System.out.println("Input Tinggi Segitiga");
                double tinggiSegitiga = sc.nextInt();

                double luasSegitiga = ((alasSegitiga * tinggiSegitiga)/2);
                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;

                case 4 :
                System.out.println("Input Jari-jari = ");
                double jariJariLingkaran = sc.nextDouble();
                System.out.println("Luas Lingakran = " + (Math.PI * Math.pow(jariJariLingkaran, 2)));
                break;

                case 5 :
                System.out.println("Input Tinggi Jajar Genjang");
                int tinggiJajarGenjang = sc.nextInt();
                System.out.println("Input Alas Jajar Genjang");
                int alasJajarGenjang = sc.nextInt();
                System.out.println("Luas Jajar Genjang = " + (tinggiJajarGenjang * alasJajarGenjang));
                break;

                case 6 : 
                System.out.println("Input Sisi Atas Dan Sisi Bawah Trapesium");
                double sisiAtasTrapesium = sc.nextDouble();
                double sisiBawahTrapesium = sc.nextDouble();
                System.out.println("Input Tinggi Trapesium");
                double tinggiTrapesium = sc.nextDouble();
                double luasTrapesium = ((sisiAtasTrapesium + sisiBawahTrapesium) * tinggiTrapesium)/2;
                System.out.println("Luas Trapesium = " + luasTrapesium);
                break;

                case 7:
                System.out.println("Input Diagonal 1 Belah Ketupat");
                double diagonal1BelahKetupat = sc.nextDouble();
                System.out.println("Input Diagonal 2 Belah Ketupat");
                double diagonal2BelahKetupat = sc.nextDouble();
                System.out.println("Luas Belah Ketupat = " + ((diagonal1BelahKetupat * diagonal2BelahKetupat)/2));
                break;

                case 8 :
                System.out.println("Input Diagonal 1 Layang-Layang");
                double diagonal1LayangLayang = sc.nextDouble();   
                System.out.println("Input Diagonal 2 Layang-Layang");
                double diagonal2LayangLayang = sc.nextDouble();
                System.out.println("Luas Layang-Layang = " + ((diagonal1LayangLayang * diagonal2LayangLayang)/2));
                break;
                
                default :
                System.out.println("ERROR");

            }

            break;


            case 2 :
            System.out.println("Pilih Bangun Ruang");
            System.out.println("1. Kubus\n2. Balok\n3. Linmas Segiempat\n4. Prisma Segitiga\n5. Linmas Segitiga\n6. Selinder\n7. Kerucut\n8. Bola");
            System.out.println("\nInput Angka Sesuai Bangun Yang Diinginkan");
            int c  = sc.nextInt();
            switch(c){
                case 1 :
                System.out.println("Input Rusuk Kubus");
                double rusukKubus = sc.nextDouble();
                System.out.println("Volume Kubus = " + (Math.pow(rusukKubus, 3)));
                break;

                case 2 :
                System.out.println("Input Panjang Balok");
                int panjangBalok = sc.nextInt();
                System.out.println("Input Lebar Balok");
                int lebarBalok = sc.nextInt();
                System.out.println("Input Tinggi Balok");
                int tinggiBalok = sc.nextInt();
                System.out.println("Volume Balok = " + (panjangBalok * lebarBalok *  tinggiBalok));
                break;

                case 3 :
                System.out.println("Inut Sisi Alas Linmas Segiempat");
                double sisiAlasSegiempat = sc.nextDouble();
                System.out.println("Input Tinggi Linmas Segiempat");
                double tinggiLinmasSegiempat = sc.nextDouble();
                System.out.println("Volume Linmas Segiempat = " + (Math.pow(sisiAlasSegiempat, 2)) *  tinggiLinmasSegiempat / 3);
                break;

                case 4 :
                System.out.println("Input Alas Alas Prisma Segitiga");
                double alasAlasPrismaSegitiga =  sc.nextDouble();
                System.out.println("Input Tinggi Alas Prisma Segitiga");
                double tinggiAlasPrismaSegitiga = sc.nextDouble();
                System.out.println("Input Tinggi Prisma Segitiga");
                double tinggiPrismaSegitiga = sc.nextDouble();
                System.out.println("Volume Prisma Segitiga = " + ((alasAlasPrismaSegitiga *tinggiAlasPrismaSegitiga) / 2) * tinggiPrismaSegitiga);
                break;

                case 5 :
                System.out.println("Input Alas Alas Linmas Segitiga");
                double alasAlasLinmasSegitiga = sc.nextDouble();
                System.out.println("Input Tinggi Alas Segitiga");
                double tinggiAlasLinmasSegitiga = sc.nextDouble();
                System.out.println("Input Tinggi Linmas Segitiga");
                double tinggiLinmasSegitiga = sc.nextDouble();
                System.out.println("Volume Linmas Segitiga = " + (((alasAlasLinmasSegitiga * tinggiAlasLinmasSegitiga) / 2) * tinggiLinmasSegitiga));
                break;

                case 6 :
                System.out.println("Input Jari-Jari Alas Selinder");
                double jariJariAlasSelinder = sc.nextDouble();
                System.out.println("Input Tinggi Selinder");
                double tinggiSelinder = sc.nextDouble();
                System.out.println("Volume Silinder = " + (Math.PI * Math.pow(jariJariAlasSelinder, 2) * tinggiSelinder));
                break;

                case 7 :
                System.out.println("Input Jari-Jari Alas Kerucut");
                double jariJariAlasKerucut = sc.nextDouble();
                System.out.println("Input Tinggi Alas Kerucut");
                double tinggiKerucut = sc.nextDouble();
                System.out.println("Volume Kerucut = " + ((Math.PI * Math.pow(jariJariAlasKerucut, 2) * tinggiKerucut) / 3));
                break;

                case 8 : 
                System.out.println("Input Jari-Jari Bola");
                double jariJariBola = sc.nextDouble();
                System.out.println("Volume Bola = " + ((Math.PI * Math.pow(jariJariBola, 3) * 4) / 3));
                break;

                default : 
                System.out.println("ERROR");
            }

            break;
        }
    }catch(Exception e){
        System.out.println("ERROR");
    }
    }
}