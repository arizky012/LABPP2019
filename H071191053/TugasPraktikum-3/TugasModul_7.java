import java.util.Scanner;

public class TugasModul_7{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);

        try {
        float angle  = sc.nextFloat();
        sc.close();
        int detik = Math.round((angle/360) * (24 * 3600));
        int menit = 0,jam = 0;
        int x = 0,y = 0;

        for (x = detik; x >= 3600; x -= 3600){
            jam ++;
        }
        for (y = x ; y>=60;  y-=60){
            menit ++;
        }
        jam = (jam + 6) % 24;
        System.out.printf("%02d : %02d : %02d",jam,menit,y);
    } catch(Exception e){
        System.out.println("Inputan Tidak Valid");
    }
        
    }
}