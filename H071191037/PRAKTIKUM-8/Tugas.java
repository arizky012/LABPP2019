import java.util.*;
import java.io.*;

public class Tugas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        FileReader file1 = null;
        FileReader file2 = null;
        BufferedReader read = null;
        BufferedReader read2 = null;
        FileWriter newFile = null;

        try {
            String fileName = inp.nextLine()+".txt";
            file1 = new FileReader(fileName);
            read = new BufferedReader(file1);

            String fileName2 = inp.nextLine()+".txt";
            file2 = new FileReader(fileName2);
            read2 = new BufferedReader(file2);
            
            String fileOutput = inp.nextLine()+".txt";
            newFile = new FileWriter(fileOutput);
            inp.close();

            String a ,b;
            while ((a = read.readLine()) != null && (b = read2.readLine() ) != null){
                newFile.write(a+" "+b+"\n");
            }
        } catch (IOException e) {
            System.out.println("GAGAL = " + e.getMessage());
        } finally {
            try {
                if(newFile != null){
                    newFile.close();
                }
                if(read2 != null){
                    read2.close();
                }
                if(read != null){
                    read.close();
                }
                if(file2 != null){
                    file2.close();
                }
                if(file1 != null){
                    file1.close();
                    System.out.println("BERHASIL");
                }  
            } catch (IOException e) {
                System.out.println("GAGAL = "+ e.getMessage());
            }
        }
    }
}