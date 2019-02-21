import java.sql.SQLOutput;

public class zadanie3 {
    public static void main(String[] args) {

        //Napisz program który tworzy tablicę int 5 elementową i wyświetla na ekranie tylko najmniejszą
        // oraz największą z wartości tej tablicy np. .8 9 10 1 2 wynik na ekranie to 1 i 10

        String dlTablicyNapis = args [0];
        Integer dlTablicyLiczba = Integer.valueOf(dlTablicyNapis);

        int tablica[] = new int[dlTablicyLiczba];

        tablica[0] = 20;
        tablica[1] = 12;
        tablica[2] = 5;
        tablica[3] = 35;
        tablica[4] = 7;

        int najmniejszyElementTablicy = tablica [0];

        for (int indeksTablicy = 0; indeksTablicy < tablica.length; indeksTablicy++ ) {

            if (tablica[indeksTablicy] < najmniejszyElementTablicy) {

                najmniejszyElementTablicy = tablica[indeksTablicy];
            }
        }

        System.out.println(najmniejszyElementTablicy);



        int największyElementTablicy = tablica [0];

        for (int indeksTablicy = 0; indeksTablicy < tablica.length; indeksTablicy++) {

            if (tablica[indeksTablicy] > największyElementTablicy) {

                największyElementTablicy = tablica [indeksTablicy];

            }
        }

        System.out.println(największyElementTablicy);


        //wersja z jedną petlą

        najmniejszyElementTablicy = tablica [0];
        największyElementTablicy = tablica [0];

        for (int x = 0; x < tablica.length; x++ ) {

                if (tablica[x] < najmniejszyElementTablicy) {
                    najmniejszyElementTablicy = tablica [x];
                }

            if (tablica[x] > największyElementTablicy){
                największyElementTablicy = tablica [x];
            }
        }

        System.out.println(najmniejszyElementTablicy + " i " + największyElementTablicy);


    }
}
