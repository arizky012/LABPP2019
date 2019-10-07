import java.math.BigInteger;
import java.util.Scanner ;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suku = in.nextInt();
        BigInteger n = BigInteger.valueOf(0);
        BigInteger m = BigInteger.valueOf(1);
        BigInteger fibo = BigInteger.valueOf(0);
        in.close();

        for (int i = 1; i <= suku; i++) {
            System.out.printf("%d ",n );
            fibo = m.add(n);
            n = m;
            m = fibo;
        }
    }
}