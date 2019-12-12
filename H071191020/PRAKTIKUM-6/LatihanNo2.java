import java.util.Scanner;

public class LatihanNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] wds = new String[n];
        //in.nextLine();
        for (int i = 0; i < n; i++) {
            wds [i] = in.next();
        }
        in.close();
        int sama = 0;
        for (int i = 0; i < n; i++) {
            String x = wds[i];
            String y = "";
            String z = "";
            for (int j = 0; j < x.length(); j++) {
                y = y + x.charAt(j);
            }
            for (int j = (x.length()-1); j >= 0; j--) {
                z = z + x.charAt(j);
            }
            if (y.equals(z)) {
                sama++;
            }
        }
        System.out.println(sama);
    }
}