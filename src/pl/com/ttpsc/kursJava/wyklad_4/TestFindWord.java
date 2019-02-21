package pl.com.ttpsc.kursJava.wyklad_4;

public class TestFindWord {
    public static void main(String[] args) {
        FindWord tablica = new FindWord();
       String tab [] = {"Ala", "ma", "kota", "a", "kot", "ma", "kajak"};

        System.out.println(tablica.findWordInTab( tab ));

        System.out.println(tablica.findWordInString("Ala ma kota a kot ma kajak wow"));

    }
}
