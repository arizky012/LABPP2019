import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input nilai n --> ");
            int a = 0, b = 1, hasil = 0;
            int c = input.nextInt();
            System.out.print("Deret Fibbonancinya = ");
            if (c <= 0) {
                System.out.println("Inputan harus positif!");
            }
            for (int i = 1; i <= c; i++) {
                a = b;
                b = hasil;
                System.out.print(hasil+" ");
                hasil = a + b;
            }    
        } catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally {
            input.close();
        }
    }
}