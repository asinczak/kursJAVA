package pl.com.ttpsc.kursJava.wyklad_6;

// Stwórz klasę Reprezentującą ogólną figurę geometryczną oraz klasy Kwadrat, Trojkat i Trapez dziedziczące po klasie Figura
// a.      Klasa Figura ma mieć metodę do obliczania pola figury, każda z klas pochodnych powinna na swój sposób tę metodę implementować
// b.      Klasa figura ma mieć możliwość zliczania wszystkich obiektów kształtów jakie zostaną stworzone

abstract class Figura {

    int dlBokuA;
   static int licznikObiektow;


    public Figura () {
        this.licznikObiektow++;
    }

    abstract double obliczPoleFigury ();

}
