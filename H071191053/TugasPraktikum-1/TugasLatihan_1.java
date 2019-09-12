import java.util.Scanner;

public class TugasLatihan_1 {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("masukkan nama ");
    String nama = sc.nextLine();

    System.out.println("masukkan tinggi ");
    int tinggi = sc.nextInt();

    System.out.println("masukkan berat ");
    int berat = sc.nextInt();

    System.out.println("masukkan persentase = ... %");
    float persentase = sc.nextFloat() / 100;
    sc.close();
    float beratIdeal1 = (tinggi - 100 );
    float beratIdeal2 = beratIdeal1 * persentase;
    float beratIdeal3 = beratIdeal1 - beratIdeal2;
    float beratIdeal4 = beratIdeal3 - berat;


    System.out.println("nama : " + nama);
    System.out.println("tinggi : " + tinggi);
    System.out.println("berat anda : " + berat);
    System.out.printf("berat ideal anda : %.1f\n" , beratIdeal3);
    System.out.printf("target berat ideal anda = %.1f\n" , beratIdeal4);
}

}