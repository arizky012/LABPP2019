import java.util.Scanner;
class Tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int counter;
            int faktorial = 1;
            System.out.print("Input angka ---> ");
            int n = input.nextInt();
            System.out.printf("\nFaktorialnya : ");

            if (n < 0) {
                System.out.println("Tidak boleh bilangan negatif");
            } else {
                for (counter = n; counter >= 1; counter--) {
                    faktorial = faktorial * counter;
                    System.out.print(counter + " x ");
                }
                System.out.print("= "+faktorial);
            }    
        } catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally {
            input.close();
        }
    }
}