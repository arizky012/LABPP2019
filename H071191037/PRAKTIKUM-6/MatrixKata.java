import java.util.Scanner;

public class MatrixKata{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        inp.close();
        String str = "";
        for(int i=0 ; i<word.length() ; i++){
            if(i%2==1){
                str += word.codePointAt(i);
            }else{
                str += word.charAt(i);
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
