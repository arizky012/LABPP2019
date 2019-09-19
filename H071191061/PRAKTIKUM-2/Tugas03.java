import java.util.Scanner;
class Tugas03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input x dan y : ");
            int x = input.nextInt();
            int y = input.nextInt();
            double a = Math.sqrt(25), b = Math.sqrt(144), c = Math.sqrt(400);
            double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            System.out.println(" ");
            
            if (r < a){
                System.out.println("Titik berada di dalam lingkaran a");
            }else if (r == a){
                System.out.println("Titik pada lingkaran a");
            }else if (r > a && r < b){
                System.out.println("Titik berada di dalam lingkaran b");
            }else if (r == b){
                System.out.println("Titik pada lingkaran b");
            }else if (r > b && r < c){
                System.out.println("Titik berada di dalam lingkaran c");
            }else if (r == c){
                System.out.println("Titik pada lingkaran c");
            }else {
                System.out.println("Titik berada di luar lingkaran a, b, dan c");
            }    
        } catch (Exception e) {
            System.out.println("\nInputan tidak valid!");
        }
        
        input.close();
    }
}