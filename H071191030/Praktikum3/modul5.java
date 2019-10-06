import java.util.Scanner;

class modul5 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {

            float derajat = ka.nextFloat();

            // 240 detik = 1 derajat
            int hasil = (int) (derajat * 240);
            int jam = ((int) hasil / 3600) + 6;
            int menit = (hasil % 3600) / 60;
            int detik = (hasil % 3600) % 60;
            int waktu;
            ka.close();

            if (derajat < 0) {
                System.out.println("Inputan tidak valid");
            } else {
                while (jam > 0) {
                    if (jam >= 12 && jam < 15) {
                        System.out.println("Selamat siang");
                    } else if (jam >= 16 && jam < 18) {
                        System.out.println("Selamat sore");
                    } else if (jam >= 18 && jam <= 24) {
                        System.out.println("Selamat malam");
                    } else {
                        System.out.println("Selamat pagi");
                    }
                    break;
                }

                if (jam >= 24) {
                    waktu = jam - 24;
                    System.out.printf("%02d:%02d:%02d", waktu, menit, detik);
                } else {
                    System.out.printf("%02d:%02d:%02d", jam, menit, detik);
                }
            }

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}
