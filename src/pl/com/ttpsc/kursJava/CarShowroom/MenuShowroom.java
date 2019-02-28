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

        Car car = Car.enterCar();
        this.showroom.carList.add(car);
    }

    public void orderCar () {

        System.out.println("List of available cars :");
        availableCars();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the number of the car :");
        numberOfCar = sc.nextInt();


        System.out.println("You've chosen the car : " + this.showroom.carList.get(numberOfCar));

        for (int i = 0; i< this.showroom.carList.size(); i++) {
            if (i == numberOfCar) {
                this.showroom.carList.remove(i);
                this.showroom.orderedCarList.add(this.showroom.carList.get(i));
            }
        }
    }


    public void displayMenu () {
        System.out.println("**********************"+"\n"+"Welcome to our Showroom! " );
        System.out.println("1 -> Look through the list of available cars");
        System.out.println("2 -> Order a car");
        System.out.println("3 -> Sign in as an employee");
        System.out.println("4 -> Add a car");
        System.out.println("5 -> Finish");
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
                System.out.println("Success! You are sign in.");
                break;
            } else {
                System.out.println("Failure! Yoy are not sign in.");
                counter--;
                if (counter == 0) {
                    System.out.println("Blocked");
                    break;
                }
            }
        } while (true);
    }

    public void menu () {

        boolean switchgoes = true;

        do {
            displayMenu();

            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();


            switch (menuNumber) {
                case 1:
                    availableCars();
                    break;
                case 2:
                    orderCar();
                    break;
                case 3:
                    logInAsEmployee();
                    break;
                case 4:
                    addCar();
                    break;
                case 5:
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
