import java.util.Scanner;

class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputDetik = in.nextInt();
        in.close();

        int jam = inputDetik/3600;
        inputDetik %= 3600;
        int menit = inputDetik/60;
        inputDetik %= 60;
        int detik = inputDetik;
        
        System.out.printf("%02d : %02d : %02d" , jam , menit , detik);
    }
}