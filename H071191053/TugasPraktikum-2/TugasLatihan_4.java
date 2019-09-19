import java.util.Scanner;

public class TugasLatihan_4{

    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

            sc.close();

            int a = x * x;
            int b = y * y;

        if (x < 0 && y > 0){
            if (a > b){
                System.out.println("subKuadran 1");
            } else if (a < b){
                System.out.println("subKuadran 2");
              } else {
                  System.out.println("pada garis kuadaran 2");
              }
            } 
            
         else if (x > 0 && y > 0){
            if(b > a){
                System.out.println("subKuadran 3");
            }  else if (b < a){
                System.out.println("subKuadran 4");
            } else {
                System.out.println("pada garis kuadran 1");
            }
        }

        else if (x > 0 && y < 0){
            if (a > b){
                System.out.println("subKuadran 5");
            } else if (a < b){
                System.out.println("subKuadran 6");
            } else {
                System.out.println("pada garis kuadran 4");
            }
        }

        else if (x < 0 && y < 0){
            if (a < b){
                System.out.println("subKuadran 7");
            } else if (a > b){
                System.out.println("subKuadran 8");
            } else {
                System.out.println("pada garis kuadran 3");
            }
        }

        else if (x == 0 ||  y == 0){
            if (x == 0){
                System.out.println("sumbu y");
            }
            else if (y == 0){
                System.out.println("sumbu x");
            }
        }
        }

    }