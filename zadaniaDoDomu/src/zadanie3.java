import java.sql.SQLOutput;

public class zadanie3 {
    public static void main(String[] args) {

        //Napisz program który tworzy tablicę int 5 elementową i wyświetla na ekranie tylko najmniejszą
        // oraz największą z wartości tej tablicy np. .8 9 10 1 2 wynik na ekranie to 1 i 10

        int tablica[] = new int[5];

        tablica[0] = 20;
        tablica[1] = 12;
        tablica[2] = 5;
        tablica[3] = 35;
        tablica[4] = 7;

        int najmniejszyElementTablicy = tablica [0];


        for (int indeksTablicy = 0; indeksTablicy < tablica.length; indeksTablicy++ ) {

            if (tablica[indeksTablicy] < najmniejszyElementTablicy);

            najmniejszyElementTablicy = tablica [indeksTablicy];
            System.out.println(najmniejszyElementTablicy);
        }







    }
}
