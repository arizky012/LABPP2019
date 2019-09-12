import java.util.Scanner;
class Tugas1{
    public static void main(String[] args){
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Lama Waktu Perjalanan ---> ");
        double waktu = input.nextDouble();
        System.out.print("Kecepatan Rata-Rata -----> ");
        double kecepatan = input.nextDouble();
       
        //Rumus
        double bensin = (kecepatan * waktu) / 14.0;

        //Output
        System.out.printf("Bensin yang dihabiskan = %.3f Liter" ,bensin);
        input.close();
    }
}