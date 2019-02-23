package pl.com.ttpsc.kursJava.CarShowroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class VolvoCars {

    static String login;
    static String password;
    static String login_password;
    static BufferedReader reader;

    public static void availableCars () {
        System.out.println("The available cars are displayed");
    }

    public static void testDrive () {
        System.out.println("The test drive is arranged");
    }

    public static void orderCar () {
        System.out.println("The car is ordered");
    }

    public static void waysOfFinancing () {
        System.out.println("The ways of financing are prepared");
    }

    public static void insuranceOffer () {
        System.out.println("The insurance offer is prepared");
    }

    public static void serviceAppointment () {
        System.out.println("Service appointment is arranged");
    }

    public static void replacementCar () {
        System.out.println("The replacement car is reserved");
    }

    public static void carWash () {
        System.out.println("Washing car is reserved");
    }

    public static void rentCar () {
        System.out.println("The car is reserved");
    }

    public static void displayMenu () {
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
        System.out.println("11 -> Finish");
        System.out.println("Please choose one of the options :");
    }

    public  static void logInAsEmployee () {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int counter =0;

        do {


        try {
            System.out.println("Please enter login :");
            login = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter password :");
        try {
            password = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }



                for (String str : Logging.getLoginData()) {
                    login_password = login + ":" + password;
                    if (login_password.equals(str)) {
                        System.out.println("Success! You are signed in.");

                    }
                    for (String str1 : Logging.getLoginData()) {
                        login_password = login + ":" + password;
                        if (!login_password.equals(str1) & counter < 2) {
                            System.out.println("Fail");
                            counter++;
                            break;
                        } else {
                            System.out.println("block");
                            break;
                        }

                    }


                }





        } while (counter < 3);

    }

    public static void menu () {

        boolean switchgoes = true;

        do {
            VolvoCars.displayMenu();

            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();


            switch (menuNumber) {
                case 1:
                    VolvoCars.availableCars();
                    break;
                case 2:
                    VolvoCars.testDrive();
                    break;
                case 3:
                    VolvoCars.orderCar();
                    break;
                case 4:
                    VolvoCars.waysOfFinancing();
                    break;
                case 5:
                    VolvoCars.insuranceOffer();
                    break;
                case 6:
                    VolvoCars.serviceAppointment();
                    break;
                case 7:
                    VolvoCars.replacementCar();
                    break;
                case 8:
                    VolvoCars.carWash();
                    break;
                case 9:
                    VolvoCars.rentCar();
                    break;
                case 10:
                    VolvoCars.logInAsEmployee();
                    break;
                case 11:
                    System.out.println("The end");
                    switchgoes = false;
                    break;
                    default:
                        System.out.println("Wrong number! Choose one more time!");
                }
        } while (switchgoes);
    }


    public static void main(String[] args) {

        VolvoCars.menu();

    }
}
