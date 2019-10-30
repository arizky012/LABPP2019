import java.util.Scanner;
class ModulNo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int hari = in.nextInt();
    myDay(hari);
    in.close();
  }
  public static int myDay(int hari){
    int tahun = 0;
    int bulan = 0;
    tahun = hari/365;
    hari = hari%365;
    bulan = hari/30;
    hari = hari%30;
    System.out.printf("%d tahun\n%d bulan\n%d hari", tahun,bulan,hari);

    return 1;
  }
}