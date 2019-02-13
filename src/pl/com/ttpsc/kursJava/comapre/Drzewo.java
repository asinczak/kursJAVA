package pl.com.ttpsc.kursJava.comapre;

public class Drzewo implements Comparable<Drzewo> {

    int srednica = -1;
    int wiek = -1;

    public Drzewo(int srednica) {
        this.srednica = srednica;
    }

    public Drzewo(int srednica, int wiek) {
        this.srednica = srednica;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "srednica=" + srednica +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public int compareTo(Drzewo o) {
        return this.srednica - o.srednica;
    }
}
