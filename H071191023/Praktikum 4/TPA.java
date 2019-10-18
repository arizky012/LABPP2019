import java.util.Scanner;

class TPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          try {
        int panjang = sc.nextInt();
        int[] array = new int[panjang];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < panjang; i++) {
            for (int j = i + 1; j < panjang; j++) {
                if (array[i] % array[j] != 0 && array[j] % array[i] != 0) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
     } catch (Exception e) {
         System.out.println("inputan tidak valid");
            //TODO: handle exception

     }     
    }
}
