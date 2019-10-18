import java.util.*;

public class MenghitungFPB{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int a = inp.nextInt();
            int b = inp.nextInt();
            inp.close();
            int fpb = findFPB(a, b);
            System.out.printf("FPB dari %d dan %d = %d",a,b,fpb);
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
    }
    public static int findFPB(int x, int y) {
        int fpbx = 1;
        int fpb = 0;
        int a = x;
        int b = y;
        if(a < 0){
            a *= (-1);
        }
        if(b < 0){
            b *= (-1);
        }
        while(fpbx <= a && fpbx <= b){
            if(a % fpbx == 0 && b % fpbx == 0){
                fpb = fpbx;
            }
            fpbx++;
        }
        return fpb;
    }
}