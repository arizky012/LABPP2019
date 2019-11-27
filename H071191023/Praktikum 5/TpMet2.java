import java.util.Random;//Kelas random tidak hanya menghasilkan angka acak yang benar-benar acak, namun random di sini berarti peluang angka yang muncul di setiap kesempatan haruslah sama. 
import java.util.Scanner;
class TpMet2{
public static void main(String[] args) {
    Scanner sam = new Scanner(System.in);
    try{
    int n = sam.nextInt();
    int m = sam.nextInt();
    String serialnumber= generateSerial(n,m);
    System.out.println(serialnumber);
} catch (Exception e) {
  System.out.println("non valid");
    }
}
    
public static String generateSerial(int n, int  m) {
    String  str= "";
    int i;
    Random key = new Random();
    

    for ( i = 0; i <n; i++) {
        for (int j = 0; j < m; j++) {
            int z =key.nextInt(10);
            str+=z;
          }
          if(i<(n-1)){
          
              str+="-";
        }

            
        }
        return str;
        }
    }


