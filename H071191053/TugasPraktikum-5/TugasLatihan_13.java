import java.util.Scanner;

public class TugasLatihan_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        try {
        int a = sc.nextInt();
        int b = sc.nextInt();
            
        } catch (Exception e) {
            System.out.println("Salah Inputan");
        }

        sc.close();
        System.out.println(FPB(a, b));
    }

    public static int FPB (int a,int b){

        int sum = 0;
        for (int i = 1; i < (a>b ? a:b ); i++) {
            if (a%i == 0 && b%i == 0){
                sum = i;
            }
        }
        return sum;
    }
}