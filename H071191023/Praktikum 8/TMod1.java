import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class TMod1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            String inp1 = input.nextLine() + ".txt";
            String inp2 = input.nextLine() + ".txt";
            input.close();
            in = new FileInputStream(inp1);
            out = new FileOutputStream(inp2);
            int ready = in.read();

            while (ready != -1) {
                out.write(ready);
                ready = in.read();

            }
            System.out.print("berhasil");
        } catch (Exception e) {
           // System.out.println(e.getMessage());
            System.out.print("gagal");

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
