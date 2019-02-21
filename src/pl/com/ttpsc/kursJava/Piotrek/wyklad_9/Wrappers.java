package pl.com.ttpsc.kursJava.Piotrek.wyklad_9;

public class Wrappers {

    public static void main(String[] args) {

        //automatycznie wartosc 10001 (typ int) jest opakowana w obiekt klasy Integer
        Integer integer = 10001;

        //z obiektu opakowujacego wyciagana jest automatycznie wartosc prosta (typ int)
        int i = integer;

        byte by = integer.byteValue();

        System.out.println(by);

        double d = add(3.0, 9);

    }

    static Double add(Double d1, Integer i1) {
        return d1 + i1;
    }


}
