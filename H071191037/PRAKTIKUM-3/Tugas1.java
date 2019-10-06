import java.util.InputMismatchException;
import java.util.Scanner;

class Tugas1{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        try {
            int x = inp.nextInt();
            int y = inp.nextInt();

            if(x <= y){
                for(int i = x; i <= y; i++){
                    if(i %2 == 0 && i != 0){
                        if(i > 0){
                            System.out.printf("%d Genap Positif\n",i);
                        } else {
                            System.out.printf("%d Genap Negatif\n",i);
                        }
                    } else if(i %2 != 0) {
                        if(i > 0){
                            System.out.printf("%d Ganjil Positif\n",i);
                        } else {
                            System.out.printf("%d Ganjil Negatif\n",i);
                        }                    
                    } else {
                        System.out.printf("%d nol\n",i);
                    }
                }
            } else {
                for(int i = y; i <= x; i++){
                    if(i %2 == 0 && i != 0){
                        if(i > 0){
                            System.out.printf("%d Genap Positif\n",i);
                        } else {
                            System.out.printf("%d Genap Negatif\n",i);
                        }
                    } else if(i %2 != 0) {
                        if(i > 0){
                            System.out.printf("%d Ganjil Positif\n",i);
                        } else {
                            System.out.printf("%d Ganjil Negatif\n",i);
                        }                    
                    } else {
                        System.out.printf("%d nol\n",i);
                    }
                }
            }
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }

    }
}