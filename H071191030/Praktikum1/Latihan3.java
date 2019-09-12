import java.util.Scanner;
public class Latihan3 {
public static void main(String[] args) {
    Scanner ka = new Scanner(System.in);
    int a = ka.nextInt();
    int b = ka.nextInt();
    ka.close();
    boolean kelipatan = a%b==0;
    
    System.out.println("Apakah " + a + " kelipatan dari " +b+ "? " + kelipatan );
}
    
}