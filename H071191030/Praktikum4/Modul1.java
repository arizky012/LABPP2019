import java.util.Scanner;

public class Modul1 {

    public static void main(String[] args) {
        try {
            Scanner ka = new Scanner(System.in);
            int n = ka.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = ka.nextInt();

            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] % array[j] != 0 && array[j] % array[i] != 0) {
                        System.out.print(array[i] + " " + array[j]);
                        System.out.println();
                    }

                }

            }
            ka.close();

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}