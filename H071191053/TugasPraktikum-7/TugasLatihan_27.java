import java.util.*;

class TugasLatihan_27 {
    public static List<String> movieList = new ArrayList<String>();
    public static Map<String, String> movieMap = new HashMap<String, String>();
    public static Scanner input = new Scanner(System.in);
    public static boolean check = true;

    public static void main(String[] args) {
        if (check) {
            System.out.println("\nList kosong. Silahkan tambahkan Film");
            getAll();
        }
        
        String i = input.nextLine();
        if (i.equals("a")) {
            add();
            getAll();
        } else if (i.equals("d")) {
            getDetail(input.nextInt()-1);
            getAll();
        } else if (i.equals("r")) {
            movieList.remove(input.nextInt()-1);
            getAll();
        } else if (i.equals("s")) {
            searchList();
            getAll();
        }
        check = false;
        main(args);
    }

    public static void getAll() {
        for (int i = 0;i < movieList.size(); i++) {
            System.out.println((i+1) + ". " + movieList.get(i));
        }
        System.out.println("(d) Detail\t (s) Search \t (a) Add\t (r) Remove");
    }

    public static void add() {
        System.out.print("Judul :");
        String title = input.nextLine();
        movieList.add(title);
        System.out.print("Rilis :");
        String detail = input.nextLine() + "@";
        System.out.print("Durasi :");
        detail += input.nextLine()+"@";
        System.out.print("Genre :");
        detail += input.nextLine()+"@";
        System.out.print("Sinopsis :");
        detail += input.nextLine()+"@";
        System.out.print("Cast :");
        detail += input.nextLine()+"@";
        movieMap.put(title, detail);
    }

    public static void getDetail(Integer i) {
        String title = movieList.get(i);
        String[] detail = movieMap.get(title).split("@");
        System.out.println("Rilis : "+detail[0]);
        System.out.println("Durasi : "+detail[1]);
        System.out.println("Genre : "+detail[2]);
        System.out.println("Sinopsis : "+detail[3]);
        System.out.println("Cast : "+detail[4]);
    }

    public static void searchList() {
        Boolean found;
        String word = input.nextLine();
        for (int i = 0; i < movieList.size(); i++) {
            String text = movieList.get(i);
            found = text.contains(word);
            if (found) {
                System.out.println((i+1) + ". " + movieList.get(i));
            }
        }
    }
}