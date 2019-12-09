import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyMovie {
    static Scanner userInput = new Scanner(System.in);
    static int key = 1;

    public static void main(String[] args) {
        ArrayList <HashMap> films = new ArrayList<>();
        boolean next = false;
        do {
            System.out.println("\t\tFavourite Movie ");
            menu(films);
            System.out.println("Do you want to close ? y/n");
            String out = userInput.next();
            if (out.equalsIgnoreCase("n")) {
                next = true;
            } else {
                next = false;
            }
        } while (next);
    }

    static void menu(ArrayList <HashMap> films) {
        list(films);
        System.out.println("(d)Details \t (s)Search \t (a)Add \t (r)Remove ");
        System.out.print(">");
        String choice = userInput.next();
        if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A') {
            addFilm(films);
        } else if (choice.charAt(0) == 'd' || choice.charAt(0) == 'D') {
            int number = userInput.nextInt();
            detailFilm(films, number);
        } else if (choice.charAt(0) == 's' || choice.charAt(0) == 'S') {
            String choice_2 = userInput.next();
            searchFilm(films, choice_2);
        } else if (choice.charAt(0) == 'r' || choice.charAt(0) == 'R') {
            int number = userInput.nextInt();
            removeFilm(films, number);
        }
    }

    static void list(ArrayList <HashMap> films) {
        if (films.size() <= 0) {
            System.out.println("film masih kosong!");
        } else {
            for (int i = 0; i < films.size(); i++) {
                System.out.println((i + 1) + ". " + films.get(i).get("judul"));
            }
        }
    }

    static void removeFilm(ArrayList <HashMap> films, int index) {
        if (films.size() == 0 || index-1 >= films.size()) {
            System.out.println("film masih kosong -_- !");
            return;
        }
        index--;
        System.out.println("Succesfully removed "+ "'" + films.get(index).get("judul") + "'" + " from list");
        films.remove(index);
        list(films);
    }
    static void addFilm(ArrayList <HashMap> films) {
        userInput.nextLine();
        System.out.print("Judul \t: ");
        String title = userInput.nextLine();
        System.out.print("Rilis \t: ");
        String rilis = userInput.nextLine();
        System.out.print("Durasi \t: ");
        String durasi = userInput.nextLine();
        System.out.print("Genre \t: ");
        String jenre = userInput.nextLine();
        System.out.print("Cast \t: ");
        String pemeran = userInput.nextLine();
        System.out.print("Sinopsis: ");
        String synopsis = userInput.nextLine();

        HashMap<String, String> film = new HashMap<>();
        film.put("judul", title);
        film.put("rilis", rilis);
        film.put("durasi", durasi);
        film.put("genre", jenre);
        film.put("cast", pemeran);
        film.put("sinopsis", synopsis);

        films.add(film);

        System.out.println();
        System.out.println("'" + film.get("judul") + "'" + " Berhasil ditambahkan");
        list(films);
        key++;

    }

    static void detailFilm(ArrayList <HashMap> films, int index) {
        index--;
        if (films.size() == 0 || index >= films.size()) {
            System.out.println("film masih kosong -_- !");
        } else {
            System.out.println("Judul \t : " + films.get(index).get("judul"));
            System.out.println("Rilis \t : " + films.get(index).get("rilis"));
            System.out.println("Durasi \t : " + films.get(index).get("durasi"));
            System.out.println("Genre \t : " + films.get(index).get("genre"));
            System.out.println("Cast \t : " + films.get(index).get("cast"));
            System.out.println("Sinopsis : " + films.get(index).get("sinopsis"));
        }
    }

    static void searchFilm(ArrayList<HashMap> films, String choice_2) {
        boolean condition2 = false;
        for (int i = 0; i < films.size(); i++) {
            //String sentence = String.valueOf(films.get(i).get("judul"));  //Mengubah object ke string cara 1
            String sentence = films.get(i).get("judul").toString();         //Mengubah object ke string cara 2
            if (sentence.contains(choice_2.substring(0, choice_2.length())) && choice_2.length() > 1 || sentence.contains(choice_2.substring(0)) && choice_2.length() == 1) {
                System.out.println((i + 1) + ". " + films.get(i).get("judul"));
                condition2 = true;
            }
        }
        if (condition2 == false) {
            System.out.printf("There is no '%s' on list.\n", choice_2.substring(0, choice_2.length()));
        }
    }
}
