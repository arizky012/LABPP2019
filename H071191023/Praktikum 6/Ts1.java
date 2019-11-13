import java.util.Scanner;
import java.util.Formatter;

class Ts1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String kata = sc.nextLine();
    try {

      // int kata=kata.length();
      String kata1 = kata.replaceAll("\\s+", "");// mengapus spasi atau tanpa spasi
      String kata2 = kata1.toUpperCase();// ke huruf bsr
      int katah = kata2.length();
      int hasil = katah / 2;// banyakya kata dibagi 2 sehingga mendapatkan hasil
      // for (int i = 0; i < kata1; i++) {

      String kata3 = kata2.substring(0, hasil);// 0 itu indeks dan hasil itu dari banyakx kata dibagi 2
      int kata4 = kata.length();

      for (int i = kata3.length() - 2; i >= 0; i--) {
        kata3 += kata3.charAt(i);
      }
      String hex = String.format("%x", kata4 * kata4);// persen x untuk string hex
      String oct = String.format("%o", kata4);
      String startCheck = hex.charAt(0) >= 'A' && hex.charAt(0) <= 'z' ? "?" : "!";
      System.out.println("#" + hex + kata3 + oct + startCheck);

    } catch (Exception e) {
      System.out.println("inputan tdk valid");
      // TODO: handle exception
    }
  }
}
