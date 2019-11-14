import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Modul No. 1
public class CopyFile {

    public static void main(String[] args) {

        Scanner ka = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            System.out.println("Masukkan source file: ");       
            in = new FileInputStream(String.format("%s.txt", ka.next())); //Latihan
            System.out.println("Masukkan output file");       
            out = new FileOutputStream(String.format("%s.txt", ka.next())); //Latihan-1
            ka.close();
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);

            }

        } catch (IOException e) {
            System.out.println("Gagal");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                    System.out.println("Berhasil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}