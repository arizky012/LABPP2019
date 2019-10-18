import java.util.*;

class MyDay{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int usia = inp.nextInt();
            inp.close();
            myDay(usia);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
    static void myDay(int x){
        int tahun = x / 365;
        int bulan = (x-(tahun * 365))/30;
        int hari = (x-((tahun * 365)+(bulan * 30)));
        System.out.printf("%d Tahun\n%d Bulan\n%d Hari",tahun,bulan,hari);
    }
}