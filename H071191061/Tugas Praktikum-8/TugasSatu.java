import java.io.*;
import java.util.Scanner;

public class TugasSatu{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        FileReader read = null;
        FileWriter writer = null;
        BufferedReader buffer = null;
        duplicateFile(read, writer, buffer);

    }
    static void duplicateFile(FileReader read, FileWriter writer, BufferedReader buffer) {
        try{
            String fileName = userInput.next();
            read = new FileReader(fileName + ".txt");
            buffer = new BufferedReader(read);
            String newFile = userInput.next();
            writer = new FileWriter(newFile + ".txt");

            int dataLength = buffer.read();
            while (dataLength != -1){
                writer.write(dataLength);
                dataLength = buffer.read();
            }
            System.out.println("Berhasil");
        }catch (IOException ioe){
            System.out.println("gagal");
        }finally{
            try{
                if(buffer != null){
                buffer.close();
                }if(read != null){
                read.close();
                }if(writer != null){
                writer.close();
                }
            }catch (IOException ioe){
                System.out.println("gagal");
            }
        }
    }
}
