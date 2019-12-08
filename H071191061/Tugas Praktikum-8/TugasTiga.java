import java.io.*;
import java.util.Scanner;

public class TugasTiga{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        FileWriter file = null;
        PrintWriter print = null;
        try {
            String fileName = userInput.next();
            file = new FileWriter(fileName + ".txt");
            print = new PrintWriter(file);

            int totalData = userInput.nextInt();
            String[][] data = new String[totalData][3];
            table(file, print, totalData);

            userInput.nextLine();
            for (int i = 0 ; i < totalData ; i++) {
                System.out.println("data " + (i+1));
                for(int j = 0 ; j < 3 ; j++){
                    data[i][j] = userInput.nextLine();
                    data[i][j] = data[i][j].replace("_", " ").replace("\n", "");
                }
            }
            for (int i = 0 ; i < totalData ; i++) {
                print.print("|");
                for(int j = 0 ; j < 3 ; j++) {
                    String length = j == 0 ? " %-20s |" : j == 1 ? " %-11s|" : j == 2 ? " %-9s|" : "";
                    print.printf(length,data[i][j]);
                }
                print.println();
            }
            print.println("+----------------------+------------+----------+");
            System.out.println("Berhasil");
        }catch (IOException ioe) {
            System.out.println("gagal");
        }finally {
            try {
                if(file != null) {
                file.close();
                }if(print != null) {
                print.close();
                }
            }catch (IOException ioe) {
                System.out.println("gagal");
            }
        }
    }
    private static void table(FileWriter file, PrintWriter print, int totalData) throws IOException {
        print = new PrintWriter(file);
        print.println("+----------------------+------------+----------+");
        print.println("| Nama                 | NIM        | Angkatan |");
        print.println("+----------------------+------------+----------+");
        if (totalData == 0) {
            print.println("|                      |            |          |");
            return;
        }
    }
}
