import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);
            int panjang = ka.nextInt();
            int[] arr = new int[panjang];
            int cek = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = ka.nextInt();
            }

            for (int j = 0; j < panjang; j++) {
                for (int i = j + 1; i < panjang; i++) {
                    if (arr[j] == arr[i]) {
                        System.out.printf("Terdapat angka yang sama yaitu %d yang terletak di index %d,%d", arr[j], j,
                                i);
                        System.out.println();
                        cek++;
                    }
                }

            }
            ka.close();
            if (cek == 0) {
                System.out.println("Tidak ada bilangan yang sama");
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

}
