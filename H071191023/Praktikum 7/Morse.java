import java.util.Scanner;
import java.util.HashMap;

class Morse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        String morse = sc.nextLine();

        HashMap<String, Character> code = new HashMap<>();

        String[] so = morse.split("\\s");//memisahkan spasi
        code.put(".-", 'A');//memasukkan nilai kedalam hash map menggunakan put(key.value)
        code.put("-...", 'B');
        code.put("-.-.", 'C');
        code.put("-,.", 'D');
        code.put(".", 'E');
        code.put("..-.", 'F');
        code.put("--.", 'G');
        code.put("....", 'H');
        code.put("..", 'I');
        code.put(".---", 'J');
        code.put("-.-", 'K');
        code.put(".-..", 'L');
        code.put("--", 'M');
        code.put("-.", 'N');
        code.put("---", 'O');
        code.put(".--.", 'P');
        code.put("--.-", 'Q');
        code.put(".-.", 'R');
        code.put("...", 'S');
        code.put("-", 'T');
        code.put("..-", 'U');
        code.put("...-", 'V');
        code.put(".--", 'W');
        code.put("-..-", 'X');
        code.put("-.--", 'Y');
        code.put("--..", 'Z');
        for (String tes : so) {//tes i so = code nya
            code.get(tes);// tes nya di ambil dari  print kode morse sedangakn code.get dgunakan dari hash map
            System.out.print(code.get(tes));

        }
    }catch (Exception E){
        System.out.println("inputan tdk valid");
    }
    }
}