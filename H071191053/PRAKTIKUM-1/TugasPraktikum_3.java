import java.util.Scanner ;

public class TugasPraktikum_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // double sudut = (Math.tan(Math.toRadians(a) )) * h;

        // double sudut2 = (Math.tan(Math.toRadians(b) )) * h;
      
        double panjangKapal = ((Math.tan(Math.toRadians(a) )) * h) - ((Math.tan(Math.toRadians(b) )) * h);

        System.out.printf("%.2f ", panjangKapal);

    }
}