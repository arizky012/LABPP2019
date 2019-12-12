import java.util.Scanner;

class ModulNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kar = in.nextLine();
        String convert = "";
        for (int i = 0; i <kar.length(); i++) {
            if (i%2 == 0) {
                convert += kar.charAt(i);
            } else {
                convert += kar.codePointAt(i);
            }
        }
        //int length = convert.length();
        int matriks = (convert.length()/16)+1; 

        int y = 0;
        for (int i = 1; i <= 16; i++) {
            for (int j = 0; j < matriks; j++) {
                if (y < convert.length()) {
                    System.out.print(convert.charAt(y));
                    y++;
                } else {
                    System.out.print("?");
                }
            }
            System.out.print(" ");
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
