package pl.wyklad.czwarty;

public class TestFindWord {
    public static void main(String[] args) {
        FindWord tablica = new FindWord();
       String tab [] = {"Ala", "ma", "kota", "a", "kot", "ma", "kajak"};

        System.out.println(tablica.findWorldInTab( tab ));

        System.out.println(tablica.findWorldInString("Ala ma kota a kot ma kajak"));

    }
}
