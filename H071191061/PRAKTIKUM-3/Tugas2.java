import java.util.Scanner;
class Tugas2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input banyak kolom ---> ");
            int x = input.nextInt();
            System.out.print("Input banyak angka ---> ");
            int y = input.nextInt();

            if (x < 0 | y < 0) {
                System.out.println("Inputan harus positif!");
            }else{
                for (int i = 1; i <= y; i++) {
                    System.out.print(i+ " ");
                    if (i % x == 0) {
                    System.out.println();
                    }
                }
            }
        
                
        } catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally {
            input.close();
        }
    }
} 
