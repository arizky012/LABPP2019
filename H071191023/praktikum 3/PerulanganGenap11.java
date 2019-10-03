import java.util.Scanner;
class PerulanganGenap11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int fq = x;
            if (x>y) {
                x=y;
                y=fq;
            }
            in.close();
            for (int i = x; i <= y; i++) {
                if ( i < 0 ) {
                    if ( i % 2 != 1) {
                        System.out.printf("%d ganjil negatif\n", i);
                    } else {
                        System.out.printf("%d genap negatif\n", i);
                    }
                } else if ( i > 0) {
                    if ( i % 2 != 1) {
                        System.out.printf("%d ganjil positif\n", i);
                    } else {
                    System.out.printf("%d genap positif\n", i);
                    }
                } else {
                    System.out.printf("%d nol\n", i);
                }
            }   
        }catch (Exception e) {
            //TODO: handle exception
            //tidak pada inputannyaso
            System.out.println("inputan tidak valid ");
        }
    }
    }