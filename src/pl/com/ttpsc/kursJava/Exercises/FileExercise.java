package pl.com.ttpsc.kursJava.Exercises;

import java.io.*;

public class FileExercise {

    public double conversion (String pathToFile, int number) {

        double average = 0;
        try {
            BufferedReader data = new BufferedReader(new FileReader(pathToFile));
            try {
                String statement = data.readLine();

                for (int i = 0; i <statement.length(); i++){
                    char sign1 = statement.charAt(i);
                    if (i % 2 == 1){
                        int nextValue = (int) sign1 +1;
                     sign1 = (char) nextValue;

                    }
                    System.out.print(sign1);
                }

                System.out.println("\n");

                for (int i = statement.length()-1; i>= 0; i--){
                    char sign2 = statement.charAt(i);

                    System.out.print(sign2);
                }

                System.out.println("\n");

                int counter = 0;
                double sum = 0;

              String words [] =   statement.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (word.length() < number) {
                       statement = statement.replace(word, "");
                    }
                }
                System.out.println("Removing word :" + statement);

                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    double totalchar = word.length();
                    sum = sum + totalchar;
                    counter++;
                }

                average = sum / counter;

            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {

                    data.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            try {
                String tekst = "No input file";
                Writer writer = new FileWriter(new File("Conversion2.txt"));
                writer.write(tekst);

                writer.close();

            } catch (IOException e1) {
                e1.printStackTrace();

            }
        }
        return average;
    }

    public static void main(String[] args) {

        FileExercise file = new FileExercise();
        System.out.println(file.conversion("Conversion.txt", 3));
    }

}
