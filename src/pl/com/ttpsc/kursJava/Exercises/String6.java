package pl.com.ttpsc.kursJava.Exercises;

//Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.

import java.util.Scanner;

public class String6 {

   public void checking (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some statement :");
        String statement = sc.nextLine();
        int sum = 0;

       String tab [] = statement.split(" ");

       for(int i = 0; i<tab.length; i++) {
           //try {
               int number = Integer.parseInt(tab[i]);
               sum += number;
           //} catch (NumberFormatException e) {

           //}
       }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        String6 str = new String6();
        str.checking();
    }
}
