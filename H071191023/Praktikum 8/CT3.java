//import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

class CT3 {
    public static void main(String[] args) {
        Scanner dir = new Scanner(System.in);
        System.out.println("Masukkan Nama file");
        String namaFile = dir.next() + ".txt";

        FileWriter file = null;
        PrintWriter writer = null;

        try {

            file = new FileWriter(namaFile);
            writer = new PrintWriter(file);
            System.out.println("Masukkan banyak data");
            int jumlah = dir.nextInt();

            System.out.println(" Masukkan nama, NIM, Angkatan");
            String[] nama = new String[jumlah];
            String[] NIM = new String[jumlah];
            int[] angkatan = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                nama[i] = dir.next().replaceAll(" ", " "); // replace underscode menjadi spasi;
                NIM[i] = dir.next();
                angkatan[i] = dir.nextInt();

            }
            String Table = "|%-20s|%-11s|%-9d|%n";
            // String Table = |%-20s | %-20s |%-10d |"%n"|;

            writer.println("+--------------------+-----------+---------+");
            writer.println("|Nama                |NIM        |Angkatan |");
            writer.println("+--------------------+-----------+---------+");

            for (int i = 0; i < jumlah; i++) {
                writer.printf(Table, nama[i], NIM[i], angkatan[i]);

            }
            writer.printf("+--------------------+-----------+---------+%n");

            System.out.println("Berhasil");
        } catch (IOException ioe) {
            System.out.println("gagal");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (writer != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage(    ));
            }
        }

    }
}