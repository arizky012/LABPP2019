import java.util.*;

class Modul1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int n = inp.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i +1; j < n; j++) {
                    if(arr[j] % arr[i] != 0){
                        System.out.println(arr[i] + " " + arr[j]);  
                    }
                }
            }
            inp.close();
        } catch (InputMismatchException e) {
            System.out.println("input invalid");
        }
    }
}