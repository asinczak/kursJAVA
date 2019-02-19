package pl.com.ttpsc.kursJava.wyklad_9;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TestEnum  extends Object{


    public static void main(String[] args) {
        //pozyskiwanie enuma z metody valueOf - mozliwosc podania klasy typu wiliczeniowego i jego wartosci jak String
        PoryRoku poraRoku = Miesiace.valueOf(PoryRoku.class, "ZIMA");

        //metoda valueOf tylko z parametrem repreentujacym wartosc, zwroci wartosc stalej z enuma na ktorym jest wywolana, w tym przypadku enum = Miesiace
        Miesiace maj = Miesiace.valueOf("MAJ");

        //metoda ordinal zwraca pozycje konkrentej stalej na liscie, numerowane od zera
        System.out.println("Maj jest " + maj.ordinal() + " miesiacem");

        //do enumow mozemy dodawac metody (i pola) tak jak do normalnych klas
        System.out.println("Zima jest " + PoryRoku.ZIMA.getIndex() + " pora roku");

        System.out.println(maj);

        System.out.println(poraRoku);

        Map<PoryRoku, List<Miesiace>> kwartaly = new HashMap<>();

        List<Miesiace> miesiaceWZimie = new ArrayList<>();
        miesiaceWZimie.add(Miesiace.STYCZEN);

        kwartaly.put(PoryRoku.ZIMA, miesiaceWZimie);


    }

}


enum Miesiace {
    //lista wartosci enuma, musi byc pierwsza rzecza jaka pojawia sie w jego definicji
    STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ;

    //kazdy enum dziedziczy po klasie Enum
    //a kazda klasa dziedziczy po Object, dlatego mozemy nadpisac metode toString
    @Override
    public String toString() {
        return super.toString();
    }

}

enum PoryRoku {
    ZIMA(4), WIOSNA(2);

    int index;

    PoryRoku(int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }

}
