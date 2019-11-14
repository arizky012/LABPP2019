import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//Tugas Praktikum kls A No.1
public class SelfDivide {

    public static void main(String[] args) {
        try {

            ArrayList<Integer> value = new ArrayList<>();
            Scanner ka = new Scanner(System.in);

            int in1 = ka.nextInt();
            int in2 = ka.nextInt();

            int start = in2 > in1 ? in1 : in2;
            int end = in2 > in1 ? in2 : in1;

            ka.close();

            for (int i = start; i <= end; i++) {
                HashMap<Integer, Integer> number = new HashMap<>();
                // menentukan digit
                int n = Math.abs(i);
                int x = 0;

                while (n > 0) {

                    int digit = n % 10;
                    n /= 10;
                    number.put(x, digit);
                    x++;

                }
        

                int c = i;
                int canDivide = 0;

                // mengecek pembagian digit

                for (int j = 0; j < number.size(); j++) {
                    if (number.get(j) != 0 && c % Math.abs(number.get(j)) == 0) {
                        canDivide++;
                    }

                }

                // menyimpan angka yang bisa dibagi

                if (canDivide == x) {
                    value.add(c);
                }

            }

            if (value.size() == 0) {
                System.out.println("Deret angka tidak bisa dibagi");
            } else {
                System.out.print(value);
            }

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}