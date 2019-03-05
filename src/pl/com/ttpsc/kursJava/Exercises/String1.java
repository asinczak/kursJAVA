package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie two-
//rzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
//Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some word :");
        String word = sc.nextLine();

        for (int i =word.length() - 1; i >= 0; i--){
            char sign [] = word.toCharArray();
            System.out.print(sign[i]);
        }
    }
}
