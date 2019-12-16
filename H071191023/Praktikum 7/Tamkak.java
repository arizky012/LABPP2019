import java.util.*;

class Tamkak{

    
        public static void main(String[] args) {
            //inpurt batas
            Scanner ok = new Scanner (System.in);
            System.out.println("PROGRAM MENCARI BILANGAN YANG BISA DIBAGI DIGITNYA");
            int angka1 = ok.nextInt();
            int angka2 = ok.nextInt();
            System.out.println("BATAS ATAS ");
            System.out.println("BATAS BAWAH ");
            
            System.out.printf("BILANGAN YANG BISA DIBAGI DIGITNYA DARI (%d) SAMPAI (%d) ADALAH : \n",angka1,angka2);
            int digit;
            ArrayList<Integer>hasil=new ArrayList<>();
            //menentukan mana batas
            int batasBawah = angka2>angka1?angka1:angka2;
            int batasAtas = angka2>angka1?angka2:angka1;
            //perulangan membagi dengan digit
            for(int angka=batasBawah;angka<=batasAtas;angka++){
                HashMap<Integer, Integer> number = new HashMap<>();
                //menentukan digit
                int k1 = angka;
                int nilai = 0;
                //math abs digunkn mengembalikan nila mutlak dr sebuah bil
                while(Math.abs(k1)>0){
                    digit = Math.abs(k1)%10;
                    k1 = Math.abs(k1)/10;
                    number.put(nilai,digit);// hashmap
                    nilai++;
                }
                k1=angka;
                int digitbenar = 0;
                //mengecek pembagian digit
                for(int k=0;k<number.size();k++){
                    if(number.get(k)!=0&&k1%Math.abs(number.get(k))==0){
                        digitbenar++;
                    }
                }
                //menambahkan jika bisa dibagi dengan digit
                if(digitbenar==nilai){
                    hasil.add(k1);
                }
            }//menukar output jika inputnya tertukar
            if(angka1>angka2){
                Collections.reverse(hasil);
                System.out.print(hasil);
            }
            else{
                System.out.print(hasil);
            }
            
        }
    }