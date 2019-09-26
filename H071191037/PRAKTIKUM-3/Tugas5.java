import java.util.InputMismatchException;
import java.util.Scanner;

class Tugas5{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Masukkan Nilai 0 - 360 derajat");
            float derajat = inp.nextFloat();
            int s =  Math.round((derajat/360) * (24*3600));
            int h = 0,m = 0;
            inp.close();
            if(derajat < 0){
                System.out.println("Invalid Input");
                return;
            }
            while(s >= 3600){
                h++;
                s-=3600;
            }
            while(s >= 60){
                m++;
                s -=60;
            }
            h = (h+6)%24;
            if(h < 12){
                System.out.printf("Selamat Pagi\n%02d:%02d:%02d",h,m,s);
            } else if (h < 15){
                System.out.printf("Selamat Siang\n%02d:%02d:%02d",h,m,s);
            } else if (h < 18){
                System.out.printf("Selamat Sore\n%02d:%02d:%02d",h,m,s);
            } else {
                System.out.printf("Selamat Malam\n%02d:%02d:%02d",h,m,s);
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}