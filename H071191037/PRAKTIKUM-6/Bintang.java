import java.util.*;

class Bintang {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            inp.close();
            int m = n;
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m+2 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < ((i*2)+1); j++) {
                    System.out.print("*");
                }
                m--;
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
    }
}
