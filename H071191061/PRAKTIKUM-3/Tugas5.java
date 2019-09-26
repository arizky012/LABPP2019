import java.util.Scanner;
class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input nilai akhir bilangan prima ---> ");
            int n = input.nextInt();
            System.out.println("Bilangan prima yang kurang dari "+n+" adalah : ");

            for (int i = 2; i <= n; i++) {
                int mod = 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        mod = 0;
                    }
                }if (mod == 1) {
                    System.out.print(i + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally {  
    input.close();
        }
    }
}