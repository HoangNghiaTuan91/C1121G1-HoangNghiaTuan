package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.services.impl;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.models.Product;
import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServices implements IProductServices {
    final static String PRODUCT_PATH = "src/ss17_IO_binary_file_serialization/bai_tap/quan_ly_san_pham_luu_file_nhi_phan/data/product.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Ford Explorer", 20000));
        productList.add(new Product(2, "Kia Sorento", 6500));
        productList.add(new Product(3, "Mazda CX5", 5000));
        productList.add(new Product(4, "Kia Carnival", 8000));
        productList.add(new Product(5, "Hyundai Tucson", 4800));
        ReadAndWrite.writeToFile(PRODUCT_PATH, productList);
    }


    @Override
    public void displayProduct() {
        productList = ReadAndWrite.readFromFile(PRODUCT_PATH);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        productList = ReadAndWrite.readFromFile(PRODUCT_PATH);
        System.out.print("Enter Id of New Product: ");
        int idNewProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name of New Product: ");
        String nameOfNewProduct = scanner.nextLine();
        System.out.print("Enter Price of New Product: ");
        double priceOfNewProduct = Double.parseDouble(scanner.nextLine());
        boolean check = true;
        for (Product product : productList) {
            if (product.getIdOfProduct() == idNewProduct || idNewProduct == 0) {
                System.out.println("duplicative id or id equal 0");
                check = false;
                break;
            }
        }
        if (check) {
            productList.add(new Product(idNewProduct, nameOfNewProduct, priceOfNewProduct));
            System.out.println("adding successfully");
            ReadAndWrite.writeToFile(PRODUCT_PATH, productList);
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter product's Id to delete");
        int idDeletingProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (Product product : productList) {
            if (product.getIdOfProduct() == idDeletingProduct) {
                productList.remove(product);
                ReadAndWrite.writeToFile(PRODUCT_PATH, productList);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("This id is not exist in the list");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Enter product's id to edit");
        int idEditingProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Product product : productList) {
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
                        ReadAndWrite.writeToFile(PRODUCT_PATH, productList);
                        break;
                    case 2:
                        System.out.println("Enter new price of product");
                        double newPriceOfProduct = Double.parseDouble(scanner.nextLine());
                        product.setPriceOfProduct(newPriceOfProduct);
                        ReadAndWrite.writeToFile(PRODUCT_PATH, productList);
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

    @Override
    public void searchProduct() {
        List<Product> searchList = new ArrayList<>();
        System.out.println("Enter product's Name for searching");
        String nameSearch = scanner.nextLine().toLowerCase();

        for (Product product : productList) {
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


}

