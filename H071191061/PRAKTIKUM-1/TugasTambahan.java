import java.util.Scanner;
class TugasTambahan{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Harga barang --------> ");
    int harga = input.nextInt();
    System.out.print("Uang yang dibayar ---> ");
    int uang = input.nextInt();

    int kembalian = uang - harga;
    int satus = kembalian / 100000;
    int sSatus = kembalian % 100000;
    int seket = sSatus / 50000;
    int sSeket = sSatus % 50000;
    int rongPuluh = sSeket / 20000;
    int sRongPuluh = sSeket % 20000;
    int sepuloh = sRongPuluh / 10000;
    int sSepuloh = sRongPuluh % 10000;
    int limo = sSepuloh / 5000;
    int sLimo = sSepuloh % 5000;
    int loro = sLimo / 2000;
    int sLoro = sLimo % 2000;
    int sewu = sLoro / 1000;
    
    System.out.println("Kembaliannya : Rp."+kembalian);
    System.out.println(satus+" -------- Lembar Rp.100.000");
    System.out.println(seket+" -------- Lembar Rp. 50.000");
    System.out.println(rongPuluh+" -------- Lembar Rp. 20.000");
    System.out.println(sepuloh+" -------- Lembar Rp. 10.000");
    System.out.println(limo+" -------- Lembar Rp.  5.000");
    System.out.println(loro+" -------- Lembar Rp.  2.000");
    System.out.println(sewu+" -------- Lembar Rp.  1.000");

    input.close();
  }
}