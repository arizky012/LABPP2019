import java.util.InputMismatchException;
import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int genap=0,ganjil=0,pos=0,neg=0;
        try{
            int a = inp.nextInt();
            int b = inp.nextInt();
            int c = inp.nextInt();
            int d = inp.nextInt();
            int e = inp.nextInt();
            inp.close();

        
            if(a %2 == 0){
                genap++;
                if(a < 0){
                    neg++;
                }else if(a > 0){
                    pos++;
                }
            }else{
                ganjil++;
                if(a < 0){
                    neg++;
                }else if(a > 0){
                    pos++;
                }
            }
    
            if(b %2 == 0){
                genap++;
                if(b < 0){
                    neg++;
                }else if(b > 0){
                    pos++;
                }
            }else{
                ganjil++;
                if(b < 0){
                    neg++;
                }else if(b > 0){
                    pos++;
                }
            }
            
            if(c %2 == 0){
                genap++;
                if(c < 0){
                    neg++;
                }else if(c > 0){
                    pos++;
                }
            }else{
                ganjil++;
                if(c < 0){
                    neg++;
                }else if(c > 0){
                    pos++;
                }
            }
    
            if(d %2 == 0){
                genap++;
                if(d < 0){
                    neg++;
                }else if(d > 0){
                    pos++;
                }
            }else{
                ganjil++;
                if(d < 0){
                    neg++;
                }else if(d > 0){
                    pos++;
                }
            }
    
            if(e %2 == 0){
                genap++;
                if(e < 0){
                    neg++;
                }else if(e > 0){
                    pos++;
                }
            }else{
                ganjil++;
                if(e < 0){
                    neg++;
                }else if(e > 0){
                    pos++;
                }
            }
            System.out.printf("%d angka genap\n%d angka ganjil\n%d angka positif\n%d angka negatif",genap,ganjil,pos,neg);
        }
        catch(InputMismatchException Tugas1){
            System.out.println("Inputan Tidak Valid");
        }
    }
}
        