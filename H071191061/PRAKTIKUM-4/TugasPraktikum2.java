import java.util.Arrays;;
class TugasPraktikum2 {
    public static void main(String[] args) {
        char[] a = {'p','e','n','t','a'};
        char[] b = {'g','o','n'};
        char c;

// AWAL
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("\nA <--> B\n");

// SWIPE
        for (int i = 0; i < (a.length < b.length ? a.length : b.length); i++) {
            c = a[i];
            a[i] = b[i];
            b[i] = c;
        }

        System.out.print("A = {");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%s%s",a[i], i < a.length - 1 ? ",":"");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%s%s",b[i],i < b.length - 1 ? ",":"");
        }
        System.out.println();
    }
}f