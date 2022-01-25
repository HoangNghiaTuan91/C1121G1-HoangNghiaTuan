package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.controller;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.services.impl.ProductServices;

import java.util.Scanner;

public class MainProductManager {
    public static void main(String[] args) {
        ProductServices productServices = new ProductServices();
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
                    productServices.addProduct();
                    break;
                case 2:
                    productServices.deleteProduct();
                    break;
                case 3:
                    productServices.editProduct();
                    break;
                case 4:
                    productServices.searchProduct();
                    break;
                case 5:
                    productServices.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
