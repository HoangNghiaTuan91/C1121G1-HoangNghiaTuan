package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.services.ProductManager;

import java.util.Scanner;

public class MainProductManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Menu: \n");
            System.out.print("\t1. Add a new product\n");
            System.out.print("\t2. Delete a product\n");
            System.out.print("\t3. Edit product\n");
            System.out.print("\t4. Search\n");
            System.out.print("\t5. Sort by price\n");
            System.out.print("\t6. Display product list\n");
            System.out.print("\t0. Exit\n");
            System.out.print("Select menu number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.deleteProduct();
                    break;
                case 3:
                    ProductManager.editProduct();
                    break;
                case 4:
                    ProductManager.searchProduct();
                    break;
                case 5:
                    System.out.print("\t1. Sort by increasing price\n");
                    System.out.print("\t2. Sort by decreasing price\n");
                    System.out.print("Choose 1 or 2: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            ProductManager.sortByIncreasingPrice();
                            break;
                        case 2:
                            ProductManager.sortByDecreasingPrice();
                            break;
                    }
                    break;
                case 6:
                    ProductManager.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
