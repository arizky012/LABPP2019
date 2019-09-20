import java.util.Scanner;
class WaktuAsal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int jam1= input.nextInt();
int menit1 = input.nextInt();
jam1 =60*jam1+ menit1;
int jam2 = input.nextInt();
int menit2= input.nextInt();
jam2=60*jam2+menit2;
int waktu;
int jam;

if(jam2 >= 0 && jam1 >=0 && menit2>=0 &&menit1 >= 0){
    if(jam2<=jam1){
        waktu = (jam2+1440-jam1 ==0)?1440:jam2+1440-jam1;
    }else{
        waktu =jam = jam2-jam1;
    }
    jam=waktu/60;
    int menit = waktu%60;
    System.out.printf("%02d:%02d",jam,menit);
}else{
    System.out.println(" ");
 }

}
}