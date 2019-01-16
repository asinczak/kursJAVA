package pl.wyklad.czwarty;

public class FindWomen {


    int findWomen (String imiona []) {

        int wynik = 0;

        for (int i = 0; i < imiona.length; i++) {

            boolean checking = true ;
            if (checking = imiona[i].endsWith("a")) {

                wynik++;
            }

        }

        return wynik;

    }

}
