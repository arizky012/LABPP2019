import java.util.Scanner;

public class TugasLatihan_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int baris = sc.nextInt();
            printPyramid(baris);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //fungsi untuk mencetak pyramid bintang nya
    static void printPyramid (int a){
        // perulangan pertama untuk mencetak banyk baris dari pyramid nya 
        for (int i = 0; i < a; i++) {
            // perulangan untuk mencetak spasi sebelum bintang nya 
            for (int j = a-i-1; j >=0 ; j--) {
                System.out.print(" ");
            }
            // perulangan untuk mencetak bintang nya
            for (int j = 0; j < ((i*2)+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}