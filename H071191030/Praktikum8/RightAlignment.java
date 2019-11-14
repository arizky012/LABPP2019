import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Modul No.2 
public class RightAlignment {

    public static void main(String[] args) {

        Scanner ka = new Scanner(System.in);

        FileReader file = null;
        FileWriter writer = null;
        BufferedReader reader = null;
        PrintWriter pWriter = null;

        try {

            System.out.println("Masukkan source file:");        
            String in = ka.next(); //Latihan
            System.out.println("Masukkan output file:");
            String out = ka.next(); //Latihan-1

            file = new FileReader(String.format("%s.txt", in));
            reader = new BufferedReader(file);
            writer = new FileWriter(String.format("%s.txt", out));
            pWriter = new PrintWriter(writer);

            ka.close();

            String s;
            int max = 0;

            while ((s = reader.readLine()) != null) {
                max = s.length() > max ? s.length() : max;
            }

            file = new FileReader(String.format("%s.txt", in));
            reader = new BufferedReader(file);

            String cek;
            while ((cek = reader.readLine()) != null) {
                pWriter.write(String.format("%" + max + "s\n", cek));
            }

           
        } catch (IOException e) {
            System.out.println("Gagal");
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
                if (writer != null) {
                    writer.close();
                    System.out.println("Berhasil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}