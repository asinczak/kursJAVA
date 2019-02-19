package pl.com.ttpsc.kursJava.wyklad_9;


import java.util.*;

public class InnerClasses {

    private int x = 7;
    int y = 10;

    public class Inner {
        void display() {
            System.out.println("outer = " + x);
        }
    }

    public static class StatiInner {
        int x = 10;
        int y = 0;
        int wynik_2 = 9;

        public StatiInner(int x, int y, int wynik_2) {
            this.x = x;
            this.y = y;
            this.wynik_2 = wynik_2;
        }

        void display() {
            System.out.println("outer = " + x);
        }
    }

    StatiInner oblicz(int x, int y) {
        int wynik = x * y;
        StatiInner si = new StatiInner(x, y, wynik);
        return si;
    }


    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("jeden", 1);
        map.put("dwa", 2);
        map.put("trzy", 3);
        map.put("czterry", 4);


        Inner in = new InnerClasses().new Inner();
        in.display();

        StatiInner si = new StatiInner(1,2, 9);


        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue()) ;
        }
    }




}
