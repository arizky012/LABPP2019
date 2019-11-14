import java.util.*;

public class CekPalindrom {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = inp.next();
        }
        inp.close();
        System.out.println(palindromcheck(input));
    }

    static int palindromcheck(String[] input){
        int n = input.length;
        String palindrom = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            char[] word = input[i].toCharArray();
            for (int j = word.length-1; j >= 0; j--) {
                palindrom += word[j]; 
            }
            if(input[i].equals(palindrom)){
                count++;
            }
            palindrom = "";
        }
        if(count == 0){
            System.out.println("tidak ada palindrom");
        }
        return count;
    }
}