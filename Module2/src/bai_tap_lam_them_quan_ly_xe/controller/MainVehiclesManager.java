package bai_tap_lam_them_quan_ly_xe.controller;


import bai_tap_lam_them_quan_ly_xe.services.VehiclesManager;

import java.util.Scanner;

public class MainVehiclesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Menu: \n");
            System.out.print("\t1. Add a new vehicle\n");
            System.out.print("\t2. Delete a vehicle\n");
            System.out.print("\t3. Edit vehicle\n");
            System.out.print("\t4. Search\n");
            System.out.print("\t5. Display vehicles list\n");
            System.out.print("\t0. Exit\n");
            System.out.print("Select menu number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    VehiclesManager.add();
                    break;
                case 2:
                    VehiclesManager.deleteProduct();
                    break;
                case 3:
                    VehiclesManager.editProduct();
                    break;
                case 4:
                    VehiclesManager.searchProduct();
                    break;
                case 5:
                    VehiclesManager.display();
                    break;

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
