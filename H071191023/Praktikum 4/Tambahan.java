import java.util.*;
class Tambahan{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int total[] = {0, 0, 0};
        int berhasil[] = {0, 0, 0};
        int N = n.nextInt();
        
        for (int i = 0; i < N; i++){
            String nama = n.next();
            int totalSBS[] = {0, 0, 0};

            for (int j = 0; j < 3; j++){
                totalSBS[j] = n.nextInt();
                total[j] += totalSBS[j];
            }
            for (int j = 0; j < 3; j++){
                int k = n.nextInt();
                if (k > totalSBS[j]){
                    System.out.println("input" + nama);
                    return;
                }
                berhasil[j] += k;
            }
        }
        double persentaseServis = berhasil[0]*100.0 / (total[0]*1.0);
        double persentaseBlock = berhasil[1]*100.0 / (total[1]*1.0);
        double persentaseSmash = berhasil[2]*100.0 / (total[2]*1.0);
        System.out.printf("Servis : %.2f%%\n", persentaseServis);
        System.out.printf("Block : %.2f%%\n", persentaseBlock); 
        System.out.printf("Smash : %.2f%%\n", persentaseSmash);   
    }
}