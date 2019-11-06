import java.util.Scanner;

// Tugas Praktikum kls A No.2
public class PalCheck {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);

            int n = ka.nextInt();
            String word[] = new String[n];
            int count = 0;

            String reverse = "";
            int i = 0;

            for (i = 0; i < word.length; i++) {
                word[i] = ka.next();
            }

            for (i = 0; i < n; i++) {
                String convert = (word[i]);
                for (int j = convert.length() - 1; j >= 0; j--) {
                    reverse += convert.charAt(j);
                }
                if (convert.equals(reverse)) {
                    count++;
                }
                reverse = "";
            }
            System.out.println(count);
            ka.close();

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}
