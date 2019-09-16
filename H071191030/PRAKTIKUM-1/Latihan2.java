import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        System.out.println("Masukkan nama:");
        String nama = ka.nextLine();
        System.out.println("Masukkan tinggi:");
        int tb = ka.nextInt();
        System.out.println("Masukkan berat:");
        int bb = ka.nextInt();
        System.out.println("Persentasi:");
        double p = ka.nextDouble() /100;
        ka.close();

        double ideal = tb - 100;
        double ideal1 = ideal*(p);
        double ideal2 = ideal-ideal1;
        double target = ideal2 - bb;
        System.out.println("Informasi");
        System.out.println("Nama : " + nama);
        System.out.println("Tinggi badan : " + tb +" cm");
        System.out.println("Berat badan Anda : " + bb + " kg");
        System.out.println("Berat badan ideal Anda : " + ideal2 + " kg");
        System.out.printf("Target berat badan ideal Anda : %.1f ", target);
        System.out.print("kg");


    }

}