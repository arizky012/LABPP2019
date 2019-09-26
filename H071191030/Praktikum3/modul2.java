import java.util.Scanner;
class modul2 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);

        try {

            int x = ka.nextInt();
            int y = ka.nextInt();
            ka.close();

            if (x < y && x > 0) {
                for (int i = 1; i <= y; i++) {
                    System.out.print(i + " ");
                if (i % x == 0) {
                System.out.println();
                }
            }
            } else {
                System.out.println("Inputan tidak valid");
            }

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }

    }
}
