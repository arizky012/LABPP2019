import java.util.Scanner ;

class TugasLatihan2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        boolean c = a % b == 0 ;

        System.out.println("Apakah " + a + " kelipatan dari " +b+ " ? " +c);
    }
}