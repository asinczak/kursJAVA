package pl.com.ttpsc.kursJava.Exercises;

//Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy uży-
//        ciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
//        monoalfabetycznego.
//        Użytkownik program podaje tekst do zaszyfrowania oraz liczbę
//        , o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
//        przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
//        tj. ’a’ – ’z’ (26 znaków) oraz spacji.

import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to code:");
        String word = sc.nextLine();
        System.out.println("Enter number :");
        int number = sc.nextInt();

        char signs [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                            'q','r','s','t','u','v','w','x','y','z'};
        char signsOfWord [] = word.toCharArray();
        char codedWord [] = new char[word.length()];

            int i = 0;
            int y = 0;
            for (i =0; i < word.length(); i++){
                for (y = 0; y < signs.length; y++) {
                    if (signsOfWord[i] == signs[y]) {
                        codedWord [i] = signs[y + number];
                    }
                }System.out.print(codedWord[i]);
        }

    }
}
