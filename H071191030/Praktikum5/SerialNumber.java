import java.util.Scanner;
import java.util.Random;

public class SerialNumber {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String serialNumber = generateSerial(n, m);
            System.out.println(serialNumber);

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    public static String generateSerial(int n, int m) {
        String str = "";
        Random random = new Random();
        int i;

        for (i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int hasil = random.nextInt(10);
                str += hasil;
            }
            if (i < (n - 1)) {
                str += "-";
            }
        }
        return str;
    }

}
