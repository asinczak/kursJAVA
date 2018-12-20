public class cwiczeniaOperatory {

    public static void main(String[] args) {

        int a = 15;
        int b = 8;
        int c = 2;

        ++a;
        ++b;
        ++c;

        int wynik1 = (a+b) * c;
        int wynik2 = (a-b) / c;

        System.out.println("Pokaż " + wynik1);
        System.out.println("Pokaż " + wynik2);


        boolean dzialanie1 = (a+b) > c;
        boolean dzialanie2 = (a+b) < c;
        boolean equal = a==b;

        System.out.println(dzialanie1);
        System.out.println(dzialanie2);
        System.out.println(equal);



    }
}
