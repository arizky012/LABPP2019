import java.util.Scanner;
import java.util.Random;

class ModulNo2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    String serialNumber = generateSerial(n,m);
    System.out.println(serialNumber);
    scan.close();
  }
  public static String generateSerial(int x, int y){
    Random rand = new Random();
    String str="";
    for(int i = 0 ; i < x ; i++){
      for (int j = 0 ; j < y ; j++){
        str+=rand.nextInt(10);
      }
      if(i<x-1){
        str+="-";
      }
    }
    return str;
  }
}