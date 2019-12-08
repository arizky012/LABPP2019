import java.util.Scanner;

public class UniqueCode{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String sentence = userInput.nextLine();

        //Membuat palindrom
        String sentence2 = sentence.replace(" ", "").substring(0, (sentence.length()-1)/2).toUpperCase();
        char[] manipulation = sentence2.toCharArray();
        String str = "";
        for(int i=0 ; i<sentence2.length()-1 ; i++){
            str = manipulation[i] + str;
        }
        String palindrom = sentence2 + str;

        //Casting desimal ke hexadecimal
        int hex = sentence.length()*sentence.length();
        String sumHex = String.format("%x", hex);

        //Casting desimal ke oktal
        int oct = sentence.length();
        String sumOct = String.format("%o", oct);

        //simbol
        int x = (int)sumHex.charAt(0);
        System.out.printf("#%s%s%s%s",sumHex,palindrom,sumOct,x>=97&&x<=122 ? "?":"!");
    }
}
