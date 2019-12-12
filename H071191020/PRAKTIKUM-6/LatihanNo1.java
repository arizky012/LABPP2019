import java.util.Scanner;

class LatihanNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        randNum(str);

    }
    public static String randNum (String x) {
        int leng = x.length();
        String half1 = "";
        if (leng%2 == 0) {
            half1 = x.substring(0, (leng/2));
        } else {
            half1 = x.substring(0, ((leng+1)/2));
        }
        String half2 = "";
        if (leng%2 == 0) {
            half2 = x.substring((leng/2), (leng));
        } else {
            half2 = x.substring((((leng+1)/2)) , (leng));
        }
        String klm1 = "";
        for (int i = half2.length()-1; i >= 0; i--) {
            klm1 += half2.charAt(i);
        }
        String klm2 = new String();
        for (int i = 0 ; i < half1.length(); i++) {
            klm2 += (char)(half1.charAt(i) + 3);
        }
        String hasil = klm1+klm2;
        String out = hasil.toUpperCase();
        System.out.println(out);

        return x;
    }
}