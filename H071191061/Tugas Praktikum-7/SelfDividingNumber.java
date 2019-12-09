import java.util.*;

public class SelfDividingNumber{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int batasBawah = a > b ? b : a ;
        int batasAtas = a > b ? a : b ;

        ArrayList<Integer> hasil = new ArrayList<>();
        int digit;
        for(int i=batasBawah ; i<=batasAtas ; i++){
            HashMap <Integer, Integer> number = new HashMap<>();
            int value = i;
            int key = 0;
                //menentukan digit
                while(Math.abs(value)>0){
                    digit = Math.abs(value)%10;
                    value = Math.abs(value)/10;
                    number.put(key, digit);
                    key++;
                }
                //mengecek pembagian digit
                value = i;
                int result = 0;
                for(int j=0 ; j<number.size() ; j++){
                    if(number.get(j) != 0 && value%Math.abs(number.get(j)) == 0){
                        result ++;
                    }
                }
                //menambahkan jika bisa di bagi dengan semua digit
                if(result==key && value != 0){
                    hasil.add(value);
                }
            }
            if(a > b){
                //membalik hasil apabila angka kedua lebih kecil dari angka pertama
                Collections.reverse(hasil);
                System.out.print(hasil);
            }else{
                System.out.print(hasil);
            }
    }
}
