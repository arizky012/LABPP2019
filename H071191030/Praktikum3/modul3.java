import java.math.BigInteger;
import java.util.Scanner;
class modul3{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {
         
        int n = ka.nextInt();
        BigInteger f1 = BigInteger.valueOf(0);
        BigInteger f2 = BigInteger.valueOf(1);
        ka.close();
       
        System.out.print(f1 + " ");

        for (int h = 0; h<(n-1); h++){
            BigInteger fibo = f1.add(f2);
            System.out.print(fibo + " ");
            f2 = f1;
            f1 = fibo;
        }

   

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }

    }
}