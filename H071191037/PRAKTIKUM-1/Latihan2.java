import java.util.Scanner;
class Latihan2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama");
        String nama = input.nextLine();
        System.out.println("tinggi badan");
        float tinggi = input.nextFloat();
        System.out.println("berat badan");
        float berat = input.nextFloat();
        System.out.println("persentase");

        float persentase = input.nextFloat(); //laki laki 10% dan perempuan 15%
        float beratIdeal = (tinggi - 100) - (persentase*(tinggi - 100)/100);
        float targetBeratBadan = beratIdeal - berat;

        System.out.println("informasi");
        System.out.println("nama anda : " + nama);
        System.out.printf("tinggi anda : %.1fcm \nberat badan anda : %.1fkg \nberat badan ideal anda : %.1fkg \ntarget berat badan ideal anda : %.1fkg",tinggi,berat,beratIdeal,targetBeratBadan);
    }
}