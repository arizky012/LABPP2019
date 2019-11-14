
import java.util.HashMap;
import java.util.Scanner;

//Tugas Praktikum kls A No.2
public class MorseCode {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        String n = ka.nextLine();
        String space[] = n.split("\\s");

        HashMap<String, Character> code = new HashMap<String, Character>();
        code.put(".-", 'A');
        code.put("-...", 'B');
        code.put("-.-.", 'C');
        code.put("-..", 'D');
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
        code.put(".----", '1');
        code.put("..---", '2');
        code.put("...--", '3');
        code.put("....--", '4');
        code.put(".....", '5');
        code.put("-....", '6');
        code.put("--...", '7');
        code.put("---..", '8');
        code.put("----.", '9');
        code.put("-----", '0');

        for (String value : space) {
            code.get(value);
            System.out.print(code.get(value));
        }

        ka.close();

    }
}