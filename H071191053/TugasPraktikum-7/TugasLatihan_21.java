import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class TugasLatihan_21 {
    public static void main(String[] args) {
        //Scanner untuk memasukkan kode morsenya 
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        //buat array dari String untuk memnyimpan nilai-nilai dari code yang diinput
        //gunakan fungsi untuk memisah String array nya setiap spasi
        String[] codeMorse = code.split(" ");

        morseTranslator(codeMorse);
    }

    //fungsi untuk mengtranslate kode morse
    static void morseTranslator (String[] s){
        //deklarasikan hashmap sebagai penyimpan value code nya
        HashMap<String,Character> passwords = new HashMap<>();
        //deklarasikan array list sebagai penyimpan kode yang menjadi key untuk hashmap nya
        ArrayList<String> word = new ArrayList<>();

        // ubah array string menjadi arraylist
        for (String a : s) {
            word.add(a);
        }

        //input semua key dan translate dari key nya
        passwords.put(".-" ,'A');passwords.put("-..." ,'B');passwords.put("-.-." ,'C');passwords.put("-.." ,'D');passwords.put("." ,'E');
        passwords.put("..-." ,'F');passwords.put("--." ,'G');passwords.put("...." ,'H');passwords.put(".." ,'I');passwords.put(".---" ,'J');
        passwords.put("-.-" ,'K');passwords.put(".-.." ,'L');passwords.put("--" ,'M');passwords.put("-." ,'N');passwords.put("---" ,'O');
        passwords.put(".--." ,'P');passwords.put("--.-" ,'Q');passwords.put(".-." ,'R');passwords.put("..." ,'S');passwords.put("-" ,'T');
        passwords.put("..-" ,'U');passwords.put("...-" ,'V');passwords.put(".--" ,'W');passwords.put("-..-" ,'X');passwords.put("-.--" ,'Y');
        passwords.put("--.." ,'Z');passwords.put(".----" ,'1');passwords.put("..---" ,'2');passwords.put("...--" ,'3');passwords.put("....-" ,'4');
        passwords.put("....." ,'5');passwords.put("-...." ,'6');passwords.put("--..." ,'7');passwords.put("---.." ,'8');passwords.put("----." ,'9');
        passwords.put("-----" ,'0'); 

        //print key nya
        for (int i = 0; i < word.size(); i++) {
            System.out.print(passwords.get(word.get(i)));
        }
    }
}