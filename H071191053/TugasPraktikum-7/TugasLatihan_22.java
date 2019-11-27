import java.util.Scanner;
import java.util.ArrayList;

public class TugasLatihan_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int finish = sc.nextInt();

        // masukkan ArrayList yang dari method ke ArrayList yang baru
        ArrayList<Integer> numb = selfDivided(start, finish);

        //print ArrayList nya
        System.out.println(numb);
        
    }
    
    // method untuk mencari nomor yang bisa di bagi dengan digit-digit dari dirinya sendiri
    static ArrayList<Integer> selfDivided(int a, int b) {
    
        // ArrayList untuk menyimpan "Self Divided Number"
        ArrayList<Integer> num = new ArrayList<>();
        //ArrayList untuk menyiman digit-digit dari bilangan yg mau dicek
        ArrayList<Integer> num1 = new ArrayList<>();
        // perulangan untuk mencari angka-angka "Self Divided"
        for (int j = a; j < b; j++) {
            num1.clear();
            // boolean untuk mengecek apakah digitnya mengandung 0
            boolean x = true;
            // int baru untuk menjadi pengganti angka yang mau di cek
            int i = j;
            //perulangan untuk menyimpan digit-digit bilangan pada ArrayList
            if (i > 0) {
                while(i > 0){
                    //untuk mengambil digitnya
                    int c = i%10;
                    //pengecekan apabila digit nya mengandung 0
                    if (c == 0) {
                        //ubah boolean menjadi false agar bisa dideteksi di luar
                        x = false;
                        //break agar membatalkan perulangan apabila ada 0
                        break;
                    }
                    //memasukkan bilangan ke ArrayList
                    num1.add(c);
                    //ubah bilangan 'i' menjadi bilangan sekarang karena digit sebelumnnya telah diambil
                    int d = i / 10;
                    i = d;
                }
            } else {
                while(i < 0){
                    //untuk mengambil digitnya
                    int c = i%10;
                    //pengecekan apabila digit nya mengandung 0
                    if (c == 0) {
                        //ubah boolean menjadi false agar bisa dideteksi di luar
                        x = false;
                        //break agar membatalkan perulangan apabila ada 0
                        break;
                    }
                    //memasukkan bilangan ke ArrayList
                   // num1.add(c);
                    //ubah bilangan 'i' menjadi bilangan sekarang karena digit sebelumnnya telah diambil
                    int d = i / 10;
                    i = d;
                }
            }
            
            //apabila mengandung 0 lanjut ke perulangan berikut nya
            if (x == false) {
                continue;
            }
            //perulangan untuk mengecek apakah bilangan 'j' bisa dibagi dengan semua digit-digit nya
            int e = 0;
            for (int k = 0; k < num1.size(); k++) {
                //apabila bilangan dapat dibagi dengan digit-digit nya maka bilangan 'e' di tambah
                if (j%num1.get(k) == 0){
                    e++;
                }
                //apabila jumlah digit sama dengan  bilangan 'e' berarti itu adalah bilangan self divided
                if (e == num1.size()){
                    num.add(j);
                }
            }
            //kosongkan ArrayList bila sudah dipakai agar bisa di pakai untuk mengecek bilangan selanjutnhya
        }
        return num;
    }
}
