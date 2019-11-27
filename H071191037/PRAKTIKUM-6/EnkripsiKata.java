import java.util.*;

public class EnkripsiKata{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine().toUpperCase();
        inp.close();
        enkripsiKata(input);
    }

    static void enkripsiKata(String a){
        String word = kelompok2(a) + kelompok1(a);
        System.out.println(word);
    }

    static String kelompok1 (String word){
        int n ;
        if(word.length() %2 == 0){
            n = word.length() / 2;
        } else {
            n = word.length() / 2 + 1;
        }
        String cut = word.substring(0, n);
        String newWord = "";
        for (int i = 0; i < cut.length(); i++) {
            char wordx = cut.charAt(i);
            int ascii = (int) wordx;
            if (ascii > 124) {
                int newascii = 0 + (127 - ascii);
                newWord += (char) newascii;
            } else {
                int newascii = ascii + 3;
                newWord += (char) newascii;
            }
        }
        return newWord;
    }

    static String kelompok2(String word) {
        int n ;
        if(word.length() %2 == 0){
            n = word.length() / 2;
        } else {
            n = word.length() / 2 + 1;
        }

        String cut = word.substring(n, word.length());
        String newWord = "";
        for (int i = cut.length() - 1; i >= 0; i--) {
            newWord += cut.charAt(i);
        }
        return newWord;
    }
}