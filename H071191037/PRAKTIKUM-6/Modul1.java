import java.util.*;

public class Modul1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        inp.close();
        int lWord = word.length();
        word = word.replaceAll(" ", "").toUpperCase().substring(0,(word.length()-1)/2);
        char[] wordx = word.toCharArray();

        String palindrom = "";
        for (int i = wordx.length-2 ; i >= 0; i--) {
            palindrom += wordx[i];
        }
        int hexa = lWord*lWord;
        int octal = lWord;
        String cekHexa = String.format("%x",hexa);
        
        char simbol = cekHexa.charAt(0) >= 'A' && cekHexa.charAt(0) <= 'z' ? '?' : '!';

        System.out.printf("#%x%s%o%s",hexa,word + palindrom,octal,simbol);
    }
}