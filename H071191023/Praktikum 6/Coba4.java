import java.util.Scanner;

class Coba4 {
	
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				 try{
				String name = in.nextLine();
				int tambah = in.nextInt();
		
				char [] nama = name.toCharArray();
				for (int i = 0; i < name.length(); i++) {
					
				   // System.out.print(nama[i]);
					if (nama[i] >= 'A' && nama[i] <= 'Z'){
						nama[i] = (char) (Math.floorMod(nama[i]- 'A' + tambah , 26) + 'A');
					}else if(nama[i] >= 'a' && nama[i] <= 'z'){
						 nama[i] = (char) (Math.floorMod(nama[i]- 'a' + tambah , 26) + 'a');
					}
				}
				System.out.println(new String(nama)); 
				
		} catch (Exception e) {
			System.out.println("inputan tdk valid");
			// TODO: handle exception
		}
	}
}
