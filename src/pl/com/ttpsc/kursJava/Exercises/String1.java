package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie two-
//rzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
//Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”

import java.util.InputMismatchException;
import java.util.Scanner;

public class String1 {

    String word;

    public void readingFile () {

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter word :");
                word = sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong! Please try again");
            }
        } while (true);
    }

    public void checking () {

        readingFile();

        char sign[] = word.toCharArray();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(sign[i]);
        }
    }

        public static void main(String[] args) {
        String1 str = new String1();
        str.checking();
    }
}
