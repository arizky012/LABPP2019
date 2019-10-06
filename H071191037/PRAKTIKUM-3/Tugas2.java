import java.util.InputMismatchException;
import java.util.Scanner;

class Tugas2{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        try {
            int x = inp.nextInt();
            int y = inp.nextInt();
            inp.close();

            if(x < 0){
                System.out.println("masukkan nilai X lebih dari 0");
                return;
            }
            if(y < 0){
                for(int i = y; i<= -1; i +=x){
                    for(int j = 0; j < x; j++){
                        System.out.printf("%-4d ",i + j);
                        if(j + i == -1){
                            break;
                        }
                    }
                    System.out.println();
                }
            } else {
                for(int i = 1; i <= y; i++){
                    System.out.printf("%-4d ",i);
                    if(i %x == 0){
                        System.out.println();
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
 
}