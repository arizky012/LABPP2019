import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
class SerialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n----- Random Serial Number -----\n");
            System.out.print("Input n : ");
            int n = input.nextInt();
            System.out.print("Input m : ");
            int m = input.nextInt();
            n = Math.abs(n);
            m = Math.abs(m);
            System.out.println("\n--------------------------------\n");
            System.out.println("Serial Number :");
            generateSerial(n, m);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("\nError!");
        }finally {
            input.close();
        }
    }

    public static void generateSerial (int a, int b) {
        Random rd = new Random();
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int ap = rd.nextInt(9);
                System.out.print(ap);
            }
            System.out.print(i < a-1 ? "-":"");
        }
    }
}