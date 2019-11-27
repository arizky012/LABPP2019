import java.io.*;

 class TugasLatihan_23 {
    public static void main(String[] args) {
        FileInputStream real = null;
        FileOutputStream copy = null;
        try {
            real = new FileInputStream ("real.txt");
            copy = new FileOutputStream ("copy.txt");
            int data;
            while((data = real.read()) != -1){
                copy.write(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                if (real != null) {
                    real.close();
                    System.out.println("real.txt telah 'close'");
                }
                if (copy != null) {
                    copy.close();
                    System.out.println("copy.txt telah 'close'");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (real != null || copy != null) {
                    System.out.println("berhasil");
                } else {
                    System.out.println("gagal");
                }
            }
        }

        
    }
}