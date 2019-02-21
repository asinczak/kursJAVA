package pl.com.ttpsc.kursJava.Piotrek.wyklad_6;

public class Box {

    int width;
    int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
    }
}
