import java.util.InputMismatchException;
import java.util.Scanner;
class Latihan2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int h1 = inp.nextInt();
            int m1 = inp.nextInt();
            int h2 = inp.nextInt();
            int m2 = inp.nextInt(),selisih,hasilh,hasilm;
            inp.close();

            if(h1 > h2){
                h2 += 24;
                m1 += (h1 * 60);
                m2 += (h2 * 60);
                selisih = m2 - m1;
                hasilh = selisih / 60;
                hasilm = selisih % 60;
            }
            else{
                m1 += (h1 * 60);
                m2 += (h2 * 60);
                selisih = m2 - m1;
                hasilh = selisih / 60;
                hasilm = selisih % 60;
            }
            System.out.printf("%02d:%02d",hasilh,hasilm);            
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}