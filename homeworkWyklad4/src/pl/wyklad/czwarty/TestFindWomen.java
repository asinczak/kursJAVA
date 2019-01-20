package pl.wyklad.czwarty;

public class TestFindWomen {

    public static void main(String[] args) {

       String imiona [] = {"Olka", "Kaśka", "Michał", "Tomek", "Agnieszka"};
               FindWomen names = new FindWomen();

        System.out.println(names.findWomen(imiona));
    }
}
