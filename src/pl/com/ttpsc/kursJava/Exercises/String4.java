package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wy-
//świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
//Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
//ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
//razy.

import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some word :");
        String word = sc.nextLine();
        int counter = 0;

        for (int i = 0; i<word.length(); i++){
            char sign [] = word.toCharArray();
            char lastSign = sign [word.length()-1];
            if (sign[i] == lastSign){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
