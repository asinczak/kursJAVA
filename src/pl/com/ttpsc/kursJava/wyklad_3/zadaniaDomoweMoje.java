public class zadaniaDomoweMoje {

    public static void main(String[] args) {

     //   Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu.
        //   W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie
        //   powiadomienia "Witaj imie_z_tablicy" dla każdego z podanych parametrów.

        String imiona [] = new String [5];

        imiona [0] = "Basia";
        imiona [1] = "Ola";
        imiona [2] = "Tomek";
        imiona [3] = "Jaś";
        imiona [4] = "Kasia";

        for (int i = 0; i < imiona.length; i++) {

            System.out.println( "Witaj " + imiona[i]);
        }


        // Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a na-
        //stępnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
        //podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
        //15.


        String dlTablicy = args [0];
        int liczbaCalkowita = Integer.valueOf(dlTablicy);


        for (int i = 1; i < liczbaCalkowita; i++) {

            if (i % 2 == 1) {
                System.out.println(i);

            }
        }


    }
}
