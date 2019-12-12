import java.util.*;

public class P7_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        HashMap<String,Character> morse = new HashMap<>();
        String [] space = input.split("\\s+");

        morse.put(".-", 'A');
        morse.put("-...", 'B');
        morse.put("-.-.",'C');
        morse.put("-..",'D');
        morse.put(".",'E');
        morse.put(".._.",'F');
        morse.put("--.",'G');
        morse.put("....",'H');
        morse.put("..",'I');
        morse.put(".---",'J');
        morse.put("-.-",'K');
        morse.put(".-..",'L');
        morse.put("--",'M');
        morse.put("-.",'N');
        morse.put("---",'O');
        morse.put(".--.",'P');
        morse.put("--.-",'Q');
        morse.put(".-.",'R');
        morse.put("...",'S');
        morse.put("-",'T');
        morse.put("..-",'U');
        morse.put("...-",'V');
        morse.put(".--",'W');
        morse.put("-..-", 'X');
        morse.put("-.--",'Y');
        morse.put("--..",'Z');

        for (String result: space){
            System.out.print(morse.get(result));
        }  
    }
}