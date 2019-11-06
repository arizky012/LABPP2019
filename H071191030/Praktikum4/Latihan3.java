import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        try {
            Scanner ka = new Scanner(System.in);
            
            int n = ka.nextInt();
            int data1[] = new int[n];
            int sum = 0;
            int a = 0;
    
            for (int i = 0; i < data1.length; i++) {
                data1[i] = ka.nextInt();
                sum += data1[i];
            }
    
            int m = ka.nextInt();
            int data2[] = new int[m];
            
            for (int j = 0; j < data2.length; j++) {
                data2[j] = ka.nextInt();
                sum += data2[j];
            }

            for (int i = 0; i < data1.length; i++) {
                for (int j = 0; j < data2.length; j++) {
                    if (data1[i] == data2[j]) {
                        a+= data1[i];
                    }  
                }
            }
            ka.close();
            System.out.println((sum-a));
    
            
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}
