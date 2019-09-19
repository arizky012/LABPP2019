import java.util.Scanner;
class Kuadran1{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x  = input.nextInt();
    int y  = input.nextInt();
    if (x<0&&y>0){
        if (x+y<0){
            System.out.printf("titik(%d,%d) terletak pada kuadran 1",x,y);
        }else if (x+y>0){
            System.out.printf("titik(%d,%d) terletak pada kuadran 2",x,y);
        }else{
            System.out.println("terletak pada garis -x=y");
        }
        }
    else if (x>0 && y>0){
            if (x-y>0){
                System.out.printf("titik(%d,%d) terletak pada kuadran 3",x,y);
            }else if(x-y>0){
                System.out.printf("titik(%d,%d) terletak pada kuadran 4",x,y);
            }else {
                System.out.println("terletak pada garis x=y");
            }
        }
        else if (x>0 && y<0){
            if(x+y>0){
                System.out.printf("titik(%d,%d) terletak pada kuadran 5",x,y);
            }else if (x+y<0){
                System.out.printf("titik(%d,%d) terletak pada kuadran 6",x,y);
            }else{
                System.out.println("terletak pada garid x=-y");
            }
        }
        else if (x<0&&y<0){
            if(x-y>0){
            System.out.printf("titik(%d,%d) terletak pada kuadran 7",x,y);
        }if (x-y <0){
            System.out.printf("titik(%d,%d) terletak pada kuadran 8",x,y);
        }else{
            System.out.println("terletak pada garis -x=-y");
        }
        }else {
            System.out.println("terletak pada garis pusat");
        }
    }       
     }

        