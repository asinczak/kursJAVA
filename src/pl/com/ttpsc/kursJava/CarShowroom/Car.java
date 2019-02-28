package pl.com.ttpsc.kursJava.CarShowroom;

import java.util.Scanner;

public class Car {
    String brand;
    String model;
    String colour;

    public Car (String brand, String model, String colour){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    public static Car enterCar () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand: ");
        String brand = sc.next();
        System.out.println("Enter model: ");
        String model = sc.next();
        System.out.println("Enter colour: ");
        String colour = sc.next();

        Car car = new Car(brand, model, colour);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
