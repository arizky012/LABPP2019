import java.util.*;

class SerialNumber{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            int m = inp.nextInt();
            inp.close();
            String serialNumber = generateSerial(n,m);
            System.out.println(serialNumber);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
    public static String generateSerial (int n,int m) {
        String str = "";
        Random number = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = number.nextInt(10);
                str += a;
            }
            if(i < (n-1)){
                str+= "-";
            }
        }
        return str;
    }
}