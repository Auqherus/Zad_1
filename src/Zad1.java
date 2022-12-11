import java.time.LocalDate;
import java.util.*;

public class Zad1 {

    public static void main(String[] args) {
        Note diary = new Note();
        Boolean end = false;
        Date time = new Date();
        Scanner TryMe = new Scanner(System.in);
        int i = 0;

        System.out.println(time.getYear() );
        while (i < 4) {
            Boolean checkMe = true;

            System.out.println("Lista notatek \n Co chcesz zrobić?");
            System.out.println();
            System.out.println("1. Wyświetl listę. \n2. Dodaj element do listy. \n3. Usuń element listy. \n4. Wyszukaj element. \n5. Wyjście.");
            System.out.println(i = TryMe.nextInt());

            if (i == 1) {
                System.out.println("Wyświetlam listę :");
                System.out.println(diary.canModif);
                System.out.println();
            }
            if (i == 2) {
                System.out.println("Wpisz elementy do dodania. Wciśnij X, by zakończyć dodawnie.");
                while (checkMe == true) {
                    String word = TryMe.next();
                    if (word.equals("x") || word.equals("X")) {
                        checkMe = false;
                    } else
                        diary.AddNote(word, time );
                }
            }

            if (i == 3) {
                System.out.println("Wpisz elementy do usunięcia. Wciśnij X, by zakończyć dodawnie.\"");
                while (checkMe == true) {
                    String word = TryMe.next();
                    if (word.equals("x") || word.equals("X")) {
                        checkMe = false;
                    } else
                        diary.RemoveNote(word);
                }
            }
            if (i == 4) {
                System.out.println("Wpisz nazwę elementu do wyszukania z listy. Wciśnij X, by zakończyć wyszukiwanie.\"");
                while (checkMe == true) {
                    String word = TryMe.next();
                    if (word.equals("x") || word.equals("X")) {
                        checkMe = false;

                    } else

                        diary.SearchNote(word);
                }

            }

            if(i>5 || i <1){
                System.out.println("Błędna wartość.");
                i = 0;
                System.out.println();
            }

            if (i == 5) {
                System.out.println("Koniec Programu!");
                break;
            }
        }
    }


     static class Note {
        String autor;
         String text;
         LocalDate date;

         String[]  Note1 = {"Car", "Plane", "Water", "Computer", "Glass", "Newspaper"};
         List<String> canModif = new ArrayList<>(List.of(Note1));


    public void CreateNote(){

        Scanner NumberofNotes = new Scanner(System.in);
        System.out.println("Podaj nazwę listy :");
        String n = NumberofNotes.next();

        for (int i = 0; i < 10; i++) {
            String[]  Note1 = {"Car", "Plane", "Water", "Computer", "Glass", "Newspaper"};
            List<String> canModif = new ArrayList<>(List.of(Note1));

        }



    }

        public Note() {

             String [] notes =  new String [10];

        }
        /*public void AddTime(Date time){
            time.before(time);
            time.after(time);
        }*/


        public void AddNote(String add, Date time) {


            canModif.add(add);
            System.out.println(canModif);
            System.out.println();
            }
        public void RemoveNote(String delete) {
            canModif.remove(delete);
            System.out.println(canModif);
            System.out.println();
        }

        public void SearchNote(String word){
            // System.out.println(canModif.contains(word));
            if(canModif.contains(word) == true){
                System.out.println(word);
            }
            else
            System.out.println("Brak wyrazu w słowniku");

        }


}
}



