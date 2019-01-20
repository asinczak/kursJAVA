public class zadaniaMoje3 {
    public static void main(String[] args) {

        // Napisać program, który wczytuje liczbę całkowitą dodatnią n, a
        //następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.

        String dlTablicy = args [0];
        int liczbaCalkowita = Integer.valueOf(dlTablicy);
        int wynik = 1;


        while ( wynik < liczbaCalkowita) {

            System.out.println(wynik);
            wynik = wynik * 2;

        }

    }
}
