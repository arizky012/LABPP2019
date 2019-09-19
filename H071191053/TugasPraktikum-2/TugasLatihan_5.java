import java.util.Scanner;

public class TugasLatihan_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
try {
        int jam1 = sc.nextInt();
        int menit1 = sc.nextInt();

        int jam2 = sc.nextInt();
        int menit2 = sc.nextInt();

        int durasiJam;
        int durasiMenit;


        if (jam2 > jam1){
            if (menit2 >= menit1){
                durasiJam = jam2 - jam1;
                durasiMenit = menit2 - menit1;

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            } else if (menit1 > menit2) {
                durasiJam = jam2 - jam1 - 1;
                durasiMenit = 60 - (menit1 - menit2);

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            } else {
                durasiJam = jam2 - jam1;
                durasiMenit = menit2 - menit1;
                
                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            }
        } 

        else if (jam1 > jam2){
            if (menit2 > menit1){
                durasiJam = 24 -(jam1 - jam2);
                durasiMenit = menit2 - menit1;

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            } else if(menit1 > menit2) {
                durasiJam = 24 - (jam1 - jam2) - 1;
                durasiMenit = 60 - (menit1 - menit2);

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            } else {
                durasiJam = 24 - (jam1 - jam2);
                durasiMenit = menit1 - menit2;

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            }
        }

        else {
            if (menit2 > menit1 ){
                durasiJam = (jam1 - jam2);
                durasiMenit = (menit2 - menit1);

                System.out.printf("%02d : %02d",durasiJam,durasiMenit);
            }  
            
            else if (menit2 < menit1){
                durasiJam = 24 - (jam1 - jam2) - 1;
                durasiMenit = 60 - (menit1 - menit2);

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            }

            else {
                durasiJam = 24 - (jam1 - jam2);
                durasiMenit = menit1 - menit2;

                System.out.printf("%02d : %02d", durasiJam, durasiMenit);
            }
        }
    } catch (Exception ime){
        System.out.println("error");
    } 





    }
}