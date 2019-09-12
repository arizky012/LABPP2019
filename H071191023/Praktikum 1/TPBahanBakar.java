import java.util.Scanner;
class TPBahanBakar{
public static void main(String[] args) {
Scanner sc = new Scanner(System. in);
double efisien = 14;
int WaktuTempuh= sc.nextInt();
int kecepatan = sc.nextInt();
sc.close();
double hasil = (kecepatan * WaktuTempuh)/ efisien;

  System.out.printf("Bensin yg digunakan %.3f L", hasil);
}
}



