package pl.com.ttpsc.kursJava.Exercises;

//Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
//arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
//pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some statement :");
        String word = sc.nextLine();


        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < word.length(); i++) {
            char sign[] = word.toCharArray();
            if (sign[i] == '(') {
                counter1++;
            }
            if (sign[i] == ')') {
                counter2++;
            }
        }

        if (counter1 == counter2){
            System.out.println("Brackets are correct.");
        } else {
            System.out.println("Brackets are incorrect.");
        }
    }

}
