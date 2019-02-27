package pl.com.ttpsc.kursJava.CarShowroom;

public class Car {
    String brand;
    String model;
    String color;

    public Car (String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
