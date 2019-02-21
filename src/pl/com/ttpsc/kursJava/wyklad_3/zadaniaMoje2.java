public class zadaniaMoje2 {
    public static void main(String[] args) {

        // Napisać program pobierający dwie liczby całkowite A oraz B, A<B a następnie
        // wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu.

        String dlTablicy = args [0];
        int A = Integer.valueOf(dlTablicy);

        String dlTablicy1 = args [1];
        int B = Integer.valueOf(dlTablicy1);
        int wynik = B;

       while (A<B) {
           wynik = wynik + A++;

       }

        System.out.println(wynik);


    }

}
