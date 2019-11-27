import java.util.Scanner;
class HaWa2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int ehem=sc.nextInt();
        myDay(ehem);
    }catch(Exception e){
           System.out.println("inputan tdk valid");
    }
    }
    
    
    public static int myDay(int a) {
  
        int tahun= a/365;
        a=a%365;
        int bulan=a/30;
        a=a%30;
        int hari = a/1;
        a=a%1;
        System.out.println(tahun+ " tahun ");
        System.out.println(bulan+" bulan ");
        System.out.println(hari+ " hari ");
    //    System.out.println(a);
        return a;
    }
}   




    

    