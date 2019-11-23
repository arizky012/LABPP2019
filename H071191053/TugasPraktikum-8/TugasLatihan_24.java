import java.io.*;
import java.util.Scanner;

class TugasLatihan_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BufferedReader copy = null;
        FileReader real = null;
        FileWriter write1 = null;
        try {
            String inputName = sc.next();
            real = new FileReader(inputName+".txt");
            copy = new BufferedReader(real);
            String outputName = sc.next();
            write1 = new FileWriter(outputName+".txt");

            String s;
            String backup = "";
            int longestString = 0;
            while((s = copy.readLine()) != null) {
                if(s.length() > longestString){
                    longestString = s.length();
                }
                backup += s + "\n";
            }

            String[] sentenceEveryLine = backup.split("\n");

            for (int i = 0; i < sentenceEveryLine.length; i++) {
                String newSentence = String.format("%"+longestString+"s", sentenceEveryLine[i]);
                write1.write(newSentence + "\n");
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (copy != null) {
                    copy.close();
                }

                if (real != null) {
                    real.close();
                }

                if (write1 != null) {
                    write1.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
    }
}