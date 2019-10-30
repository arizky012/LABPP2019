import java.util.Scanner;

public class ModulNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int nilaiFpb = cariFPB(a,b);

        System.out.println("FPB dari " +a+" dan " +b+ " adalah "+ nilaiFpb);
    }
    public static int cariFPB (int a, int b) {
        for (int i = Math.min(a,b); i > 0; i--) {
            if (a%i == 0 && b%i == 0) {
                return i;         
            }
        }
        return 1;
    }
}