import java.util.Scanner;
public class Latihan4 {
public static void main(String[] args) {
    Scanner ka = new Scanner(System.in);
    int nominal = ka.nextInt();
    ka.close();
    // a = Rp.100.000
    // b = Rp. 50.000
    // c = Rp. 20.000
    // d = Rp. 10.000
    // e = Rp. 5.000
    // f = Rp. 2.000
    // g = Rp. 1.000

    int a, sisaA, b, sisaB, c, sisaC, d, sisaD, e, sisaE, f, sisaF, g;
    a = nominal/100000;
    sisaA = nominal%100000;

    b = sisaA/50000;
    sisaB = sisaA%50000;

    c = sisaB/20000;
    sisaC = sisaB%20000;

    d = sisaC/10000;
    sisaD = sisaC%10000;

    e = sisaD/5000;
    sisaE = sisaD%5000;

    f = sisaE/2000;
    sisaF = sisaE%2000;

    g = sisaF/1000;

    System.out.println("Jumlah uang Rp.100.000 = " + a);
    System.out.println("Jumlah uang Rp.50.000 = " + b);
    System.out.println("Jumlah uang Rp.20.000 = " + c);
    System.out.println("Jumlah uang Rp.10.000 = " + d);
    System.out.println("Jumlah uang Rp.5.000 = " + e);
    System.out.println("Jumlah uang Rp.2.000 = " + f);
    System.out.println("Jumlah uang Rp.1.000 = " + g);
}
    
}