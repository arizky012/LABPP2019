import java.util.Scanner;
class modul4{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        try {
            
        System.out.println("Masukkan harga");
        int harga = ka.nextInt();
        System.out.println("Masukkan uang");
        int uang = ka.nextInt(); 
        ka.close();

        int kembalian = uang - harga;
        int sisa = kembalian;
        int seratusRibu = 0;
        int limaPuluhRibu = 0; 
        int duaPuluhRibu = 0;
        int sepuluhRibu = 0; 
        int limaRibu = 0;
        int duaRibu = 0;
        int seribu = 0;
        
        if(sisa<0){
            System.out.println("Uang tidak cukup");
        }else{
        while(sisa>0){
            while(sisa-100000 >=0){
                sisa-=100000;
                seratusRibu++;
            }
            while(sisa - 50000 >=0){
                sisa-=50000;
                limaPuluhRibu++;
            }while(sisa - 20000 >= 0){
                sisa -=20000;
                duaPuluhRibu++;
            }while(sisa - 10000 >=0){
                sisa -=10000;
                sepuluhRibu++;
            }while(sisa - 5000 >=0){
                sisa -=5000;
                limaRibu++;
            }while(sisa - 2000 >=0){
                sisa-=2000;
                duaRibu++;
            }while(sisa - 1000 >=0){
                sisa-=1000;
                seribu++;
            }
        }
        
        System.out.println(seratusRibu + " uang Rp. 100.000");
        System.out.println(limaPuluhRibu+ " uang Rp. 50.000");
        System.out.println(duaPuluhRibu + " uang Rp. 20.000");
        System.out.println(sepuluhRibu + " uang Rp. 10.000");
        System.out.println(limaRibu + " uang Rp. 5.000");
        System.out.println(duaRibu + " uang Rp. 2.000");
        System.out.println(seribu+ " uang Rp. 1.000");

        }    
        } catch (Exception e) {
           System.out.println("Inputan tidak valid");
        }
    }
}