package pl.com.ttpsc.kursJava.wyklad_5;

// Program posiada klasę Ksztalt. Obiekt klasy Ksztalt można stworzyć podając argument będący nazwą kształtu
// (tylko jeden )np.: trójkąt, koło, kwadrat. Kształty wybierane są losowo
//a.      Program przyjmuje jako parametr liczbą. Liczba określa ile obiektów typu Kształt ma być stworzonych.
//b.      Klasa Kształ ma mieć możliwość zliczania ilości stworzonych obiektów
//c.      Liczba stworzonych obiektów ma być wypisana na ekran
//d.      Dodatkowe utrudnienie dla chętnych J Do ogólnej ilości obiektów mają nie być wliczane koła

public class Ksztalt {

    String ksztalt;
    static int libczaObiektow;
    int liczba;

    Ksztalt (String ksztalt) {
        this.ksztalt = ksztalt;
        if (this.ksztalt != "kolo") {
        libczaObiektow++;}
    }

    static int zliczanieObiektow (){
        return libczaObiektow;
    }


}
