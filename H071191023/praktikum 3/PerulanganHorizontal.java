import java.util.Scanner;
class PerulanganHorizontal{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    try{

    int x=sc.nextInt();
    int y=sc.nextInt();
    sc.close();

    for(int i=0; i<y; i++){
      System.out.print(i+" ");
    if (i%x==0){
        System.out.println();
}
}
    } catch (Exception e) {
        //TODO: handle exception
        //tidak pada inputannyaso
        System.out.println("inputan tidak valid ");
    }
}
}