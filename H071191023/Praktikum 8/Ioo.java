import java.io.*;
import java.util.Scanner;

public class Ioo {
    static Scanner scan = new Scanner(System.in);

    // Atribut Database
    final static String[] ATTR = new String[] {"NIM", "Nama", "Jurusan", "Alamat"};

    // Nama Database
    final static String DBNAME = "data_mahasiswa.txt";

    public static void main(String[] args){

        for (boolean b = true ; b ;) {

            // Print Daftar Perintah
            System.out.print("\n1. Tambah Data\n2. Perbarui Data\n3. Hapus Data\n4. Tampilkan Daftar Mahasiswa\n5. Tampilkan Info Mahasiswa\n6. Keluar\ninput: ");

            // Input Perintah
            int a = scan.nextInt();

            try {
                switch (a) {

                // Menambah Data Mahasiswa
                case 1:
                    scan.nextLine();
                    add();
                    break;

                // Memperbaharui Data Mahasiswa
                case 2:
                    System.out.print("Index ke = ");
                    update(scan.nextInt() - 1);
                    break;

                // Menghapus Data Mahasiswa
                case 3:
                    System.out.print("Index ke = ");
                    delete(scan.nextInt() - 1);
                    break;

                // Menampilkan Data Mahasiswa
                case 4:
                    showList();
                    break;

                // Menampilkan Info Detail Mahasiswa
                case 5:
                    System.out.print("Index: ");
                    detail(scan.nextInt() - 1);
                    break;

                // Keluar dari Perulangan
                case 6:
                    b = false;
                    break;

                default:
                    System.out.println("Command undefined");
                }
            } 
            catch (IOException e){
                e.printStackTrace();
            }
            catch (IndexOutOfBoundsException ie){
                System.out.println("Tidak ada Data");
            }
        }
    }

    public static void update(int i) throws IOException {
        scan.nextLine();
        String dbtxt = read(DBNAME);
        if (!dbtxt.equals("")){
            String mhs ="";
            System.out.println("\nDaftar Mahasiswa: ");
            String[] arrOfStr = dbtxt.split("#");
            String[] before = arrOfStr[i].split(";");
            if(ATTR.length<i){
                System.out.println("Input data tidak ada");
                return;
            }
            for (int j = 0; j < ATTR.length; j++) {
                System.out.format("Update %s (sebelumnya %s) : ",ATTR[j],before[j]);
                mhs += scan.nextLine()+";";
            }
            String up = "";
            for(int j=0;j<arrOfStr.length;j++){
                up+=j!=i?arrOfStr[j]+"#\n":mhs+"#\n";
            }
            PrintWriter writer = new PrintWriter(DBNAME);
            writer.print("");
            writer.close();
            write(DBNAME, up);
        }	
    }

    public static void delete(int i) throws IOException {
        scan.nextLine();
        String dbtxt = read(DBNAME);
        if (!dbtxt.equals("")){
            String[] arrOfStr = dbtxt.split("#");
            if(ATTR.length<i){
                System.out.println("Input data tidak ada");
                return;
            }
            String up = "";
            for(int j=0;j<arrOfStr.length;j++){
            up+=j!=i?arrOfStr[j]+"#\n":"";
            }
            PrintWriter writer = new PrintWriter(DBNAME);
            writer.print("");
            writer.close();
            write(DBNAME, up);
        }	
    }

    public static void detail(int i) throws IOException {
        System.out.println("\nData Siswa Ke "+(i+1));
        String dbtxt = read(DBNAME);
        if (!dbtxt.equals("")){
            String[] list = dbtxt.split("#");
            String[] mhs = list[i].split(";");
            for (int j = 0; j < mhs.length; j++) {
                System.out.format("%-8s : %s\n",ATTR[j],mhs[j]);
            }
        } 
        else {
            System.out.println("Tidak ada Data");
        }
    }

    //update
    // Method Untuk Menambahkan Data Mahasiswa ke database

    public static void add() throws IOException {
        String mhs = "";

        // Menampilkan format input output
        // "nama attribut: input nilai attribut"
        for (int i = 0; i < ATTR.length; i++) {
            System.out.print(ATTR[i] + ": ");

            // Setiap input nilai attribut diakhiri dengan tanda ';'
            mhs += scan.nextLine()+";";
        }

        // String mahasiswa ditutup dengan tanda '#' dan baris baru
        mhs += "#\n";
        

        // String mahasiwa ditulis ke file dataMahasiswa.txt
        write(DBNAME, mhs);
    }

    // Method Untuk Menampilkan Daftar Mahasiswa

    public static void showList() throws IOException {
        String dbtxt = read(DBNAME);

        if (!dbtxt.equals("")){
            System.out.println("\nDaftar Mahasiswa: ");
            
            // Array string daftar mahasiswa
            // Memecah string dbtxt yang dipisahkan oleh tanda '#'
            String[] list = dbtxt.split("#");

            for (int i = 0; i < list.length; i++) {
                // Array string mahasiswa
                // Memecah string tiap elemen list yang dipisahkan oleh tanda ';'
                String[] mhs = list[i].split(";");
                System.out.println((i + 1) + ". " + mhs[1]);
            }
        } 
        else {
            System.out.println("Tidak ada Data");
        }
    }

    // Method Untuk Membaca Data dari file dataMahasiswa.txt

    public static String read(String name) throws IOException {
        File file = new File(name);
        String res = "";

        // Cek eksistensi file
        // Buat file baru jika file belum ada
        if (!file.isFile()){
            file.createNewFile();
        }
        else {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String str;
                while ((str = br.readLine()) != null) {
                    res += str;
                }
            } finally {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
        }
        return res;
    }

    // Method Untuk Menulis Data ke file dataMahasiswa.txt

    public static boolean write(String name, String text) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(name, true);
            fw.append(text);
        } finally {
            if (fw != null) {
                fw.close();
                return true;
            }
        }
        return false;
    }
}


