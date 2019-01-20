package pl.wyklad.czwarty;

public class ReversalWord {

    String revesal (String word) {
        char tablica [] = word.toCharArray();
        String napis = "";

        for (int i = tablica.length -1; i >=0; i--) {
            char litera = tablica [i];
            napis = napis + litera;
        }


            return napis;
    }


}
