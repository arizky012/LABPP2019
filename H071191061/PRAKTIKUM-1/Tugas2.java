import java.util.Scanner;
class Tugas2{
    public static void main(String[] args){
       
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Input berapa detik yang ingin dihitung ---> ");
        int detik = input.nextInt();
       
        //Rumus
        int jam = detik / 3600;
        int jam2 = detik % 3600;
        int menit = jam2 / 60;
        int menit2 = jam2 % 60;
        int detik1 = menit2;
       
        //Output
        System.out.printf("%02d jam : %02d menit : %02d detik",jam, menit, detik1);
        input.close();
    }
}