import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input angka pertama ---> ");
            int x = input.nextInt();
            System.out.print("Input angka terakhir --> ");
            int y = input.nextInt();

            for (int i = (x <= y ? x : y); i <= (x <= y ? y : x); i++) {
                if (i < 0 && i % 2 == 0) {
                    System.out.println(i+" Genap negatif");
                }else if (i < 0 && i % 2 != 0) {
                    System.out.println(i+" Ganjil negatif");
                }else if (i == 0) {
                    System.out.println(i+" Nol");
                }else if (i > 0 && i % 2 == 0) {
                    System.out.println(i+" Genap positif");
                }else {
                    System.out.println(i+" Ganjil positif");
                }
            }
        }catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally{
            input.close();
        }
    }
}