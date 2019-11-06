import java.util.Scanner;

//Modul Nomor 1
public class KodeUnik {

    public static void main(String[] args) {
        try {

            Scanner ka = new Scanner(System.in);

            String words = ka.nextLine();
            String trimSentence = words.replaceAll("\\s+", "");

            int divide = trimSentence.length() / 2;

            String[] parts = { trimSentence.substring(0, divide) };
            String part1 = parts[0];

            String reverse = "";
            for (int i = part1.length() - 2; i >= 0; i--) {
                reverse += part1.charAt(i);
            }
            String palindrom = part1 + reverse;

            int hexadecimal = words.length() * words.length();
            String hexa = String.format("%x", hexadecimal);
            int octal = words.length();
            String oct = String.format("%o", octal);

            char hexa1 = (hexa.charAt(0));
            int hexa2 = (int) (hexa1);

            String upperPali = palindrom.toUpperCase();

            if (hexa2 >= 65 && hexa2 <= 90 || hexa2 >= 97 && hexa2 <= 122) {
                System.out.printf("#%s%s%s?", hexa, upperPali, oct);

            } else {
                System.out.printf("#%s%s%s!", hexa, upperPali, oct);
            }
            ka.close();

        } catch (Exception e) {
            System.out.println("Exception");

        }
    }
}