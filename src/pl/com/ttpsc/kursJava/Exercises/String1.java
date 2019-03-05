package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie two-
//rzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
//Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String1 {

    String word;

    public void readingFile () {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("String1_file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            word = data.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
