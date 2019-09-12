import java.util.Scanner;
class Tugas3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Input
        Double h, a, b, panjangKapal;
        System.out.print("h (Tinggi menara) ---------------------------> ");
        h = input.nextDouble();
        System.out.print("a (Sudut elevasi terhadap ujung depan) ------> ");
        a = input.nextDouble();
        System.out.print("b (Sudut elevasi terhadap ujung belakang) ---> ");
        b = input.nextDouble();
        
        //Rumus
        panjangKapal = ((Math.tan(Math.toRadians(a)))*h) - h*(Math.tan(Math.toRadians(b)));
        
        //Output
        System.out.printf("Panjang kapalnya adalah = %.1f meter", panjangKapal);
        input.close();

    }
}