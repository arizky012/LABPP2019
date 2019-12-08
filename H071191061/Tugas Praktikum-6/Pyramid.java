import java.util.*;

public class Pyramid{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();

        int sum = 1;
        //membuat tinggi segitiga
        for(int i=1 ; i<=input ; i++){
            //membuat spasi
            for(int k=input-i ; k>0 ; k--){
                System.out.print(" ");
            }
            //membuat bintang
            for(int j=1 ; j<=sum ; j++){
                System.out.print("* ");
            }
            sum+=1;
            System.out.print("\n");
        }
    }
}
