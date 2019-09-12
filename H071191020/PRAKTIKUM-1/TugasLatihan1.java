import java.util.Scanner;

class TugasLatihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();

        System.out.print("Tinggi Badan Anda  : ");
        int tinggiBadan = in.nextInt();

        System.out.print("Berat Badan Anda   : ");
        int beratBadan = in.nextInt();

        System.out.println("Persentase anda    : (Lk = 10, Pr = 15)");
        float persentasi = in.nextInt() /100;
        in.close();

        float ideal1= (tinggiBadan-100);
        float ideal2 = ideal1-(persentasi/100*ideal1);
        float ideal3 = ideal2 - beratBadan;
        System.out.println("Informasi");
        System.out.println("Nama                          : " +nama);
        System.out.println("Tinggi Badan                  : " + tinggiBadan+ " m");
        System.out.println("Berat Badan Anda              : " + beratBadan + " Kg");
        System.out.println("Berat Badan Ideal Anda        : " + ideal2 + " Kg");
        System.out.printf("Target Berat Badan Ideal Anda : %.1f  Kg", ideal3);
    }
}