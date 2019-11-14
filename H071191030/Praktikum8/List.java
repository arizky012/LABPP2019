import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//Modul No.3
public class List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = null;
        PrintWriter pWriter = null;

        try {
            // nama file

            System.out.println("Masukkan file output:");
            writer = new FileWriter(String.format("%s.txt", sc.next()));
            pWriter = new PrintWriter(writer);

            // Jumlah data
            System.out.print("Masukkan jumlah data:");
            int n = sc.nextInt();

            String[] nama = new String[n];
            String[] nim = new String[n];
            String[] angkatan = new String[n];

            for (int i = 0; i < n; i++) {
                nama[i] = sc.next().replaceAll("_", " "); // replace underscode menjadi spasi
                nim[i] = sc.next();
                angkatan[i] = sc.next();

            }
            sc.close();

            pWriter.println("+--------------------+-----------+---------+");
            pWriter.println("|Nama                |NIM        |Angkatan |");
            pWriter.println("+--------------------+-----------+---------+");

            for (int i = 0; i < n; i++) {
                pWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);

            }
            pWriter.println("+--------------------+-----------+---------+");

        } catch (Exception e) {
            System.out.println("Gagal");
        } finally {
            try {
                if (pWriter != null) {
                    pWriter.close();
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