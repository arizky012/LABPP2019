import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//Modul No. 1
public class MovieOk {
    static Scanner ka = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, String> movieData = new HashMap<>();

        // Avenger: Endgame
        movieData.put(1, "Avenger: Endgame");
        movieData.put(2, "24 April 2019");
        movieData.put(3, "3 jam 1 menit");
        movieData.put(4, "Adventure, Sci-Fi, Action");
        movieData.put(5, "Google it!");
        movieData.put(6, "Robert Downey Jr., Chris Evans, Mark Ruffalo");

        // Spiderman
        movieData.put(7, "Spiderman: Far From Home ");
        movieData.put(8, "3 Juli 2019");
        movieData.put(9, "2 jam 9 menit");
        movieData.put(10, "Superhero, Sci-Fi, Action, Comedy");
        movieData.put(11, "Google it!");
        movieData.put(12, "Tom Holland, Samuel L. Jackson, Zendaya");

        // Venom
        movieData.put(13, "Venom");
        movieData.put(14, "3 Oktober 2018");
        movieData.put(15, "2 jam 20 menit");
        movieData.put(16, "Adventure, Horror, Action, Thriller");
        movieData.put(17, "Google it!");
        movieData.put(18, "Tom Hardy, Michelle Williams, Riz Ahmed, Scott Haze");

        // Thor: Ragnarok
        movieData.put(19, "Thor: Ragnarok");
        movieData.put(20, "25 Oktober 2017");
        movieData.put(21, "2 jam 10 menit");
        movieData.put(22, "Adventure, Comedy, Superhero, Action");
        movieData.put(23, "Google it!");
        movieData.put(24, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

        System.out.println("Favourite Movie");

        int a = 0;
        for (int i = 1; i <= movieData.size(); i++) {
            if (i % 6 == 1) {
                a++;
                System.out.println(a + ". " + movieData.get(i));
            }

        }

        try {

            int index;
            boolean cont = true;

            while (cont) {

                System.out.println("(d)Detail (s) Search (a) Add (r) Remove");

                String input = ka.next();

                switch (input) {
                case "d":
                    index = ka.nextInt();
                    if (index > 1) {
                        index = 5 * (index - 1) + index;
                    }
                    details(movieData, index);

                    break;

                case "s":
                    String find = LineScanner(ka);
                    findMovie(movieData, find);

                    break;

                case "a":

                    addMovie(movieData, ka);

                    break;

                case "r":

                    removeMovie(movieData, ka);

                    break;

                case "q":

                    cont = false;

                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");

                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }

    }

    static String LineScanner(Scanner ka) {
        String input;
        do {
            input = ka.nextLine();
        } while (input.equals(""));
        return input.trim();
    }

    static void details(HashMap<Integer, String> movieData, int index) {

        System.out.println("Judul       : " + movieData.get(index));
        System.out.println("Rilis       : " + movieData.get(index + 1));
        System.out.println("Durasi      : " + movieData.get(index + 2));
        System.out.println("Genre       : " + movieData.get(index + 3));
        System.out.println("Sinopsis    : " + movieData.get(index + 4));
        System.out.println("Cast        : " + movieData.get(index + 5));

        System.out.println();

    }

    static void findMovie(HashMap<Integer, String> movieData, String search) {

        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        int a = 0;
        for (int i = 1; i <= movieData.size(); i++) {
            if (i % 6 == 1) {
                a++;
                title.add(movieData.get(i));

            }

        }

        String k = search.toLowerCase();

        for (int j = 0; j < title.size(); j++) {
            String t = title.get(j);
            if (t.toLowerCase().indexOf(k) != -1)
                result.add(String.format("%d. %s", j + 1, t));

        }

        System.out.println("Hasil pencarian untuk \"" + search + "\":");

        if (result.size() == 0) {
            System.out.println("Data tidak ditemukan\n");
        } else {
            for (String m : result)
                System.out.println(m);
            System.out.println();

        }

    }

    static void addMovie(HashMap<Integer, String> movieData, Scanner ka) {

        int n = movieData.size();

        System.out.println("Judul :");
        movieData.put(n + 1, LineScanner(ka));
        System.out.println("Rilis :");
        movieData.put(n + 2, LineScanner(ka));
        System.out.println("Durasi :");
        movieData.put(n + 3, LineScanner(ka));
        System.out.println("Genre :");
        movieData.put(n + 4, LineScanner(ka));
        System.out.println("Sinopsis :");
        movieData.put(n + 5, LineScanner(ka));
        System.out.println("Cast :");
        movieData.put(n + 6, LineScanner(ka));

        int a = 0;
        for (int i = 1; i <= movieData.size(); i++) {
            if (i % 6 == 1) {
                a++;
                System.out.println(a + ". " + movieData.get(i));

            }

        }

    }

    static void removeMovie(HashMap<Integer, String> movieData, Scanner ka) {

        int index = ka.nextInt();
        if (index > 1) {
            index = 5 * (index - 1) + index;
        }

        int n = movieData.size();

        movieData.remove(index);
        movieData.remove(index + 1);
        movieData.remove(index + 2);
        movieData.remove(index + 3);
        movieData.remove(index + 4);
        movieData.remove(index + 5);

        HashMap<Integer, String> removed = new HashMap<Integer, String>();

        for (int i = 0; i <= n; i++) {

            if (movieData.get(i) != null) {
                removed.put(removed.size() + 1, movieData.get(i));

            }
        }

        movieData.clear();

        for (int i = 0; i < removed.size(); i++) {
            movieData.put(i + 1, removed.get(i + 1));

        }

        int a = 0;
        for (int j = 1; j <= movieData.size(); j++) {
            if (j % 6 == 1) {
                a++;
                System.out.println(a + ". " + movieData.get(j));

            }

        }

    }
}