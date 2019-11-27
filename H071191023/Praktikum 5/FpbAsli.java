import java.util.Scanner;
public class FpbAsli { 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
        System.out.println("masukkan angka awal");
        int n = sc.nextInt();
        System.out.println("masukkan angka kedua");
        int m = sc.nextInt();
        sc.close();
        
        
        FPB(n,m);
        
        System.out.println(" FPB dari " + n + " dan " +  m  +" adalah " + FPB ( n , m));
    }catch (Exception e) {
        System.out.println("inputan tidak valid");
        //TODO: handle exceptio
     }
    }

      static int FPB(int angk1,int angk2){
             do{
                 int save= angk2;
                 angk2=angk1%angk2;
                 angk1=save;
             }while (angk2!=0);
       
             return angk1;
        
            }
         }
        

