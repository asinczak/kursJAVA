package pl.com.ttpsc.kursJava.wyklad_5;
//ZADANIE 4:
//Program przyjmuje ciąg liczb (dowolnej długości). Program posiada klasę Liczba reprezentującą pojedynczą liczbę.
//a.      Program ma stworzyć tablicę o długości równej długości przekazanego ciągu
//b.      Tablica ma być typu Liczba
//c.      Każdy obiekt typu liczba w tablicy przechowuje jedną z liczb z przekazanego ciągu
//d.      Klasa Liczba ma mieć metodę zmienZnak, która wymnaża liczbę reprezentowaną przez dany obiekt przez -1
//e.      Program ma za zadania wykonać metodę zmienZnak na wszystkich obiektach w tablicy a wynik wypisać na ekranie



public class Liczba {

    int liczba;

    Liczba (int x) {
        this.liczba = x;
    }

    void zmienZnak () {
       this.liczba = this.liczba * -1;

    }

}
