import java.util.Scanner;

public class StrMtrx{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String sentence = userInput.nextLine();
        String str = "";
        for(int i=0 ; i<sentence.length() ; i++){
            if(i%2==1){
                str += sentence.codePointAt(i);
            }else{
                str += sentence.charAt(i);
            }
        }

        int length = (int)Math.ceil((str.length()/16)+1);
        int questionMark = length*16 - str.length();
        for(int i=0 ; i< questionMark ; i++){
            str+="?";
        }
        String[] str2 = new String[16];
        for(int i=0, j=0 ; i<str2.length ; i++,j+=length){
            str2[i] = str.substring(j, j+length);

            String str3 = i%4 == 3 ? "\n" : " ";
            System.out.print(str2[i] + str3);
        }
    }
}
