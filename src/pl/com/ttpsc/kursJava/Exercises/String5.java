package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie spraw-
//        dza, czy podany ciąg jest palindromem.

import java.util.InputMismatchException;
import java.util.Scanner;

public class String5 {

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
       String reversalWord = "";

       for (int i = word.length() - 1; i >= 0; i--) {
           reversalWord += sign[i];
       }
       if (word.equals(reversalWord)) {
           System.out.println("The word "+word+" is palindrome");
       } else {
           System.out.println("The word "+word+"isn't palindrome");
       }
   }

    public static void main(String[] args) {
       String5 str = new String5();
       str.checking();
    }
}
