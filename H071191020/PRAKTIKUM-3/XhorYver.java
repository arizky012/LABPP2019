import java.util.InputMismatchException;
import java.util.Scanner;

public class XhorYver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int x1 = x;
            in.close();

            if (y>=0) {
                for (int nilai = 1; nilai <= y ; nilai++) {
                    if (nilai == x1+1) {
                        System.out.print("\n");
                        x1 += x;
                    }   
                    System.out.print(nilai+"\t");
                }
            } else {
                for (int nilai = y; nilai <= -1 ; nilai++) {
                    if (nilai == y+x)  {
                        System.out.print("\n");
                        y += x;
                    }   
                    System.out.print(nilai+"\t");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        } 
    }
}