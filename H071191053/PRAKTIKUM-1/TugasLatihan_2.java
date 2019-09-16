import java.util.Scanner;

public class TugasLatihan_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int b,a;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        boolean c = a % b == 0 || b % a == 0;

        System.out.println("apakah " + a + " kelipatan dari " + b + " ? " + c);
        System.out.printf("apakah %d kelipatan dari %d ? %b",a,b,( a % b == 0 || b % a == 0));
    }
}