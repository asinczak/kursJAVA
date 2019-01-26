package pl.com.ttpsc.kursJava.wyklad_5;

public class TestLiczba {

    public static void main(String[] args) {
        Liczba tablica [] = new Liczba [args.length];
        for (int i = 0; i < args.length; i++){
            tablica [i] = new Liczba(Integer.valueOf(args [i]));
            tablica [i].zmienZnak();
            System.out.println(tablica [i].liczba);

        }

    }
}
