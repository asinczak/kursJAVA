public class zadaniaMoje4 {
    public static void main(String[] args) {

        //W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający wyliczenie wysokości
        // miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
        //• cena towaru (od 100 zł do 10 tyś. zł),
        //• liczba rat (od 6 do 48).
        //Kredyt jest oprocentowany w zależności od liczby rat:
        //• od 6–12 wynosi 2.5% ,
        //• od 13–24 wynosi 5%,
        //• od 25–48 wynosi 10%.
        //Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien sprawdzać, czy podane
        // dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu pytać prosić użytkownika ponownie o
        // podanie danych.

        float miesięcznaRata = 0f;

        String dlTablicy = args [0];
        float cenaTowaru = Integer.valueOf(dlTablicy);

        String dlTablicy1 = args [1];
        int liczbaRat = Integer.valueOf(dlTablicy1);


        if (liczbaRat >= 6 & liczbaRat <= 12) {
            miesięcznaRata = (float) ((cenaTowaru * 0.025 + cenaTowaru) / liczbaRat);
            System.out.println("Miesięczna rata wynosi : " + miesięcznaRata);


        } else if (liczbaRat > 12 & liczbaRat <= 24) {
            miesięcznaRata = (float) ((cenaTowaru * 0.05 + cenaTowaru) / liczbaRat);
            System.out.println("Miesięczna rata wynosi : " + miesięcznaRata);


        } else if (liczbaRat > 24 & liczbaRat <= 48) {
            miesięcznaRata = (float) ((cenaTowaru * 0.1 + cenaTowaru) / liczbaRat);
            System.out.println("Miesięczna rata wynosi : " + miesięcznaRata);

        }



         if (cenaTowaru < 100 | cenaTowaru > 10000 | liczbaRat < 6 | liczbaRat > 48) {

           System.out.println("Podaj poprawne dane");
          }


    }
}
