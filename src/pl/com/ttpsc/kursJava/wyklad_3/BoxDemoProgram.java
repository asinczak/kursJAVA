public class BoxDemoProgram {

    public static void main(String[] args) {
        BoxDemo2 obiekt = new BoxDemo2(10, 5, 10);

        System.out.println(obiekt.boxWidth);
        System.out.println(obiekt.boxHeight);
        System.out.println(obiekt.boxDepth);

        BoxDemo2 obiekt2 = new BoxDemo2(11, 22, 33);

        System.out.println(obiekt2.boxDepth);
        System.out.println(obiekt2.boxHeight);
        System.out.println(obiekt2.boxWidth);

        System.out.println(obiekt.boxWidth);
        System.out.println(obiekt.boxHeight);
        System.out.println(obiekt.boxDepth);

        BoxDemo2 obiekt3 = new BoxDemo2();

        System.out.println(obiekt3.boxWidth);
        System.out.println(obiekt3.boxHeight);
        System.out.println(obiekt3.boxDepth);
    }
}
