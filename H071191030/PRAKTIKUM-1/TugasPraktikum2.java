import java.util.Scanner;
class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        System.out.println("detik");
        int detik = ka.nextInt();
        ka.close();

        int jam, menit, sisaJam, sisaMenit;
        jam = detik/3600;
        sisaJam = detik%3600;

        menit = sisaJam/60;
        sisaMenit = sisaJam%60;

        System.out.printf("%02d:%02d:%02d", jam , menit, sisaMenit);
 
    }
}