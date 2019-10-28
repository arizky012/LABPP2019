import java.util.Scanner;
import java.util.Random;

public class TugasLatihan_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int length = sc.nextInt();
            int total = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Salah inputan");
        }

        sc.close();
        printHasil(length, total);
    }

    public static void printHasil(int a, int b) {
        Random rd = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(rd.nextInt(9));
            }
            System.out.print((i < a - 1 ? "-" : ""));
        }
    }
}