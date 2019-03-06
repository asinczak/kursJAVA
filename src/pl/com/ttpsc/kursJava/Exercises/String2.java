package pl.com.ttpsc.kursJava.Exercises;

//Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
//arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
//pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String2 {

    String word;


    public void readingFile () {

        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("String2_file.txt"));
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

        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < sign.length; i++) {
            if (sign[i] == '(') {
                counter1++;
            }
            if (sign[i] == ')') {
                counter2++;
            }
        }

        if (counter1 == counter2) {
            System.out.println("Brackets are correct.");
        } else {
            System.out.println("Brackets are incorrect.");
        }
    }


    public static void main(String[] args) {
        String2 str = new String2();
       str.checking();
    }
}
