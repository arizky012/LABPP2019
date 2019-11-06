import java.util.Scanner;
class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.printf("\nInput derajat (0 - 360) --> ");
            int menit = 0, detik = 0, jam = 0;
            while (input.hasNextFloat()) {
                float derajat = input.nextFloat();
                if (derajat >= 0 && derajat < 360) {
                    float x = derajat * 240;
                    int a = (int)x;
                    jam = (a / 3600) + 6;
                    if (jam > 23) {
                        jam = jam - 24;
                    }else {
                        jam = jam + 0;
                    }
                    menit = (a % 3600) / 60;
                    detik = (a % 3600) % 60;
                    System.out.println("");
                    if (a >= 0 && a < 14400) {
                        System.out.println("Selamat pagi");
                    }else if (a >= 14400 && a < 32400) {
                        System.out.println("Selamat siang");
                    }else if (a >= 32400 && a < 45000) {
                        System.out.println("Selamat sore");
                    }else if (a >= 45000 && a < 79200) {
                        System.out.println("Selamat malam");
                    }else {
                        System.out.println("Selamat pagi");
                    }
                }else {
                    System.out.println("Inputan tidak valid!");
                }
                System.out.printf("%02d : %02d : %02d \n", jam, menit, detik);
                System.out.printf("\nInput derajat (0 - 360) --> ");
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid!");
        }finally {
            input.close();
        }
    }
}