package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie spraw-
//        dza, czy podany ciąg jest palindromem.

import java.util.Scanner;

public class String5 {

   public void checking () {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter some word :");
       String word = sc.nextLine();

       char sign[] = word.toCharArray();
       String reversalWord = "";

       for (int i = word.length() - 1; i >= 0; i--) {
           reversalWord += sign[i];
       }
       if (word.equals(reversalWord)) {
           System.out.println("The word is palindrome");
       } else {
           System.out.println("The word isn't palindrome");
       }
   }

    public static void main(String[] args) {
       String5 str = new String5();
       str.checking();
    }
}
