import java.util.*;
class Latihan3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("input panjang array 1");
            int a = inp.nextInt();
            int an[] = new int[a];
            int sum = 0;
            for (int i = 0; i < a; i++) {
                // System.out.println("masukkan nilai array 1 index ke" + i);
                an[i] = inp.nextInt();
                sum += an[i];
            }
            System.out.println("input panjang array 2");
            int b = inp.nextInt();
            int bn[] = new int[b];

            for (int i = 0; i < b; i++) {
                // System.out.println("masukkan nilai array 2 index ke"+ i);
                bn[i] = inp.nextInt();
                for (int k = 0; k < an.length ; k++ ) {
                    if(bn[i] == an[k]){
                        bn[i]=0;
                    }
                }
                sum += bn[i];
            }
            inp.close();
            System.out.println(sum);   
        } catch (InputMismatchException e) {
            System.out.println("inputan tidak valid");
        }
        
    }
}