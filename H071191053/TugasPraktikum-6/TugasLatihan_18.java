import java.util.Scanner;

public class TugasLatihan_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String sntc = sc.nextLine();
            sc.close();
            String newSntc = stringCutter2(sntc) + stringCutter1(sntc);
            System.out.println(newSntc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // fungsi untuk menggeser karakter di kelompok kata pertama
    static String stringCutter1(String s) {
        int value = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;

        // pemotongan string untuk pemotongan kelompok pertama
        String sentence1 = s.substring(0, value);

        // perulangan untuk menggeser nilai setiap karakter
        String wordNow = "";
        for (int i = 0; i < sentence1.length(); i++) {
            char alphabet = sentence1.toUpperCase().charAt(i);
            // pengubahan setiap karakter menjadi int
            // untuk menggeser 3 setiap nilai nya
            int asciiDecimal = (int) alphabet;
            // pengecekan kondisi apabila karakter melewati kode ascii nya
            if (asciiDecimal > 124) {
                int alphabetTransfer = 0 + (127 - asciiDecimal);
                wordNow += (char) alphabetTransfer;

            } else {
                int alphabetTrasfer = asciiDecimal + 3;
                wordNow += (char) alphabetTrasfer;
            }
        }
        return wordNow;
    }

    // fungsi untuk mereverse kelompok kata ke-2
    static String stringCutter2(String s) {
        int value = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        // pemotongan string untuk kelompok ke dua
        String sentence2 = s.substring(value, s.length());

        // perulangan untuk membalik setiap karakter pada kelompok kata ke dua
        String sentence2reverse = "";
        for (int i = sentence2.length() - 1; i >= 0; i--) {
            sentence2reverse += sentence2.toUpperCase().charAt(i);
        }
        return sentence2reverse;
    }
}