public class zadaniaMoje2 {
    public static void main(String[] args) {

        // Napisać program pobierający dwie liczby całkowite A oraz B, A<B a następnie
        // wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu.

        int A = 4;
        int B = 10;
        int wynik = B;

       while (A<B) {
           wynik = wynik + A++;

       }

        System.out.println(wynik);


    }

}
