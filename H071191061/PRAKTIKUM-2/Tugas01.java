import java.util.InputMismatchException;
import java.util.Scanner;
class Tugas01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input 5 Bilangan ---> ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            int genap = 0, ganjil = 0, positif = 0, negatif = 0;

            // A
            if (a > 0){
                positif++;
                if (a % 2 == 0){
                    genap++;
                }else if (a % 2 == 1){
                    ganjil++;
                }
            }else if (a < 0){
                negatif++;
                if (a % 2 == 0){
                    genap++;
                }else if (a % 2 == 1){
                    ganjil++;
                }
            }else {
                genap++;
            }

            // B
            if (b > 0){
                positif++;
                if (b % 2 == 0){
                    genap++;
                }else if (b % 2 == 1){
                    ganjil++;
                }
            }else if (b < 0){
                negatif++;
                if (b % 2 == 0){
                    genap++;
                }else if (b % 2 == 1){
                    ganjil++;
                }
            }else {
                genap++;
            }
            
            // C
            if (c > 0){
                positif++;
                if (c % 2 == 0){
                    genap++;
                }else if (c % 2 == 1){
                    ganjil++;
                }
            }else if (c < 0){
                negatif++;
                if (c % 2 == 0){
                    genap++;
                }else if (c % 2 == 1){
                    ganjil++;
                }
            }else{
                genap++;
            }

            // D
            if (d > 0){
                positif++;
                if (d % 2 == 0){
                    genap++;
                }else if (d % 2 == 1){
                    ganjil++;
                }
            }else if (d < 0){
                negatif++;
                if (d % 2 == 0){
                    genap++;
                }else if (d % 2 == 1){
                    ganjil++;
                }
            }else {
                genap++;
            }

            // E
            if (e > 0){
                positif++;
                if (e % 2 == 0){
                    genap++;
                }else if (e % 2 == 1){
                    ganjil++;
                }
            }else if (e < 0){
                negatif++;
                if (e % 2 == 0){
                    genap++;
                }else if (e % 2 == 1){
                    ganjil++;
                }
            }else {
                genap++;
            }

            // OUTPUT
            System.out.println("\n"+genap+" Angka genap");
            System.out.println(ganjil+" Angka ganjil");
            System.out.println(positif+" Angka positif");
            System.out.println(negatif+" Angka negatif");
            
        } catch (InputMismatchException a) {
            System.out.println(" ");
            System.out.println("Inputan tidak valid!");
        }finally {
            input.close();
        }
    }
}

