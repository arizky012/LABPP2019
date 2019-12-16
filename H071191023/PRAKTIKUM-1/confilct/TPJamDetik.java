import java.util.Scanner;
class TPJamDetik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int detik, menit, jam ;
System.out.println("Masukkan detik:");
detik = sc.nextInt();
sc.close();

System.out.println();
jam = detik/3600; detik = detik - (3600*jam);
menit = detik/60; detik = detik - (60 * menit);
System.out.println( ""+jam +":"+ menit +":"+ detik);
    }
}