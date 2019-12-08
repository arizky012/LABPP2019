import java.util.*;

public class MorseCode{
    public static void main(String[] args){
        HashMap<String, Character> keys = new HashMap<>();  //Deklarasi hashmap

        keys.put(".-",      'A');                           //Menambah nilai hashmap
        keys.put("-...",    'B');
        keys.put("-.-.",    'C');
        keys.put("-..",     'D');
        keys.put(".",       'E');
        keys.put("..-.",    'F');
        keys.put("--.",     'G');
        keys.put("....",    'H');
        keys.put("..",      'I');
        keys.put(".---",    'J');
        keys.put("-.-",     'K');
        keys.put(".-..",    'L');
        keys.put("--",      'M');
        keys.put("-.",      'N');
        keys.put("---",     'O');
        keys.put(".--.",    'P');
        keys.put("--.-",    'Q');
        keys.put(".-.",     'R');
        keys.put("...",     'S');
        keys.put("-",       'T');
        keys.put("..-",     'U');
        keys.put("...-",    'V');
        keys.put(".--",     'W');
        keys.put("-..-",    'X');
        keys.put("-.--",    'Y');
        keys.put("--..",    'Z');
        keys.put(".----",   '1');
        keys.put("..---",   '2');
        keys.put("...--",   '3');
        keys.put("....-",   '4');
        keys.put(".....",   '5');
        keys.put("-....",   '6');
        keys.put("--...",   '7');
        keys.put("---..",   '8');
        keys.put("----.",   '9');
        keys.put("-----",   '0');

        System.out.println("\nPlease input your Morse Code");
        System.out.print("> ");

        Scanner userInput = new Scanner(System.in);         //Buat Scanner -_-
        String input = userInput.nextLine();
        String[] str = input.split("\\s+");                 //Memasukkan inputan string ke dalam array lalu spasi dihilangkan

        System.out.println();
        System.out.println("Your Morse Code Answer");
        System.out.print("> ");
        System.out.println();
        for(String str_2 : str){
            System.out.print(keys.get(str_2));
        }
    }
}
