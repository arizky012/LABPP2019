import java.util.Scanner ;

class LetakKuadran{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();

   
        if(x < 0 && y>0 && x+y < 0){
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 1");
        } else if(x<0 && y>0 && x+y > 0) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 2");
        } else if (x<0 && y>0 && y>=x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada garis -x = y");
        } else if (x>0 && y>0 && y>x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 3");
        } else if (x>0 && y>0 && y==x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada garis x = y");
        } else if (x>0 && y>0 && y<x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 4");
        } else if (x>0 && y<0 && x+y > 0) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 5");
        } else if (x>0 && y<0 && y<=x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada garis x = -y");
        } else if (x>0 && y<0 && x+y < 0) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 6");
        } else if (x<0 && y<0 && y<x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 7");
        } else if (x<0 && y<0 && y==x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada garis -x = -y");
        } else if (x<0 && y<0 && y>x) {
            System.out.println("Titik : " +x+"," +y+ " berada pada kuadran 8");
        } else if (x>0 && y==0){
            System.out.println("Titik : " +x+"," +y+ " berada pada garis X");
        } else if (x<0 && y==0){
            System.out.println("Titik : " +x+"," +y+ " berada pada garis -X");
        } else if (x==0 && y>0){
            System.out.println("Titik : " +x+"," +y+ " berada pada garis Y");
        } else if (x==0 && y<0){
            System.out.println("Titik : " +x+"," +y+ " berada pada garis -Y");
        } else {
            System.out.println("Titik Pusat : " +x+ "," +y);
        }
    }
}