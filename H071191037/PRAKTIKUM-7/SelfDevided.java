import java.util.*;

public class SelfDevided {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();
        
        ArrayList<Integer> hasil = new ArrayList<>();
        int digit;
        for(int i = a ; i <= b ; i++){
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
                    if(number.get(j) != 0 && value % number.get(j) == 0){
                        result ++;
                    }
                }
                //menambahkan jika bisa di bagi dengan semua digit
                if(result==key && value != 0){
                    hasil.add(value);
                }
            }
        System.out.print(hasil);
    }
}