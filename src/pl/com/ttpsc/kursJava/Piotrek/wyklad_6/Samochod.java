package pl.com.ttpsc.kursJava.Piotrek.wyklad_6;

public class Samochod extends Pojazd {

    Samochod() {
        //konstruktor klasy bazowe zawsze jest wywolywany jako pierwsza instrukcja w konstruktorze
        //klasy pochodnej (dziedziczacej). Jesli tego jawnie nie zrobimy poprzez uzycie super
        //Java sama nam go dostawwi - kolejne domyslne zachowanie
        super();
        System.out.println("Tworze samochod");
    }

    //nadpisanie metody z klasy bazowej Pojazd. W ten sposob mozemy zmieniac lub dodawac
    //kod (zachowania) specyficzne dla klasy potomnej
    @Override
    public void poruszajSie() {
        //uzywajac slowa kluczowego super mozemy odwolywac sie do atrybutow i metod klassy bazowej
        super.poruszajSie();
        System.out.println("Samochod: Uruchomilem silnik");

        //nie mozemy dobrac sie do atrybutow prywatnych z klasy bazowej
//        System.out.println("Jestem koloru " + kolor);

        //co innego w przypadku publicznych, tutaj nie ma zadnego problemu
        System.out.println("Jade z predkoscia " + predkosc);
    }
}
