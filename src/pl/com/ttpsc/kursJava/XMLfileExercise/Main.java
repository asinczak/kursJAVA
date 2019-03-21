package pl.com.ttpsc.kursJava.XMLfileExercise;

public class Main {

    public static void main(String[] args) {


//        FileService.getInstance().writeToFileUsingSax();
//        FileService.getInstance().createHTMLtable();

//        XMLfileServiceWithJAXB.readFile(FileService.getInstance().getFileIn1());

        FileService.getInstance().writeToFileUsingJAXB();

    }
}
