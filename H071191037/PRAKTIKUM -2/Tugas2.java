import java.util.InputMismatchException;
import java.util.Scanner;
class Tugas2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double luas,volume;
        try{
            System.out.println("**menu**\n1. Mencari Luas Bangun Datar\n2. Mencari Volume Bangun Ruang\n");
            System.out.println("Input angka sesuai dengan Menu yang diinginkan :");
            int menu = inp.nextInt();
            switch(menu){
            case 1:
                System.out.println("**Pilih Bangun Datar**");
                System.out.println("\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang-Layang");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int bangunDatar = inp.nextInt();
                    switch(bangunDatar){
                        case 1: 
                            System.out.println("Input Panjang Sisi Persegi");
                            int sisi = inp.nextInt();
                            luas = sisi * sisi;
                            System.out.printf("Luas Persegi = %.1f",luas);
                            break;    
                        case 2:
                            System.out.println("Input Panjang");
                            int p = inp.nextInt();
                            System.out.println("Input Lebar");
                            int l = inp.nextInt();
                            luas = p * l;
                            System.out.printf("Luas Persegi Panjang = %.1f",luas);
                            break;   
                        case 3:
                            System.out.println("Input Alas");
                            int a = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t = inp.nextInt();
                            luas = (a * t)/2;
                            System.out.printf("Luas Segitiga = %.1f",luas);
                            break;
                        case 4:
                            System.out.println("Input Jari-jari(r)");
                            Double r = inp.nextDouble();
                            luas = Math.PI * Math.pow(r, 2);
                            System.out.printf("Luas Lingkaran = %.1f",luas);
                            break;
                        case 5:
                            System.out.println("Input Alas");
                            int a5 = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t5 = inp.nextInt();
                            luas = a5 * t5;
                            System.out.printf("Luas Jajar Genjang = %.1f",luas);
                            break;
                        case 6:
                            System.out.println("Input Panjang Sisi Sejajar");
                            int sisi6 = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t6 = inp.nextInt();
                            luas = (sisi6 * t6)/2;
                            System.out.printf("Luas Trapesium = %.1f",luas);
                            break;
                        case 7:
                            System.out.println("Input Alas");    
                            int a7 = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t7 = inp.nextInt();
                            luas = a7 * t7;
                            System.out.printf("Luas Belah Ketupat = %.1f",luas);
                            break;
                        case 8:
                            System.out.println("Input Diagonal 1");
                            int d1 = inp.nextInt();
                            System.out.println("Input Diagonal 2");
                            int d2 = inp.nextInt();
                            luas = (d1 * d2)/2;
                            System.out.printf("Luas Layang-Layang = %.1f",luas);
                            break;
                        default:
                            System.out.println("Inputan Tidak Valid");
                            break;
                    }
                break;
            case 2:
                System.out.println("**Pilih Bangun Ruang**");
                System.out.println("\n1. Kubus\n2. Balok\n3. Prisma Segitiga\n4. Limas Segiempat\n5. Limas Segitiga\n6. Tabung\n7. Kerucut\n8. Bola");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int bangunRuang = inp.nextInt();
                    switch(bangunRuang){
                        case 1:
                            System.out.println("Input Panjang Sisi Kubus");
                            int sisiK = inp.nextInt();
                            volume = Math.pow(sisiK, 3);
                            System.out.printf("Volume Kubus = %.1f",volume);
                            break;
                        case 2:
                            System.out.println("Input Panjang Balok");
                            int pb = inp.nextInt();
                            System.out.println("Input Lebar Balok");
                            int lb = inp.nextInt();
                            System.out.println("Input Tinggi Balok");
                            int tb = inp.nextInt();
                            volume = pb * lb * tb;
                            System.out.printf("Volume Balok = %.1f",volume);
                            break;
                        case 3:
                            System.out.println("Input Panjang");
                            int p3 = inp.nextInt();
                            System.out.println("Input Lebar");
                            int l3 = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t3 = inp.nextInt();
                            volume = (p3 * l3 * t3)/2;
                            System.out.printf("Volume Prisma Segitiga = %.1f",volume);
                            break;
                        case 4:
                            System.out.println("Input Panjang");
                            int p4 = inp.nextInt();
                            System.out.println("Input Lebar");
                            int l4 = inp.nextInt();
                            System.out.println("Input Tinggi");
                            int t4 = inp.nextInt();
                            volume = (p4 * l4 * t4)/3;
                            System.out.printf("Volume Prisma Segiempat = %.1f",volume);
                            break;
                        case 5:
                            System.out.println("Input Alas");
                            int aL = inp.nextInt();
                            System.out.println("Input Tinggi Alas");
                            int taL = inp.nextInt();
                            System.out.println("Input Tinggi Limas");
                            int tL = inp.nextInt();
                            volume = ((aL*taL)/2 * tL)/3;
                            System.out.printf("Volume Limas Segitiga = %.1f",volume);
                            break;
                        case 6:
                            System.out.println("Input Jari-jari Alas(r)");
                            double r6 = inp.nextInt();
                            r6 = Math.PI * Math.pow(r6,2);
                            System.out.println("Input Tinggi Tabung");
                            int t6 = inp.nextInt();
                            volume = r6 * t6;
                            System.out.printf("Volume Tabung = %.1f",volume);
                            break;
                        case 7:
                            System.out.println("Input Jari-jari Alas(r)");
                            double r7 = inp.nextInt();
                            r7 = Math.PI * Math.pow(r7,2);
                            System.out.println("Input Tinggi Kerucut");
                            int tK = inp.nextInt();
                            volume = (r7 * tK)/3;
                            System.out.printf("Volume Kerucut = %.1f",volume);
                            break;
                        case 8:
                            System.out.println("Input Jari-jari Bola(r)");
                            double r8 = inp.nextInt();
                            volume = 4 * (Math.PI * Math.pow(r8,3))/3;
                            System.out.printf("Volume Bola = %.1f",volume);
                            break;
                        default:
                            System.out.println("Inputan Tidak Valid");
                            break;
                    }
                break;
            default:
                System.out.println("Inputan Tidak Valid");
                break;
            }
            inp.close();
        }
        catch(InputMismatchException ae){
            System.out.println("Inputan Tidak Valid");
        }
    }
}