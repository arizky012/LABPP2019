import java.util.InputMismatchException;
import java.util.Scanner ;
class FPB {
    public static int cariFPB(int x, int y) {
        return (y == 0) ? x : cariFPB(y, x % y);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n------- MENCARI FPB -------\n");
        try {
            System.out.print("Input bilangan pertama : ");
            int x, y, hasil;
            x = input.nextInt();
            System.out.print("Input bilangan ke-2    : ");
            y = input.nextInt();
            if (x == 0 || y == 0) {
                hasil = 0;
                
            }else {
                hasil = cariFPB(x, y);
            }
            System.out.println("\n---------------------------");

            System.out.println("\nFPB dari "+Integer.toString(x) +" dan "+Integer.toString(y)+"     = "+Integer.toString(hasil));    
        } catch (InputMismatchException e) {
            System.out.println("\n---------------------------");
            System.out.println("\nError!");
        }finally {
            input.close();
        }
    }
}