package pl.com.ttpsc.kursJava.CarShowroom;

import java.util.Scanner;

public abstract class VolvoCars {

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
        System.out.println("10 -> Finish");
        System.out.println("Please choose one of the options :");
    }

    public static void menu () throws MenuNumberException {

        do {
            VolvoCars.displayMenu();

            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();
            if (menuNumber < 10) {

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

                }
            } else if (menuNumber > 10){
                throw new MenuNumberException();
            }

            else if (menuNumber == 10){
                System.out.println("The end");
               break;
            }

        } while (true);
    }


    public static void main(String[] args) {

        do {
            try {
                VolvoCars.menu();
                    break;
            } catch (MenuNumberException e) {
                System.out.println(e.GetMessage());
            }
        }while (true);
    }

}
