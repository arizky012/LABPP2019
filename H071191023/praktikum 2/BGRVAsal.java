import java.util.Scanner;
class BGRVAsal{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int angka = sc.nextInt();
        System.out.println(" * Menu* ");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("input angka sesuai menu yang di inginkan");


        if (angka == 1){
            System.out.println(" * pilih bangun datar * ");
            System.out.println(" 1. persegi");
            System.out.println(" 2. persegi panjang");
            System.out.println(" 3. segitiga");
            System.out.println(" 4. lingkaran");
            System.out.println(" 5. jajar genjang");
            System.out.println(" 6. trapesium");
            System.out.println(" 7. belah ketupat");
            System.out.println(" 8. layang-layang");
            System.out.println(" ");
            System.out.println("input angka sesuai nomor bangun datar yang diinginkan");
            int bangun = pew.nextInt();

            if (bangun == 1){                              
                System.out.println("input panjang");
                int panjang = pew.nextInt();
                System.out.println("input lebar");
                int lebar = pew.nextInt();
                double luas = panjang * lebar;
                System.out.println("luas persegi = " + luas);
            }else if (bangun == 2){
                System.out.println("input panjang");
                int panjang = pew.nextInt();
                System.out.println("input lebar");
                int lebar = pew.nextInt();
                double luas = panjang * lebar;
                System.out.println("luas persegi panjang = " + luas);
            }else if (bangun == 3){
                System.out.println("input alas");
                int alas = pew.nextInt();
                System.out.println("input tinggi");
                int tinggi = pew.nextInt();
                double hasil = (alas * tinggi) / 2;
                System.out.println("luas segitiga = " + hasil);
            }else if (bangun == 4){
                System.out.println("input jari-jari");
                int jari = pew.nextInt();
                double hasil = Math.PI * Math.pow(jari, 2);
                System.out.printf("luas lingkaran adalah= " + "%.2f",hasil);
            }else if (bangun == 5){
                System.out.println("input alas");
                int alas = pew.nextInt();
                System.out.println("input tinggi");
                int tinggi = pew.nextInt();
                double hasil = (alas * tinggi);
                System.out.println("luas jajar genjang = " + hasil);
            }else if (bangun == 6){
                System.out.println("input sisi1");
                int sisi1 = pew.nextInt();
                System.out.println("input sisi2");
                int sisi2 = pew.nextInt();
                System.out.println("input tinggi");
                double tinggi = pew.nextInt();
                double hasil = (( sisi1 + sisi2 ) * tinggi) / 2 ;
                System.out.println("luas trapesium = " + hasil);
            }else if (bangun == 7){
                System.out.println("input diagonal1");
                int diagonal1 = pew.nextInt();
                System.out.println("input diagonal2");
                int diagonal2 = pew.nextInt();
                double hasil = (diagonal1 * diagonal2) / 2 ;
                System.out.println("luas belah ketupat = " + hasil);
            }else if (bangun == 8){
                System.out.println("input diagonal1");
                int diagonal1 = pew.nextInt();
                System.out.println("input diagonal2");
                int diagonal2 = pew.nextInt();
                double hasil = (diagonal1 * diagonal2) / 2 ;
                System.out.println("luas layang-layang = " + hasil);
            }

        }else if (angka ==2){
            System.out.println(" * pilih bangun ruang * ");
            System.out.println(" 1. kubus");
            System.out.println(" 2. balok");
            System.out.println(" 3. limas");
            System.out.println(" 4. prisma");
            System.out.println(" 5. tabung");
            System.out.println(" 6. kerucut");
            System.out.println(" 7. bola");
            System.out.println(" ");
            System.out.println("input angka sesuai nomor bangun ruang yang diinginkan");
            int ruang = pew.nextInt();

            if (ruang == 1){
                System.out.println("input sisi1");
                int sisi1 = pew.nextInt();
                double volume = Math.pow(sisi1, 3);
                System.out.println("volume kubus = " + volume);
            }else if (ruang == 2){
                System.out.println("input panjang");
                int sisi1 = pew.nextInt();
                System.out.println("input lebar");
                int sisi2 = pew.nextInt();
                System.out.println("input tinggi");
                int sisi3 = pew.nextInt();
                double volume = sisi1 * sisi2 * sisi3;
                System.out.println("volume balok = " + volume);
            }else if (ruang == 3){
                System.out.println("input luas alas");
                int lalas = pew.nextInt();
                System.out.println("input tinggi");
                int tinggi = pew.nextInt();
                double volume = (lalas * tinggi) / 3 ;
                System.out.println("volume limas = " + volume);
            }else if (ruang == 4){
                System.out.println("input luas alas");
                int lalas = pew.nextInt();
                System.out.println("input tinggi");
                int tinggi = pew.nextInt();
                double volume = (lalas * tinggi);
                System.out.println("volume prisma = " + volume);
            }else if (ruang == 5){
                System.out.println("input jari-jari");
                double r = pew.nextDouble();
                System.out.println("input tinggi");
                double tinggi = pew.nextDouble();
                double PHI = 3.14;
                double volume = (PHI * r * r) * tinggi;
                System.out.printf("volumme tabung adalah= " + "%.2f",volume);
            }else if (ruang == 6){
                System.out.println("input jari-jari");
                double r = pew.nextDouble();
                System.out.println("input tinggi");
                double tinggi = pew.nextDouble();
                double PHI = 3.14;
                double volume = ((PHI * r * r) * tinggi) / 3;
                System.out.printf("volume kerucut adalah= " + "%.2f",volume);
            }else if (ruang == 7){
                System.out.println("input jari-jari");
                double r = pew.nextDouble();
                double PHI = 3.14;
                double volume = ((PHI * r * r * r) * 4) / 3;
                System.out.printf("volume kerucut adalah= " + "%.2f",volume);
            }
        }else{
            System.out.println("bukan menu 1&&2");

        }   

        
    }
}