package case_study.controllers;

import case_study.service.implement.ContractServiceImplement;
import case_study.service.*;
import case_study.service.implement.*;

import java.util.Scanner;

public class FuramaController {
    static IEmployee iEmployee = new EmployeeServiceImplement();
    static ICustomer iCustomer = new CustomerServiceImplement();
    static IFacility iFacility = new FacilityServiceImplement();
    static IBooking iBooking = new BookingServiceImplement();
    static IContract iContract = new ContractServiceImplement();
    static IPromotion iPromotion = new PromotionServiceImplement();
    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice = 0;
        while (true) {

            System.out.println("Menu: \n 1. Employee Management \n 2. Customer Management \n 3. Facility Management \n 4. Booking Management \n 5. Promotion Management \n 6. Exit");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }

            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayEmployeeManagement() {
        int choice = 0;
        while (true) {

            System.out.println("EMPLOYEE MANAGEMENT: \n Please select option \n 1. Display list employees \n 2. Add new employee \n 3. Edit employee \n 4. Return main menu ");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }
            switch (choice) {
                case 1:
                    iEmployee.display();
                    break;
                case 2:
                    iEmployee.add();
                    break;
                case 3:
                    iEmployee.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayCustomerManagement() {
        int choice = 0;
        while (true) {

            System.out.println("CUSTOMER MANAGEMENT \n Please select option: \n 1. Display list customers \n 2. Add new customer \n 3. Edit customer \n 4. Return main menu");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }
            switch (choice) {
                case 1:
                    iCustomer.display();
                    break;
                case 2:
                    iCustomer.add();
                    break;
                case 3:
                    iCustomer.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayFacilityManagement() {
        int choice = 0;
        while (true) {

            System.out.println("FACILITY MANAGEMENT \n Please select option: \n 1. Display list facility \n 2. Add new facility \n 3. Display list facility maintenance \n 4. Return main menu");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }
            switch (choice) {
                case 1:
                    iFacility.display();
                    break;
                case 2:
                    iFacility.add();
                    break;
                case 3:
                    iFacility.displayForMaintaining();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayBookingManagement() {
        int choice = 0;
        while (true) {

            System.out.println("BOOKING MANAGEMENT \n Please select option: \n 1. Add new booking \n 2. Display list booking \n 3. Create new contracts \n 4. Display list contracts \n 5. Edit contracts \n 6. Return main menu");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }
            switch (choice) {
                case 1:
                    iBooking.add();
                    break;
                case 2:
                    iBooking.display();
                    break;
                case 3:
                    iContract.add();
                    break;
                case 4:
                    iContract.display();
                    break;
                case 5:
                    iContract.edit();
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter again!");
                    break;
            }
        }
    }

    public static void displayPromotionManagement() {
        int choice = 0;
        while (true) {

            System.out.println("PROMOTION MANAGEMENT \n Please select option: \n 1. Display list customers use service \n 2. Display list customers get voucher \n 3. Return main menu");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format,please re-enter choice");
            }
            switch (choice) {
                case 1:
                    iPromotion.displayListCustomerUseService();
                    break;
                case 2:
                    iPromotion.displayListCustomerGetVoucher();
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }

}


