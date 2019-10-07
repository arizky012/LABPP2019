import java.util.Scanner;

class PerulanganPrima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
try{
        int angka = sc.nextInt();
        sc.close();
        boolean prima = true;
        for (int pembagi = 2; pembagi <= angka / 2; pembagi++) {
            angka = angka % pembagi;
            if (angka == 0) {
                prima = false;

            }
        }

        if (prima && angka > 1 && angka != 0) {
            System.out.print("adalah bilangan prima");
        }
        else {
            System.out.print("adalah bukan bilangan prima");

        }
    }   catch (Exception e) {
        //TODO: handle exception
        System.out.println("Inputan Tidak Valid");
    }
}
}
