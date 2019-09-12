import java.util.Scanner;

public class TugasPraktikum_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        int jam = a/3600;
        int sisaJam1 = a%3600;
        int menit = sisaJam1/60;
        int sisaMenit = sisaJam1 % 60;
        int detik = sisaMenit;
        
        
        System.out.println(jam + ":" + menit + ":" + detik);
        System.out.printf("%2d:%02d:%2d",jam,menit,detik);
    }
}