import java.util.Scanner;

public class TugasModul_4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        try {
        int kolom = input.nextInt();
        int batas = input.nextInt();
        input.close();
        int i;

        for ( i = 1; i <= batas; i++){
            System.out.print(i + "\t");
            if (i % kolom == 0){
                System.out.println();
            }

            
        }
    } catch (Exception e){
        System.out.println("Inputan Tidak Valid");
    }
    }
}