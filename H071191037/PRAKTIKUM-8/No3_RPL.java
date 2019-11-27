import java.util.*;
import java.io.*;

public class No3_RPL {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        FileWriter file = null;
        PrintWriter writer = null;

        try {
            String fileName = inp.nextLine()+".txt";
            file = new FileWriter(fileName);
            writer = new PrintWriter(file);
            int input = inp.nextInt();
            String arr[][] = new String[input][3];

            int i =0,j=0;
            for (i = 0; i < input; i++) {
                for (j = 0; j < 3; j++) {
                    arr[i][j] = inp.next().replace("_", " ");
                    if(arr[i][j].length() > 20){
                        System.out.println("karakter lebih dari 20");
                        return;
                    }
                } 
            }
            inp.close();
            writer.write("+----------------------+------------+----------+\n");
            writer.write("| Nama                 | NIM        | Angkatan |\n");
            writer.write("+----------------------+------------+----------+\n");
            
            for (i = 0; i < input; i++) {
                String word = String.format("| %-20s | %-10s | %-8s |\n",arr[i][0],arr[i][1],arr[i][2]); 
                writer.write(word);
            }
            writer.write("+----------------------+------------+----------+\n");

        } catch (IOException e) {
            System.out.println("GAGAL");
        } finally {
            try {
                if(writer != null){
                    writer.close();
                }
                if(file != null){
                    file.close();
                    System.out.println("BERHASIL");
                }
            } catch (IOException e) {
                System.out.println("GAGAL");
            }
        }

    }
}