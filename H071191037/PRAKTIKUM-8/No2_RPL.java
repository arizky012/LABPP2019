import java.util.*;
import java.io.*;

public class No2_RPL {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        FileReader file = null;
        BufferedReader read = null;
        FileWriter writer = null;

        try {
            String fileName = inp.nextLine()+ ".txt";
            file = new FileReader(fileName);
            read = new BufferedReader(file);
            String outputfileName = inp.nextLine() + ".txt";
            writer = new FileWriter(outputfileName);
            inp.close();

            String x,str="";
            int longString = 0;
            while ((x = read.readLine()) != null){
                if(x.length() > longString){
                    longString = x.length();
                }
                str += x + "\n";
            }
            String[] word = str.split("\n");

            for(int i = 0; i < word.length; i++){
                String newWord = String.format("%"+longString+"s",word[i]);
                writer.write(newWord + "\n");
            }

        } catch (IOException e) {
            System.out.println("gagal = " + e.getMessage());
        } finally {
            try {
                if (file != null && read != null && writer != null){
                    file.close();
                    read.close();
                    writer.close();
                    System.out.println("Berhasil");
                }
            } catch (IOException e) {
                System.out.println("gagal = "+ e.getMessage());
            }
        }
        
    }
}