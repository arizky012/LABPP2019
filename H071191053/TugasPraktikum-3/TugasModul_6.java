import java.util.Scanner;

public class TugasModul_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
        int price = sc.nextInt();
        int cash = sc.nextInt();
        sc.close();

        int cashBack = cash - price;
        
        int oneHundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

        if (cash >= price){
        for (a = cashBack; a >= 100000; a -= 100000){
            oneHundred++;
        }

        for (b = a; b >= 50000; b -= 50000){
            fifty++;
        }

        for (c = b; c >= 20000; c -= 20000){
            twenty++;
        }

        for (d = c; d >= 10000; d -= 10000){
            ten++;
        }

        for (e = d; e >= 5000; e -= 5000){
            five++;
        }

        for (f = e; f >= 2000; f -= 2000){
            two++;
        }

        for (g = f; g >= 1000; g -= 1000){
            one++;
        }

        System.out.printf("%d Uang Rp. 100.000\n%d Uang Rp. 50.000\n%d Uang Rp. 20.000\n%d Uang Rp. 10.000\n%d Uang Rp. 5.000\n%d Uang Rp. 2.000\n%d Uang Rp. 1.000\n",oneHundred,fifty,twenty,ten,five,two,one);
      } else {
          System.out.println("Uang anda tidak cukup");
      }
    } catch (Exception e){
        System.out.println("Inputan Tidak Valid");
    }
    }
}