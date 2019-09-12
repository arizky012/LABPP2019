import java.util.Scanner ;

public class Tugas3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();
        
        double sudut = (Math.tan(Math.toRadians(a) )) ;
        double alas = sudut * h ;

        double sudut2 = (Math.tan(Math.toRadians(b) )) ;
        double alas2 = sudut2 * h;
      
        double panjangKapal = alas2 - alas ;

        System.out.printf("%.2f meter ", panjangKapal);

    }
}