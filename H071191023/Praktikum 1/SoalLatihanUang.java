import java.util.Scanner;
class SoalLatihanUang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uang= Math.max(sc.nextInt(),0);
        sc.close();

        int u1 =100000;
        int u2 = 50000;
        int u3 = 20000;
        int u4 =10000;
        int u5 = 5000;
        int u6 =2000;
        int u7 = 1000;

        int uang1= uang/u1;
        int sisa1= uang%u1;

        int uang2 = sisa1/u2;
        int sisa2 = sisa1%u2;

        int uang3 = sisa2/u3;
        int sisa3 = sisa2%u3;

        int uang4= sisa3/u4;
        int sisa4 = sisa3%u4;

        int uang5= sisa4/u5;
        int sisa5= sisa4%u5;
        
        int uang6 = sisa5/u6;
        int sisa6 = sisa5%u6;
        
        int uang7 = sisa6/u7;
        int sisa7 = sisa6%u7;
   
      
int uang01 =uang/u1;
int sisa01 = uang%u1;

int uang02 =sisa1/u2;
int sisa02 = sisa1%u2;

int uang03= sisa2/u3;
int sisa03 = sisa2%u3;

var uang04 =sisa3/u4;
int sisa04 = sisa3%u4;

int uang05 =sisa4/u5;
int sisa05 = sisa4%u5;

int uang06= sisa5/u6;
int sisa06 = sisa5%u6;

int uang07= sisa6/u7;
int sisa07=sisa6/u7;

System.out.println("jumlah uang 10000:"+uang1);
System.out.println("jumlah uang 5000:"+uang2);
System.out.println("jumlah uang 2000:"+uang3);
System.out.println("jumlah uang 10000:"+uang4);
System.out.println("jumlah uang 5000:"+uang5);
System.out.println("jumlah uang 2000:"+uang6);
System.out.println("jumlah uang 1000:"+uang7);
    }
}