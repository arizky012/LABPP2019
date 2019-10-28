import java.util.Scanner;

public class TugasLatihan_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int length = sc.nextInt();
            int[] arr = new int[length];
            boolean truth = false;
            int sameValue = 0;
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0, x = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            for (int j = 0, x = 0, n = length - 1; j < 2 * length; j++) {
                x = 0;
                x = j + 1;
                for (int i = 0; i < n; i++) {
                    if (arr[j] == arr[x]) {
                        truth = true;
                        sameValue = arr[j];
                        sum1 = j;
                        sum2 = x;
                    }
                    x++;
                }
                n--;
            }

            System.out.println(truth);

            if (truth == true) {
                System.out.println(
                        "Bilangan yang sama adalah " + sameValue + " pada indeks ke " + sum2 + " dan ke " + sum1);
            } else {
                System.out.println("tak ada bilangan yang sama");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}