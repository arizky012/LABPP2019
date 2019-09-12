import java.util.Scanner ;

public class TugasLatihan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int uang = in.nextInt();
        in.close();
        
        int seratusRibu = uang / 100000;
        uang %= 100000;
        int limaPuluhRibu = uang / 50000;
        uang %= 50000;
        int duaPuluhRibu = uang /20000;
        uang %= 20000;
        int sepuluhRibu = uang / 10000;
        uang %= 10000;
        int limaRibu = uang / 5000;
        uang %= 5000;
        int duaRibu = uang / 2000 ;
        uang %= 2000 ;
        int seribu = uang /1000;

        System.out.println("Jumlah uang Rp.100.000 = " +seratusRibu);
        System.out.println("Jumlah uang Rp.50.000  = " +limaPuluhRibu);
        System.out.println("Jumlah uang Rp.20.000  = " +duaPuluhRibu);
        System.out.println("Jumlah uang Rp.10.000  = " +sepuluhRibu);
        System.out.println("Jumlah uang Rp.5.000   = " +limaRibu);
        System.out.println("Jumlah uang Rp.2.000   = " +duaRibu);
        System.out.println("Jumlah uang Rp.1.000   = " +seribu);
    }
}