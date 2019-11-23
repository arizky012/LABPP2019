import java.util.Scanner;

public class TugasLatihan_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String newSentence = "";

        // perubahan isi string
        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 0) {
                newSentence += sentence.charAt(i);
            } else {
                newSentence += sentence.codePointAt(i);
            }
        }

        // perhitungan panjang digit
        int length = newSentence.length() % 16 == 0 ? newSentence.length() / 16 : (newSentence.length() / 16) + 1;
        System.out.println(length);

        // konversi string ke charr
        char[] karakter = new char[newSentence.length()];
        for (int i = 0; i < newSentence.length(); i++) {
            karakter[i] = newSentence.charAt(i);
        }


        // pengubahan ke bentuk matriks 4*4
        int b = 0;
        for (int j = 0; j < 16; j++) {

            for (int i = 0; i < length; i++) {
               if (b < karakter.length){
                System.out.print(karakter[b]);
                b++;
               } else {
                   System.out.print("?");
               }
            }
            if(b % 4 == 0 && b != 0){
                System.out.println();
            } else {
            System.out.print(" ");
            }
        }
    }
}