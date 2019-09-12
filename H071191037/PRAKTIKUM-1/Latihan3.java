import java.util.Scanner;
class Latihan3{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();

        boolean c  = (a % b == 0 && b % a == 0);
        
        System.out.printf("apakah %d kelipatan dari %d? %b",a,b,c);
    }
}