
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeFile {

    public static void main(String[] args) {

        Scanner ka = new Scanner(System.in);
        FileReader file1 = null;
        FileReader file2 = null;
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        FileWriter writer = null;
        PrintWriter pWriter = null;

        try {

            System.out.println("Masukkan file input 1:");
            file1 = new FileReader(String.format("%s.txt", ka.next())); // File1
            System.out.println("Masukkan file input 2:");
            file2 = new FileReader(String.format("%s.txt", ka.next())); // File2
            reader1 = new BufferedReader(file1);
            reader2 = new BufferedReader(file2);
            System.out.println("Masukkan file output:");
            writer = new FileWriter(String.format("%s.txt", ka.next()));
            pWriter = new PrintWriter(writer);

            ka.close();

            String s1, s2;

            while ((s1 = reader1.readLine()) != null && (s2 = reader2.readLine()) != null) {
                String out = s1 + " " + s2;
                pWriter.println(out);

            }

        } catch (Exception e) {
            System.out.println("Gagal");
        } finally {
            try {

                if (file1 != null) {
                    file1.close();
                }
                if (file2 != null) {
                    file2.close();
                }
                if (reader1 != null) {
                    reader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
                if (writer != null) {
                    writer.close();
                }
                if (pWriter != null) {
                    pWriter.close();
                    System.out.println("Berhasil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}