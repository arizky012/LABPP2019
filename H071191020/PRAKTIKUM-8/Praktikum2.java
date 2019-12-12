import java.util.*;
import java.io.*;

class Praktikum2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        FileReader lili = null;
        BufferedReader lolo = null;
        FileWriter lala = null;
        PrintWriter lele = null;

        try {
            String read = pew.next();
            String read2 = pew.next();
            lili = new FileReader(read + ".txt");
            lolo = new BufferedReader(lili);
            lala = new FileWriter(read2 + ".txt");
            lele = new PrintWriter(lala);
            
            String haha;
            int ehem = 0;
            while ((haha = lolo.readLine()) != null) {
                ehem = haha.length() > ehem ? haha.length() : ehem;
            }
            lili = new FileReader(read + ".txt");
            lolo = new BufferedReader(lili);

            String cek;
            while ((cek = lolo.readLine()) != null) {
                lele.write(String.format("%" + ehem + "s\n" , cek));
            }

            
        
        } catch (IOException e) {
            System.out.println("gagal");
        }finally{
            try{
                if (lala != null){
                    System.out.println("berhasil");
                    lala.close();
                }
                if(lele != null){
                    lele.close();
                }
            }catch(IOException ioe){
                System.out.println("gagal");
            }
        }
    }
}