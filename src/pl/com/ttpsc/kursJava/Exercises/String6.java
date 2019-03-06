package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String6 {

    String statement;

    public void readingFile () {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("String6_file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            statement = data.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public void checking (){

        readingFile();
        int sum = 0;

       String tab [] = statement.split(" ");

       for(int i = 0; i<tab.length; i++) {
            if(tab[i].matches(("[0-9]+"))) {
                int number = Integer.parseInt(tab[i]);
                sum += number;
            }
       }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        String6 str = new String6();
        str.checking();
    }
}
