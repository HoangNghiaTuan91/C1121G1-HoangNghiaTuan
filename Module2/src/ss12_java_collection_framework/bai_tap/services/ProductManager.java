package ss12_java_collection_framework.bai_tap.services;

import ss12_java_collection_framework.bai_tap.models.DecreasingPriceSorting;
import ss12_java_collection_framework.bai_tap.models.IncreasingPriceSorting;
import ss12_java_collection_framework.bai_tap.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "Ford Explorer", 20000));
        productArrayList.add(new Product(2, "Kia Sorento", 6500));
        productArrayList.add(new Product(3, "Mazda CX5", 5000));
        productArrayList.add(new Product(4, "Kia Carnival", 8000));
        productArrayList.add(new Product(5, "Hyundai Tucson", 4800));
    }

    public static void addProduct() {
        System.out.print("Enter Id of New Product: ");
        int idNewProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name of New Product: ");
        String nameOfNewProduct = scanner.nextLine();
        System.out.print("Enter Price of New Product: ");
        boolean check = true;
        double priceOfNewProduct = Double.parseDouble(scanner.nextLine());
        for (Product product : productArrayList) {
            if (product.getIdOfProduct() == idNewProduct || idNewProduct == 0) {
                System.out.println("duplicative id or id equal 0");
                check = false;
                break;
            }
        }
        if (check) {
            productArrayList.add(new Product(idNewProduct, nameOfNewProduct, priceOfNewProduct));
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter product's Id to delete");
        int idDeletingProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (Product product : productArrayList) {
            if (product.getIdOfProduct() == idDeletingProduct) {
                productArrayList.remove(product);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("This id is not exist in the list");
        }
    }

    public static void displayProduct() {
        for (Product product : productArrayList) {
            System.out.println(product.toString());
        }
    }

    public static void editProduct() {
        System.out.println("Enter product's id to edit");
        int idEditingProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Product product : productArrayList) {
            if (product.getIdOfProduct() == idEditingProduct) {
                check = true;
                System.out.print("\tChoose 1 or 2 to edit\n");
                System.out.print("\t1. Edit name of product\n");
                System.out.print("\t2. Edit price of product\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter new name of product");
                        String newNameOfProduct = scanner.nextLine();
                        product.setNameOfProduct(newNameOfProduct);
                        break;
                    case 2:
                        System.out.println("Enter new price of product");
                        double newPriceOfProduct = Double.parseDouble(scanner.nextLine());
                        product.setPriceOfProduct(newPriceOfProduct);
                        break;
                    default:
                        System.out.println("Your choice is not match any case");
                }
                break;
            }
        }
        if (!check) {
            System.out.println("This id is not exist in the list");
        }
    }

    public static void searchProduct() {
        List<Product> searchList = new ArrayList<>();
        System.out.println("Enter product's Name for searching");
        String nameSearch = scanner.nextLine().toLowerCase();

        for (Product product : productArrayList) {
            if ((product.getNameOfProduct().toLowerCase()).contains(nameSearch)) {
                searchList.add(product);
            }
        }
        if (searchList.isEmpty()) {
            System.out.println("Can not find this product in the list");
        } else {
            for (Product product : searchList) {
                System.out.println(product);
            }
        }
    }

    public static void sortByIncreasingPrice() {
        productArrayList.sort(new IncreasingPriceSorting());
        displayProduct();
    }

    public static void sortByDecreasingPrice() {
        productArrayList.sort(new DecreasingPriceSorting());
        displayProduct();
    }
}

