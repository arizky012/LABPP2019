import java.util.Scanner;

class Genap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        int nilaia = input.nextInt();
        int nilaib = input.nextInt();
        int nilaic = input.nextInt();
        int nilaid = input.nextInt();
        int nilaie = input.nextInt();

        if (nilaia % 2 == 0) {
        genap++;
        if (nilaia >0) {
        positif++;
         } else if (nilaia<0){
         negatif++;
        }
        } else {
         ganjil++;
         if (nilaia> 0) {
        positif++;
        } else if (nilaia<0){
         negatif++;
        }
        }

        if (nilaib % 2 == 0) {
        genap++;
         if (nilaib >0) {
         positif++;
        } else if (nilaib<0){
         negatif++;
            }
        } else {
         ganjil++;
        if (nilaib> 0) {
         positif++;
        } else if (nilaib<0){
         negatif++;
        }
        }

        if (nilaic % 2 == 0) {
         genap++;
        if (nilaic >0) {
         positif++;
         } else if (nilaic<0){
         negatif++;
        }
        } else {
         ganjil++;
        if (nilaic> 0) {
        positif++;
        } else if (nilaic<0){
         negatif++;
       }
        }

        if (nilaid % 2 == 0) {
         genap++;
        if (nilaid >0) {
         positif++;
         } else if (nilaid<0){
         negatif++;
         }
        } else {
         ganjil++;
        if (nilaid> 0) {
         positif++;
         } else if (nilaid<0){
         negatif++;
        }
        }

        if (nilaie % 2 == 0) {
         genap++;
        if (nilaie >0) {
         positif++;
         } else if (nilaie<0){
         negatif++;
        }
        } else {
         ganjil++;
        if (nilaie> 0) {
        positif++;
        } else if (nilaie<0){
        negatif++;
        }
        }
        System.out.println(genap + " Bilangan Genap ");
        System.out.println(ganjil + " Bilangan Ganjil ");
        System.out.println(positif + " Bilangan Positif ");
        System.out.println(negatif + " Bilangan Negatif ");
            
        } catch (Exception e) { 
            System.out.println("inputan tidak valid");
            //TODO: handle exception
        }
        

    }

}
