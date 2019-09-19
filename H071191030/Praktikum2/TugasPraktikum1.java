import java.util.Scanner;

public class TugasPraktikum1 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        int x = ka.nextInt();
        int y = ka.nextInt();
        ka.close();

        if (x < 0 && y > 0) {
            if (x + y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 1", x, y);
            } else if (x + y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 2", x, y);
            } else {
                System.out.println("Terletak pada garis -x = y");
            }
        } else if (x > 0 && y > 0) {
            if (x - y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 3", x, y);
            } else if (x - y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 4", x, y);
            } else {
                System.out.println("Terletak pada garis x = y");
            }
        } else if (x > 0 && y < 0) {
            if (x + y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 5", x, y);
            } else if (x + y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 6", x, y);
            } else {
                System.out.println("Terletak pada garis x = -y");
            }
        } else if (x < 0 && y < 0) {
            if (x - y > 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 7", x, y);
            } else if (x - y < 0) {
                System.out.printf("Titik (%d,%d) terletak pada kuadran 8", x, y);
            } else {
                System.out.println("Terletak pada garis -x = -y");
            }
        } else if (x == 0 || y == 0) {
            System.out.printf("Titik %d,%d berada pada garis", x, y);
        } else {
            System.out.println("Titik terletak di Pusat (0,0)");
        }
    }

}