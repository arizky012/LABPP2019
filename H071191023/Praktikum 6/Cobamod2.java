import java.util.Scanner;

class Cobamod2 {
    public static void main(String[] args) {
        Scanner ayo = new Scanner(System.in);
        try {
            String kata = ayo.nextLine();
            char[] aa = kata.toCharArray();
            String apa = "";
            for (int i = 0; i < kata.length(); i++) {
                if (i % 2 == 0) {
                    apa += kata.charAt(i);
                } else {
                    apa += Character.codePointAt(kata, i);
                }
            }

            // math.ceil gunanya untuk memberikan nilai integer yang lebih bsr dari terkecil
            int panjangKata = apa.length();
            // System.out.println(apa.length());
            double jumlah = (double) Math.ceil(panjangKata / 16.0);

            int j = 0;
            for (int i = 0; i < 16; i++) {
                for (int k = 0; k < jumlah; k++) {
                    if (j < panjangKata) {
                        System.out.print(apa.charAt(j++));
                    } else {
                        System.out.print("?");
                    }
                }
                if (i % 4 == 3) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        } catch (Exception e) {
            System.out.println("inputan tdk valid");

        }
    }
}
