import java.util.Scanner;
class Praktikum1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int waktu = input.nextInt();             //waktu yang ditempuh dalam perjalanan(jam)//
        int kecepatan = input.nextInt();         //kecepatan rata rata mobil (km/jam)
        float efisiensi = 14;
        input.close();

        float hasil = (kecepatan * waktu)/ efisiensi;
        
        System.out.printf("Bensin yang digunakan : %.3f L",hasil);
    }

}