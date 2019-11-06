import java.util.Scanner;
// Tugas Praktikum kls A Nomor 1

public class RandomCode {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);

            String words = ka.nextLine();
            int oddEven = words.length() % 2;
            int middle = words.length() / 2;

            String part1 = "";
            String part2 = "";

            if (oddEven == 1) {

                String[] parts = { words.substring(0, middle + 1), words.substring(middle + 1) };
                part1 = parts[0];
                part2 = parts[1];

            } else if (oddEven == 0) {

                String[] parts = { words.substring(0, middle), words.substring(middle) };
                part1 = parts[0];
                part2 = parts[1];
            }

            // Kelompok kedua
            String reverse = "";
            for (int i = part2.length() - 1; i >= 0; i--) {
                reverse += part2.charAt(i);
            }

            // Kelompok pertama
            String replace = "";
            for (int i = 0; i < part1.length(); i++) {
                int current = part1.charAt(i);

                if (current + 3 > 126) {
                    current -= 126 + 3;

                    replace += (char) (current);

                } else {
                    replace += (char) (current + 3);
                }

            }
            String answer = (reverse + replace);
            System.out.println(answer.toUpperCase());
            ka.close();

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}