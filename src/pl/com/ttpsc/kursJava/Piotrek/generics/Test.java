package pl.com.ttpsc.kursJava.Piotrek.generics;

import pl.com.ttpsc.kursJava.Bank.CurrentAccount;
import pl.com.ttpsc.kursJava.CarShowroom.Car;

import java.util.ArrayList;
import java.util.List;

public class Test {

    void oldWay() {
        List lista = new ArrayList();

        lista.add("asdasd");
        lista.add(new Object());
        lista.add(123123123);
        lista.add(new Car("a", "b", "c"));

        for (Object o : lista) {
            //if (o instanceof Car) {
            Car car = (Car) o;
            System.out.println("znalazlem samochod");
            //}

        }

    }

    void newWay() {
        List<Car> lista = new ArrayList();
        List<String> listStringwow = new ArrayList<>();
        List<CurrentAccount> listaKont = new ArrayList<>();

        lista.add(new Car("a", "b", "c"));
        lista.add(new Truck("","",""));

        for (Car o : lista) {
            System.out.println("znalazlem samochod " + o.getClass().getName());
        }
    }

    public static void main(String[] args) {

        new Test().newWay();

    }
}

class Truck extends Car {
    public Truck(String brand, String model, String colour) {
        super(brand, model, colour);
    }
}
