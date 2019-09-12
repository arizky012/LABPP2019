import java.util.Scanner;

public class TugasLatihan_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        int b = a / 100000;
        int c = a % 100000;
        int d = c / 50000;
        int e = c % 50000;
        int f = e / 20000;
        int g = e % 20000;
        int h = g / 10000;
        int i = g % 10000;
        int j = i / 5000;
        int k = i % 5000;
        int l = k / 2000;
        int m = k % 2000;
        int n = m / 1000;

        System.out.println("jumlah uang Rp. 100.000 = " + b);
        System.out.println("jumlah uang Rp. 50.000 = " + d);
        System.out.println("jumlah uang Rp. 20.000 = " + f);
        System.out.println("jumlah uang Rp. 10.000 = " + h);
        System.out.println("jumlah uang Rp. 5.000 = " + j);
        System.out.println("jumlah uang Rp. 2.000 = " + l);
        System.out.println("jumlah uang Rp. 1.000 = " + n);





    }
}