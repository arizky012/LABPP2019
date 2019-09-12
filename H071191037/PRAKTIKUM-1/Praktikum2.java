import java.util.Scanner;
class Praktikum2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int detik = input.nextInt(),tampung,jam,menit,detik2;     //variabel yang menampung jumlah detik//
        input.close();
        
        jam = detik / 3600;
        tampung = detik - (jam * 3600);
        menit = tampung / 60;
        tampung = tampung - (menit * 60);
        detik2 = tampung;

        System.out.printf("%02d : %02d : %02d", jam ,menit ,detik2); 
    }
}