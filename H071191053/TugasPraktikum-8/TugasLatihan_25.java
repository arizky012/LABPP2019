import java.util.Scanner;
import java.io.*;

public class TugasLatihan_25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        FileReader sourceFile1 = null;
        FileReader sourceFile2 = null;
        BufferedReader readFile1 = null;
        BufferedReader readFile2 = null;
        FileWriter writeFile = null;

        try 
        {
            System.out.println("Masukkan nama source file");
            sourceFile1 = new FileReader(sc.next()+".txt");
            sourceFile2 = new FileReader(sc.next()+".txt");
            readFile1 = new BufferedReader(sourceFile1);
            readFile2 = new BufferedReader(sourceFile2);
            System.out.println("Masukkan nama output file");
            writeFile = new FileWriter(sc.next()+".txt");

            String s1;
            String s2;
            while((s1 = readFile1.readLine()) != null && (s2 = readFile2.readLine()) != null){
                writeFile.write(s1+"\t\t"+s2+"\n");
            }

        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        } finally 
        {
            try 
            {
                if (sourceFile1 != null) {
                    sourceFile1.close();
                    System.out.println("berhasil");
                }

                if (sourceFile2 != null) {
                    sourceFile2.close();
                }

                if (writeFile != null) {
                    writeFile.close();
                }

                if (readFile1 != null) {
                    readFile1.close();
                }

                if (readFile2 != null) {
                    readFile2.close();
                }
                
            } catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }

    }
}