import java.util.Scanner;
//Tugas Praktikum kls A No.3

public class PyramidStars {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);

            int n = ka.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (i * 2) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();

                ka.close();
            }

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}