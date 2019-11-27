import java.io.*;
import java.util.Scanner;

public class TugasLatihan_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        FileWriter  write = null;
        int valueOf = sc.nextInt();
        String[][] asistenLabData = new String[valueOf][3];

        for (int i = 0; i < valueOf; i++) {
            for (int j = 0; j < 3; j++) {
                asistenLabData[i][j] = sc.next();
            }
        }

        try {
            String fileDestination = sc.next();
            write = new FileWriter (fileDestination + ".txt");

            write.write(nameDash(longestData(asistenLabData))+"\n");
            write.write(explanation(longestData(asistenLabData))+"\n");
            write.write(nameDash(longestData(asistenLabData))+"\n");
            write.write(dataAdder(spaceAdder(asistenLabData))+"\n");
            write.write(nameDash(longestData(asistenLabData))+"\n");

            


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (write != null) {
                    write.close();
                    System.out.println("berhasil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(longestData(asistenLabData));
        System.out.println(nameDash(longestData(asistenLabData)));
        System.out.println(explanation(longestData(asistenLabData)));
        System.out.println(nameDash(longestData(asistenLabData)));
        System.out.println(dataAdder(spaceAdder(asistenLabData)));
        System.out.println(nameDash(longestData(asistenLabData)));
       


    }

    public static String dataAdder(String[][] data) {
        String newData = "";

        for (int i = 0; i < data.length; i++) {
            newData += "|";
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    newData += " " + data[i][j] + "     |";
                }
                else {
                    newData += " " + data[i][j] + " |";
                }

            }
            newData += i == data.length - 1 ? "" : "\n";
        }
        return newData;
    }

    public static int longestData(String[][] data){
        String sampelData = "";
        int dataLength = 0;

        for (int i = 0; i < data.length; i++) {
                sampelData = data[i][0];
                if (sampelData.length() > dataLength) {
                    dataLength = sampelData.length();
                }
        }
        return dataLength;
    }

    public static String[][] spaceAdder (String[][] data){

        int batas = longestData(data);
        
        for (int i = 0; i < data.length; i++) {
            while (data[i][0].length() != batas) {
                data[i][0] += " ";
            }
        }

        return data;
    }

    public static String nameDash (int a){
        String border = "+";
        int[] nomor = {(a + 2),12,10};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nomor[i]; j++) {
                border += "-";
            }
            border += "+";
        }

        return border;
    }

    public static String explanation (int a){
        String[] ex = {"Nama","NIM","Angkatan"};
        int[] value = {(a + 2),12,10};
        String exResult = "|";

        for (int i = 0; i < ex.length; i++) {
            exResult += ex[i];
            for (int j = 0; j < value[i] - ex[i].length(); j++) {
                exResult += " ";
            }
            exResult += "|";
        }

        return exResult;
    }

}