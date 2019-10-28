import java.util.Scanner;
public class TugasLatihan_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int barisKolom = sc.nextInt();
            int [][] matriks = new int[barisKolom][barisKolom];
    
            for (int i = 0; i < barisKolom; i++) {
                for (int j = 0; j < barisKolom; j++) {
                    matriks [i][j] = sc.nextInt();
                }
            }
            
        } catch (Exception e) {
            System.out.println("Inputan Salah");
        }

        for (int i = 1; i < matriks.length - 1; i++) {
            for (int j = 1; j < matriks.length - 1; j++) { 
                if (matriks[i][j] == 0){
                if(matriks[i][j] != matriks[i][j - 1] && matriks[i][j] != matriks[i][j + 1] && matriks[i][j] != matriks[i - 1][j] && matriks[i][j] != matriks[i + 1][j]){
                    System.out.println(i+","+j);
                }
            }
            } 
        } 
    }
}