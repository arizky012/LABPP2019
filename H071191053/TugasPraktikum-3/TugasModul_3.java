import java.util.Scanner;

public class TugasModul_3 {
    public static void main (String[] args){
        Scanner publicVoidMain = new Scanner (System.in);

        try {
        int bilanganAwal = publicVoidMain.nextInt();
        int bilanganAkhir = publicVoidMain.nextInt();
        publicVoidMain.close();

        int genap,ganjil,positif,negatif;
        if (bilanganAwal < bilanganAkhir){
        for(int i = bilanganAwal; i <= bilanganAkhir;i++){
            genap = i%2 == 0 ? 1 : 0;
            ganjil = i%2 != 0 ? 1 : 0;
            positif = i > 0 ? 1 : 0;
            negatif = i < 0 ? 1 : 0;
            if (genap > 0 && positif > 0){
             System.out.println(i + " bilanngan genap positif" );
            } else if (genap > 0 && negatif > 0){
                System.out.println(i + " bilangan genap negatif");
            } else if (ganjil > 0 && positif > 0){
                System.out.println(i + " bilangan ganjil positif");
            } else if (ganjil > 0 && negatif > 0){
                System.out.println(i + " bilangan ganjil negatif");
            } else {
                System.out.println(i + " nol");
            }
        }
     } else{
        for(int i = bilanganAkhir; i <= bilanganAwal;i++){
            genap = i%2 == 0 ? 1 : 0;
            ganjil = i%2 != 0 ? 1 : 0;
            positif = i > 0 ? 1 : 0;
            negatif = i < 0 ? 1 : 0;
            if (genap > 0 && positif > 0){
             System.out.println(i + " bilanngan genap positif" );
            } else if (genap > 0 && negatif > 0){
                System.out.println(i + " bilangan genap negatif");
            } else if (ganjil > 0 && positif > 0){
                System.out.println(i + " bilangan ganjil positif");
            } else if (ganjil > 0 && negatif > 0){
                System.out.println(i + " bilangan ganjil negatif");
            } else {
                System.out.println(i + " nol");
            }
        }
     }
    } catch (Exception e){
        System.out.println("Inputan Tidak Valid");
    }

    }
}