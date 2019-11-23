import java.util.Scanner;

public class TugasLatihan_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numberOfInput = sc.nextInt();
            String word[] = new String[numberOfInput];
            for (int i = 0; i < word.length; i++) {
                word[i] = sc.next();
            }
            sc.close();
            System.out.println(palindromeCheck(word));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static int palindromeCheck(String s[]) {
        // buat variabel kosong untuk menyimpan kata yang mau di cek
        String change = "";
        String check = "";

        // variabel untuk mejumlahkan kata yang palindrom
        int valuePalindrom = 0;
        for (int i = 0; i < s.length; i++) {
            // isi variabel simpan pertama
            change = s[i];

            // perulangan untuk membalik kata
            for (int j = change.length() - 1; j >= 0; j--) {

                // isi variabel simpan kedua
                check += change.charAt(j);
            }
            // check apakah kedua data tersebut sama
            if (change.equals(check)) {
                valuePalindrom++;
            }
            check = "";
        }
        return valuePalindrom;
    }
}