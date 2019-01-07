public class PodsumowanieCwiczenia1 {
    public static void main(String[] args) {

        //ZADANIE: Napisz program który jako parametr przyjmie liczbę z zakresu 1-10.
        // Program ma stworzyć tablicę o wielkości podanej w
        //parametrze i zainicjalizować elementy tablicy kolejnymi liczbami zaczynając od 1.
        // Na przykład po podaniu cyfry 5, tworzy się tablica o długości 5 wypełniona elementami { 1 ,2 ,3 ,4 ,5 }

        int długośćTablicy = 5;

        int tablica [] = new int[długośćTablicy];


        int licznik = 0;
        int wartość = 1;

        while (licznik < długośćTablicy & wartość <= długośćTablicy) {
            tablica[licznik] = wartość;
            System.out.println("Tablica o długości "+ długośćTablicy + "zawiera " + wartość);
            licznik++;
            wartość++;

        }



    }
}


