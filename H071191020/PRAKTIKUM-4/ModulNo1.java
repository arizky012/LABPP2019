import java.util.InputMismatchException;
import java.util.Scanner ; 

class ModulNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();

            //Input nilai array
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr [i] = in.nextInt();
            }

            //Masukkan array dalam bentu a,b
            for (int i = 0; i < n; i++) {
                for (int j = (i+1); j < n; j++) {
                    int a = arr[i];
                    int b = arr[j];
                    //Relatif prima terjadi jika FPB (a,b) = 1
                    int fpb = 0;
                    for (int k = 1; k <= Math.min(a,b); k++) {
                        if(a%k == 0 && b%k == 0) {
                            fpb += k;
                        }
                    }
                    if (fpb==1) {
                        System.out.println(a+" "+b);
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan anda salah");
        }   
    }
}