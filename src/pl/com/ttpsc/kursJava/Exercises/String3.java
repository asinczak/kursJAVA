package pl.com.ttpsc.kursJava.Exercises;

//Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy uży-
//        ciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
//        monoalfabetycznego.
//        Użytkownik program podaje tekst do zaszyfrowania oraz liczbę
//        , o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
//        przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
//        tj. ’a’ – ’z’ (26 znaków) oraz spacji.

import java.util.InputMismatchException;
import java.util.Scanner;

public class String3 {

    String word;
    int number;
    String dataFile = "";

    public void readingFile () {
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter word :");
                word = sc.nextLine();
                System.out.println("Please enter number");
                number = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong! Please try again");
            }
        } while (true);
    }

   public void checking () {

       readingFile();

        char signs [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                            'q','r','s','t','u','v','w','x','y','z'};
        char signsOfWord [] = word.toCharArray();
        char codedWord [] = new char[word.length()];

        for (int i =0; i < word.length(); i++){
            for (int y = 0; y < signs.length; y++) {
                if (signsOfWord[i] == signs[y]) {
                    codedWord [i] = signs[(y + number) % signs.length];
                }
            }
            System.out.print(codedWord[i]);
        }
    }

    public static void main(String[] args) {
        String3 str = new String3();
        str.checking();
    }
}
