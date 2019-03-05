package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wy-
//świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
//Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
//ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
//razy.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String4 {

    String word;

    public void readingFile () {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("String4_File.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            word = data.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  public void checking (){

       readingFile();

      char sign [] = word.toCharArray();
        int counter = 0;

        for (int i = 0; i<word.length(); i++){
            char lastSign = sign [word.length()-1];
            if (sign[i] == lastSign){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        String4 str = new String4();
        str.checking();
    }
}
