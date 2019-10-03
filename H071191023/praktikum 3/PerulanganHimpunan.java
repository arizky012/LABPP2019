import java.util.Scanner;
class PerulanganHimpunan{
	public static void main(String[] args) {
		Scanner iu = new Scanner(System.in);
		try{

		int a = 0, b = 1;
		int x = iu.nextInt();
		iu.close();
		if (x <= 0) {
			System.out.println("cetak himpunan angka");
			return;
		}
    
		for (int i = 0; i < x; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
            b = c;
		}
	}   catch (Exception e) {
		//TODO: handle exception
		System.out.println("Inputan Tidak Valid");
		
    }
}
}