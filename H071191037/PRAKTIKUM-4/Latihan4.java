import java.util.*;

class Latihan4{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("masukkan panjang array");
            int a = inp.nextInt();
            int n[] = new int[a];
            int cek = 0;
            boolean find = false;

            for(int i = 0; i < a; i++){
                n[i] = inp.nextInt();
            }
            for(int j = 0; j < a; j++){
                cek = n[j];
                for(int k = j + 1; k < a; k++){
                    if(cek == n[k]){
                        System.out.printf("Terdapat angka yang sama yaitu %d yang terletak di indeks %d,%d",n[j],j,k);
                        find = true;       
                        System.out.println();
                    }
                }
            }
            if(!find){
                System.out.println("Tidak ada nilai yang sama");
            }
            inp.close();
        } catch (Exception e) {
            System.out.println("inputan Tidak valid");
        }
    }
}