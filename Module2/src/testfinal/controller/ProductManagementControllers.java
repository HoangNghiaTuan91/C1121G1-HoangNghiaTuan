package testfinal.controller;

import testfinal.services.impl.ExportProductImpl;
import testfinal.services.impl.ImportProductImpl;
import testfinal.services.impl.ProductServiceImpl;

import java.util.Scanner;

public class ProductManagementControllers {
    private static final ImportProductImpl importProduct = new ImportProductImpl();
    private static final ExportProductImpl exportProduct = new ExportProductImpl();
    private static final ProductServiceImpl product = new ProductServiceImpl();

    Scanner sc = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("-----PRODUCT MANAGEMENT PROGRAM-----");
        boolean flag;
        do {
            flag = true;
            System.out.println();
            System.out.println("-----Menu-----\n" +
                    "1.\tAdd new.\n" +
                    "2.\tDelete.\n" +
                    "3.\tView product list.\n" +
                    "4.\tSearch.\n" +
                    "5.\tExit.");
            int menuChoice;
            while (true) {
                try {
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    menuChoice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (menuChoice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    displayProductList();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice must be from 1 to 5.\n" +
                            "Please try again.\n");
            }
        } while (flag);
    }

    private void addNewProduct() {
        System.out.println("------Add menu------\n" +
                "1.\tAdd new import product.\n" +
                "2.\tAdd new export product.\n");
        int addMenuChoice;
        boolean flag;
        do {
            flag = false;
            while (true) {
                try {
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    addMenuChoice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (addMenuChoice) {
                case 1:
                    importProduct.add();
                    System.out.println("Add new import product success!\n");
                    break;
                case 2:
                    exportProduct.add();
                    System.out.println("Add new export product success!\n");
                    break;
                default:
                    System.out.println("Your choice must be from 1 to 2.\n" +
                            "Please try again.\n");
                    flag = true;
            }
        } while (flag);
    }

    private void deleteProduct() {
        while (true) {
            try {
                System.out.println();
                System.out.print("Enter id of product you want to delete: ");
                int searchId = Integer.parseInt(sc.nextLine());
                product.delete(searchId);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    private void displayProductList() {
        product.display();
    }

    private void searchProduct() {
        while (true) {
            try {
                System.out.println();
                System.out.print("Enter code of product you want to search: ");
                String searchCode = sc.nextLine();
                product.search(searchCode);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
