import java.util.InputMismatchException;
import java.util.Scanner;
class TugasPraktikum4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            int value[] = new int[n];

            for (int i = 0; i < value.length; i++) {
                value[i] = input.nextInt();
            }
            System.out.println();

            // mencari relatif prima
            for (int i = 0, x ; i < value.length; i++) {
                x = 1;
                x += i;
                for (int j = 0; j < n - 1; j++) {
                    if (value[i] % value[x] != 0 && value[x] % value[i] != 0) {
                        System.out.println(value[i] + " " + value[x]);
                    }
                    x++;
                }
                n--;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error!");
        }finally {
            input.close();
        }
    }
}