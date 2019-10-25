import java.util.Scanner;

//Modul Nomor 2
public class CharMatrix {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);
            String sentence = ka.nextLine();

            String newSentence = "";
            for (int i = 0; i < sentence.length(); i++) {

                if (i % 2 == 1) {
                    newSentence += sentence.codePointAt(i);

                } else if (i % 2 == 0) {
                    newSentence += sentence.charAt(i);
                }

            }
            int length = newSentence.length();
            int matrixLength = (int) Math.ceil(length / 16f);

            int index = 0;
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < matrixLength; j++) {
                    if (index < length) {
                        System.out.print(newSentence.charAt(index));
                        index++;
                    } else {
                        System.out.print("?");
                    }

                }
                System.out.print(" ");
                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }

                ka.close();
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}