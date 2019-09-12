import java.util.Scanner;
class TugasPraktikum3{
    public static void main(String[] args) {
        // h = ketinggian menara
        // a = sudut elevasi menara terhadap ujung kapal
        // b = sudut elevasi menara terhadap ujung belakang kapal

        Scanner ka = new Scanner(System.in);
        double h = ka.nextDouble();
        double a = ka.nextDouble();
        double b = ka.nextDouble();
        ka.close();

        double sudut = Math.tan(Math.toRadians(a))*h;
        double sudut2 = Math.tan(Math.toRadians(b))*h;
        double panjang = sudut-sudut2;

        System.out.printf("Panjang kapal = %.2f m", panjang);
    }
}