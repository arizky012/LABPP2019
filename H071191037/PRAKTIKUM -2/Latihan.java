import java.util.InputMismatchException;
import java.util.Scanner;
class Latihan{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            int x = inp.nextInt();
            int y = inp.nextInt();
            inp.close();
    
            if(x == 0 && y != 0){
                System.out.printf("%d,%d titik ini berada pada garis y", x,y);
            }else if(x != 0 && y == 0){
                System.out.printf("%d,%d titik ini berada pada garis x", x,y);
            }else if(x < 0 && y >  0){
                if(x + y < 0){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 1",x,y);
                }else if(x + y > 0){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 2",x,y);
                }else{
                    System.out.println("Terletak pada garis -x = y");
                }
            }else if(x > 0 && y > 0){
                if(x < y){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 3",x,y);
                }else if(x > y){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 4",x,y);
                }else{
                    System.out.println("Terletak pada garis x = y");
                }
            }else if(x > 0 && y < 0){
                if(x + y > 0){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 5",x,y);
                }else if(x + y < 0){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 6",x,y);
                }else{
                    System.out.println("Terletak pada garis x = -y");
                }
            }else if(x < 0 && y < 0){
                if(x > y){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 7",x,y);
                }else if(x < y){
                    System.out.printf("Titik (%d,%d) berada pada kuadran 8",x,y);
                }else{
                    System.out.println("Terletak pada garis -x = -y");
                }
            }else{
                System.out.printf("%d,%d titik berada pada titik pusat",x,y);
            }
        }
        catch(InputMismatchException ex){
            System.out.println("input tidak valid");
        }
    }
}