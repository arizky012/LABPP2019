import java.util.Scanner;

class ModulNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        unix(str);
        in.close();
    }
    public static String unix (String x) {
        String upStr = x.toUpperCase();
        String noSpas = upStr.replaceAll(" ", "");
        int leng = noSpas.length();
        int m = x.length();
        int n = m*m;
        String hex = String.format("%x", n);
        char hex1 = hex.charAt(0);
        String subStr = noSpas.substring(0, (leng/2));
        int pSubStr = subStr.length();
        String oct = String.format("%o", m);
        String palindrom = "";
        char symbol = hex1 >= 'A' && hex1 <= 'z' ? '?' : '!';
        for (int i = (pSubStr-2) ; i >= 0; i--) {
            palindrom += subStr.charAt(i);
        }
        System.out.println("#"+hex+subStr+palindrom+oct+symbol);

        return x;
    }
}