import java.util.Scanner;

class DurasiWaktu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jam1 = in.nextInt();
        int menit1 = in.nextInt();
        int jam2 = in.nextInt();
        int menit2 = in.nextInt();
        int durasiJam , durasiMenit;
        in.close();
        if (jam2 <= 24 && jam1 <= 24) {
            if (jam2 > jam1) {
                if (menit2 <= 60 && menit1 <= 60) {
                    if (menit2 >= menit1) {
                        durasiJam = jam2 - jam1;
                        durasiMenit = menit2 - menit1;
                        System.out.printf("%02d : %02d ", durasiJam , durasiMenit);
                    } else if (menit1 >= menit2) {
                        durasiJam = jam2 - jam1-1;
                        durasiMenit = 60-(menit1 - menit2);
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit);
                    }    
                } else {
                    System.out.println("Inputan Anda Salah");
                }    
            } else if (jam2 < jam1) {
                if (menit2 <= 60 && menit1 <= 60) {
                    if (menit2 >= menit1) {
                        durasiJam = 24 - (jam1-jam2);
                        durasiMenit = menit2 - menit1;
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit);
                    } else if (menit2 <= menit1) {
                        durasiJam = 23 - (jam1-jam2);
                        durasiMenit = 60 - (menit1 - menit2);
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit);
                    }
                } else {
                    System.out.println("Inputan Anda Salah");
                }
            } else if (jam1 == jam2) {
                if (menit2 <= 60 && menit1 <=60) {
                    if (menit1 > menit2) {
                        durasiJam = 24-(jam2-jam1);
                        durasiMenit = 60 - (menit1-menit2);
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit);
                    } else if (menit1 < menit2) {
                        durasiJam = jam2-jam1;
                        durasiMenit = menit2-menit1;
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit); 
                    } else if (menit1==menit2) {
                        durasiJam = 24;
                        durasiMenit = 00;
                        System.out.printf("%02d : %02d ", durasiJam, durasiMenit);
                    }
                } 
            }  
        } else {
            System.out.println("Inputan Anda Salah");
        }
    }
}