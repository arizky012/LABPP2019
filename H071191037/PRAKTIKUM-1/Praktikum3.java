import java.util.Scanner;
class Praktikum3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat(); //ketinggian menara (m)
        float b = input.nextFloat(); //sudut elevasi pengamat terhadap ujung depan kapal (90 > a > b)
        float a = input.nextFloat(); //sudut elevasi pengamat terhadap ujung belakang kapal (90 > a > b)

        double sudut = Math.tan(Math.toRadians(a)) * h; //math.toRadians = untuk mengubah ke derajat
        double sudut2 = Math.tan(Math.toRadians(b)) * h;
        double panjang = sudut2 - sudut;
        System.out.printf("panjang kapal = %.1f m", panjang);
    }
}