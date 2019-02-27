package pl.com.ttpsc.kursJava.CarShowroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MenuShowroom {

     String login;
     String password;
     String login_password;
     BufferedReader reader;
    Showroom showroom = new Showroom();
    int numberOfCar;


    public void availableCars () {
                System.out.println(this.showroom.carList);
    }

    public void addCar () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand: ");
        String brand = sc.next();
        System.out.println("Enter model: ");
        String model = sc.next();
        System.out.println("Enter colour: ");
        String colour = sc.next();

        Car car = new Car(brand, model, colour);

        this.showroom.carList.add(car);
    }

    public void testDrive () {
        MenuShowroom menuShowroom = new MenuShowroom();

        System.out.println("List of available cars :");
        System.out.println(this.showroom.carList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the number of the car :");
        numberOfCar = sc.nextInt();


        System.out.println("You've reserved the car : " + this.showroom.carList.get(numberOfCar));

        System.out.println("List of available cars :");
        for (int i = 0; i< this.showroom.carList.size(); i++) {
            if (i != numberOfCar) {
                System.out.println(this.showroom.carList.get(i));
            }
        }
    }

    public void orderCar () {

        MenuShowroom menuShowroom = new MenuShowroom();

        System.out.println("List of available cars :");
        System.out.println(this.showroom.carList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the number of the car :");
        numberOfCar = sc.nextInt();


        System.out.println("You've chosen the car : " + this.showroom.carList.get(numberOfCar));

        System.out.println("List of available cars :");
        for (int i = 0; i< this.showroom.carList.size(); i++) {
            if (i != numberOfCar) {
                System.out.println(this.showroom.carList.get(i));
            }
        }
    }

    public void waysOfFinancing () {
        System.out.println("The ways of financing are prepared");
    }

    public void insuranceOffer () {
        System.out.println("The insurance offer is prepared");
    }

    public void serviceAppointment () {
        System.out.println("Service appointment is arranged");
    }

    public void replacementCar () {
        System.out.println("The replacement car is reserved");
    }

    public void carWash () {
        System.out.println("Washing car is reserved");
    }

    public void rentCar () {
        System.out.println("The car is reserved");
    }

    public void displayMenu () {
        System.out.println("**********************"+"\n"+"Welcome to Volvo Cars! " );
        System.out.println("1 -> Look through the list of available cars");
        System.out.println("2 -> Arrange a test drive");
        System.out.println("3 -> Order a car");
        System.out.println("4 -> Choose a way of financing");
        System.out.println("5 -> Prepare an insurance offer");
        System.out.println("6 -> Arrange a service appointment");
        System.out.println("7 -> Reserve a replacement car");
        System.out.println("8 -> Reserve a washing car after service appointment");
        System.out.println("9 -> Rent a car");
        System.out.println("10 -> Sign in as an employee");
        System.out.println("11 -> Add a car");
        System.out.println("12 -> Finish");
        System.out.println("Please choose one of the options :");
    }


    public void enterData () {
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter login :");
            login = reader.readLine();

            System.out.println("Please enter password :");
            password = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void logInAsEmployee () {

        List dataList = Logging.getLoginData();

        boolean logging = false;
        int counter = 3;

        do {
            ListIterator dataIterator = dataList.listIterator();

            enterData();
            while (dataIterator.hasNext()) {

                login_password = login + ":" + password;

                if (login_password.equals(dataIterator.next())) {
                    logging = true;
                }
            }

            if (logging) {
                System.out.println("Success");
                break;
            } else {
                System.out.println("Failure");
                counter--;
                if (counter == 0) {
                    System.out.println("Blocked");
                    break;
                }
            }
        } while (true);
    }

    public void menu () {

        MenuShowroom menuShowroom = new MenuShowroom();
        boolean switchgoes = true;

        do {
            menuShowroom.displayMenu();

            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();


            switch (menuNumber) {
                case 1:
                    menuShowroom.availableCars();
                    break;
                case 2:
                    menuShowroom.testDrive();
                    break;
                case 3:
                    menuShowroom.orderCar();
                    break;
                case 4:
                    menuShowroom.waysOfFinancing();
                    break;
                case 5:
                    menuShowroom.insuranceOffer();
                    break;
                case 6:
                    menuShowroom.serviceAppointment();
                    break;
                case 7:
                    menuShowroom.replacementCar();
                    break;
                case 8:
                    menuShowroom.carWash();
                    break;
                case 9:
                    menuShowroom.rentCar();
                    break;
                case 10:
                    menuShowroom.logInAsEmployee();
                    break;
                case 11:
                    menuShowroom.addCar();
                    break;
                case 12:
                    System.out.println("The end");
                    switchgoes = false;
                    break;
                    default:
                        System.out.println("Wrong number! Choose one more time!");
                }
        } while (switchgoes);
    }


    public static void main(String[] args) {

        MenuShowroom menuShowroom = new MenuShowroom();

        menuShowroom.menu();

    }
}
