import java.util.Scanner;
class Latihan4{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("masukkan jumlah uang");
        int uang = inp.nextInt();
        int sisa,sisa2,sisa3,sisa4,sisa5,sisa6;

        int $100rb = uang / 100000;
        sisa = uang - ($100rb * 100000);
        int $50rb = sisa / 50000;
        sisa2 = sisa - ($50rb * 50000);
        int $20rb = sisa2 / 20000;
        sisa3 = sisa2 - ($20rb * 20000);
        int $10rb = sisa3 / 10000;
        sisa4 = sisa3 - ($10rb * 10000);
        int $5rb = sisa4 / 5000;
        sisa5 = sisa4 - ($5rb * 5000);
        int $2rb = sisa5 / 2000;
        sisa6 = sisa5 - ($2rb * 2000);
        int $1rb = sisa6 / 1000;
        
        System.out.println("jumlah uang Rp.100.000 = " + $100rb);
        System.out.println("jumlah uang Rp.50.000 = " + $50rb);
        System.out.println("jumlah uang Rp.20.000 = " + $20rb);
        System.out.println("jumlah uang Rp.10.000 = " + $10rb);
        System.out.println("jumlah uang Rp.5.000 = " + $5rb);
        System.out.println("jumlah uang Rp.2.000 = " + $2rb);
        System.out.println("jumlah uang Rp.1.000 = " + $1rb);
    }
}