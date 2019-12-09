import java.io.*;
import java.util.Scanner;

public class TugasDua{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        FileReader reader = null;
        BufferedReader buffer = null;
        FileWriter writer = null;

        duplicateFile(reader, buffer, writer);
    }
    static void duplicateFile(FileReader reader, BufferedReader buffer, FileWriter writer) {
        try{
            String fileName = userInput.next();
            reader = new FileReader(fileName + ".txt");
            buffer = new BufferedReader(reader);
            String destFile = userInput.next();
            writer = new FileWriter(destFile + ".txt");

            String sentence;
            String backUpSentence = "";
            int longestSentence = 0;

            while((sentence = buffer.readLine()) != null){
                if(sentence.length() > longestSentence){
                    longestSentence = sentence.length();
                }
                backUpSentence += sentence + "\n";
            }

            String[] sentenceEveryLine = backUpSentence.split("\n");

            for(int i = 0 ; i < sentenceEveryLine.length ; i++){
                String newSentence = String.format("%" + longestSentence + "s", sentenceEveryLine[i]);
                if(i == sentenceEveryLine.length - 1){
                    writer.write(newSentence);
                }else{
                    writer.write(newSentence + "\n");
                }
            }
            System.out.print("Berhasil");
        }catch(IOException ioe){
            System.out.print("gagal");
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }
                if(buffer != null){
                    buffer.close();
                }
                if(writer != null){
                    writer.close();
                }
            }catch(IOException ioe){
                System.out.print("gagal");
            }
        }
    }
}
