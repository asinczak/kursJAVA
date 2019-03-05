package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie spraw-
//        dza, czy podany ciąg jest palindromem.

import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some word :");
        String word = sc.nextLine();
        String reversalWord = "";

        for (int i =word.length() - 1; i >= 0; i--) {
            char sign[] = word.toCharArray();
            reversalWord += sign[i];
        }
        if (word.equals(reversalWord)){
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word isn't palindrome");
        }
    }
}
