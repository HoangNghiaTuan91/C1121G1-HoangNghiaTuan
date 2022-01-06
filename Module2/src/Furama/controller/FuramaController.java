package Furama.controller;

import java.util.Scanner;
//menu
public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (true) {
            do {
                System.out.print("\tMenu: \n");
                System.out.print("\t1.Employee Management: \n");
                System.out.print("\t2.Customer Management: \n");
                System.out.print("\t3.Facility Management: \n");
                System.out.print("\t4.Booking Management: \n");
                System.out.print("\t5.Promotion Management: \n");
                System.out.print("\t6.Exit: \n");
                System.out.print("\tEnter Your Choice: \n");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        int choice1 = -1;
                        do {
                            System.out.print("\t1. Display list employees \n");
                            System.out.print("\t2. Add new employee \n");
                            System.out.print("\t3. Edit employee \n");
                            System.out.print("\t4. Return main menu \n");
                            System.out.print("Enter your choice: ");
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Error. Please re-enter your choice.");
                            }
                        } while (choice1 != 4);
                        break;
                    case 2:
                        int choice2 = -1;
                        do {
                            System.out.print("\t1. Display list customers \n");
                            System.out.print("\t2. Add new customer \n");
                            System.out.print("\t3. Edit customer \n");
                            System.out.print("\t4. Return main menu \n");
                            System.out.print("Enter your choice: ");
                            choice2 = Integer.parseInt(scanner.nextLine());
                            switch (choice2) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Error. Please re-enter your choice.");
                            }
                        } while (choice2 != 4);
                        break;
                    case 3:
                        int choice3 = -1;
                        do {
                            System.out.print("\t1. Display list facility \n");
                            System.out.print("\t2. Add new facility \n");
                            System.out.print("\t3. Display list facility maintenance \n");
                            System.out.print("\t4. Return main menu \n");
                            System.out.print("Enter your choice: ");
                            choice3 = Integer.parseInt(scanner.nextLine());
                            switch (choice3) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Error. Please re-enter your choice.");
                            }
                        } while (choice3 != 4);
                        break;
                    case 4:
                        int choice4 = -1;
                        do {
                            System.out.print("\t1. Add new booking \n");
                            System.out.print("\t2. Display list booking \n");
                            System.out.print("\t3. Create new contract \n");
                            System.out.print("\t4. Display list contracts \n");
                            System.out.print("\t5. Edit contracts \n");
                            System.out.print("\t6. Return main menu \n");
                            System.out.print("Enter your choice: ");
                            choice4 = Integer.parseInt(scanner.nextLine());
                            switch (choice4) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Error. Please re-enter your choice.");
                            }
                        } while (choice4 != 6);
                        break;
                    case 5:
                        int choice5 = -1;
                        do {
                            System.out.print("\t1. Display list customers use service \n");
                            System.out.print("\t2. Display list customers get voucher \n");
                            System.out.print("\t3. Return main menu \n");
                            System.out.print("Enter your choice: ");
                            choice5 = Integer.parseInt(scanner.nextLine());
                            switch (choice5) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Error. Please re-enter your choice.");
                            }
                        } while (choice5 != 3);
                        break;
                    case 6:
                        System.exit(6);
                }
            } while (choice != 6);
        }
    }
}
