import java.util.Scanner ;

class BangunRuang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("**Menu**\n1.Mencari Luas Bangun Datar\n2.Mencari Volume Bangun Ruang");
        System.out.println("\nInput angka sesuai dengan Menu Yang diinginkan :");
        int input1 = in.nextInt();
        float hasil;

        switch(input1) {
            case 1:
                System.out.println("\n**Pilih Bangun Datar**\n1.Persegi\n2.Persegi Panjang\n3.Segitiga\n4.Lingkaran\n5.Jajar Genjang\n6.Trapesium\n7.Belah Ketupat\n8.Layang-Layang");
                System.out.println("\nInput angka sesuai dengan nomor bangun datar yang diinginkan : ");
                int input2 = in.nextInt();
                switch(input2){
                    case 1:
                        System.out.print("Input Panjang Sisi\t: ");
                        float input3 = in.nextInt();
                        hasil = input3*input3;
                        System.out.printf("Luas persegi = %.1f m", hasil);
                        break;
                    case 2:
                        System.out.print("Input Panjang\t: ");
                        float panjangPP = in.nextInt();
                        System.out.print("Input Lebar\t: ");
                        float lebarPP = in.nextInt();
                        hasil = panjangPP*lebarPP;
                        System.out.printf("Luas Persegi Panjang = %.1f m", hasil);
                        break;
                    case 3:
                        System.out.print("Input alas\t: ");
                        float alasS = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiS = in.nextInt();
                        hasil = (alasS*tinggiS)/2;
                        System.out.printf("Luas Segitiga = %.1f m", hasil);
                        break;
                    case 4:
                        System.out.print("Input jari-jari\t: ");
                        double jari = in.nextInt();
                        double hasil2 = 22/7*Math.pow (jari,2);
                        System.out.printf("Luas Lingkaran = %.1f m", hasil2);
                        break;
                    case 5:
                        System.out.print("Input alas\t: ");
                        float alasJG = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiJG = in.nextInt();
                        hasil = alasJG*tinggiJG;
                        System.out.printf("Luas jajar genjang = %.1f m", hasil);
                        break;
                    case 6:
                        System.out.print("Input panjang sisi sejajar\t: ");
                        float sisejajar = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiTP = in.nextInt();
                        hasil = (sisejajar*tinggiTP)/2;
                        System.out.printf("Luas Trapesium = %.1f m", hasil);
                        break;
                    case 7:
                        System.out.print("Input alas\t: ");
                        float alasBK = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiBK = in.nextInt();
                        hasil = alasBK*tinggiBK;
                        System.out.printf("Luas Belah Ketupat = %.1f m", hasil);
                        break;
                    case 8:
                        System.out.print("Input diagonal 1\t: ");
                        float diagonal1 = in.nextInt();
                        System.out.print("Input diagonal 2\t: ");
                        float diagonal2 = in.nextInt();
                        hasil = (diagonal1*diagonal2)/2;
                        System.out.printf("Luas Layang-Layang = %.1f m", hasil);
                        break;
                    } break;
            case 2:
                System.out.println("\n**Pilih Bangun Ruang**\n1.Kubus\n2.Balik\n3.Prisma Segitiga\n4.Limas Segiempat\n5.Limas Segi tiga\n6.Tabung\n7.Kerucut\n8.Bola");
                System.out.println("\nInput angka sesuai dengan nomor bangun ruang yang diinginkan : ");
                int input4 = in.nextInt();
                switch (input4){
                    case 1:
                        System.out.print("Input Sisi\t: ");
                        double sisiKB = in.nextInt();
                        double hasil3 = Math.pow(sisiKB,3);
                        System.out.printf("Volume Kubus = %.1f m", hasil3);
                        break;
                    case 2:
                        System.out.print("Input Panjang\t: ");
                        float panjangBk = in.nextInt();
                        System.out.print("Input lebar\t: ");
                        float lebarBk = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiBk = in.nextInt();
                        hasil = panjangBk*lebarBk*tinggiBk;
                        System.out.printf("Volume Balok = %.1f m", hasil);
                        break;
                    case 3:
                        System.out.print("Input sisi 1 alas segitiga\t: ");
                        float sisi1Ps = in.nextInt();
                        System.out.print("Input sisi 2 alas segitiga\t: ");
                        float sisi2Ps = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiPs = in.nextInt();
                        hasil = (sisi1Ps*sisi2Ps*tinggiPs)/2;
                        System.out.printf("Volume Prisma Segitiga = %.1f m", hasil);
                        break;
                    case 4:
                        System.out.print("Input panjang alas\t: ");
                        float panjangLs = in.nextInt();
                        System.out.print("Input lebar alas\t: ");
                        float lebarLs = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiLs = in.nextInt();
                        hasil = ((panjangLs*lebarLs)*tinggiLs)/3;
                        System.out.printf("Volume Limas Segi Empat = %.1f m", hasil);
                        break;
                    case 5:
                        System.out.print("Input sisi 1 segitiga\t: ");
                        float sisi1Lst = in.nextInt();
                        System.out.print("Input sisi 2 segitiga\t: ");
                        float sisi2Lst = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        float tinggiLst = in.nextInt();
                        hasil = (((sisi1Lst*sisi2Lst)/2)*tinggiLst)/3;
                        System.out.printf("Volume Limas Segi Tiga = %.1f m", hasil);
                        break;
                    case 6:
                        System.out.print("Input jari-jari\t: ");
                        double jariT = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        double tinggiT = in.nextInt();
                        double hasil4 = (3.14*Math.pow(jariT,2)*tinggiT);
                        System.out.printf("Volume Tabung = %.1f m", hasil4);
                        break;
                    case 7:
                        System.out.print("Input jari-jari\t: ");
                        double jariK = in.nextInt();
                        System.out.print("Input tinggi\t: ");
                        double tinggiK = in.nextInt();
                        double hasil5 = (1/3*3.14*Math.pow(jariK,2)*tinggiK);
                        System.out.printf("Volume Kerucut = %.1f m", hasil5);
                        break;
                    case 8:
                        System.out.print("Input jari-jari\t: ");
                        double jariB = in.nextInt();
                        double hasil6 = 4/3*3.14*Math.pow(jariB,3);
                        System.out.printf("Volume Bola = %.1f m", hasil6);
                        break;
                }

        }
        in.close();
    }
}