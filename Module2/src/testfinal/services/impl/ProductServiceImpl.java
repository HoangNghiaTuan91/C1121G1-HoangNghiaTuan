package testfinal.services.impl;

import testfinal.models.ExportProduct;
import testfinal.models.ImportProduct;
import testfinal.models.Product;
import testfinal.services.ProductService2;
import testfinal.utils.IdNotFound;
import testfinal.utils.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService2 {
    public static final String PRODUCT_FILE_PATH = "src/testfinal/data/product.csv";
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> productList = ReadAndWrite.readProductFromCSVFile(PRODUCT_FILE_PATH);
        if (productList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("-----Product List-----");
            for (Product product : productList) {
                System.out.println("Id" + product.getId());
                System.out.println("Code" + product.getProductCode());
                System.out.println("Name" + product.getProductName());
                System.out.println("Price" + product.getProductPrice());
                System.out.println("Number" + product.getNumberOfProduct());
                System.out.println("Manufacturer" + product.getManufacturer());
                if (product instanceof ImportProduct) {
                    System.out.println("Import Price" + ((ImportProduct) product).getImportPrice());
                    System.out.println("Import Province" + ((ImportProduct) product).getImportProvince());
                    System.out.println("Import Tax" + ((ImportProduct) product).getImportTax());
                    System.out.println("----------");
                } else if (product instanceof ExportProduct) {
                    System.out.println("Export price" + ((ExportProduct) product).getExportPrice());
                    System.out.println("Import Country" + ((ExportProduct) product).getImportCountry());
                    System.out.println("----------");
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        try {
            int index = 0;
            List<Product> productList = ReadAndWrite.readProductFromCSVFile(PRODUCT_FILE_PATH);
            boolean check = false;
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                boolean flag = false;
                do {
                    flag = false;
                    int choice = 0;
                    try {
                        System.out.println("Are you sure?");
                        System.out.println("1\tYes.");
                        System.out.println("2\tNo.");
                        choice = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    switch (choice) {
                        case 1:
                            productList.remove(index);
                            System.out.println("Product list: ");
                            System.out.println(productList);
                            ReadAndWrite.writeListToCSVFile(productList, PRODUCT_FILE_PATH, false);
                            break;
                        case 2:
                            break;
                        default:
                            flag = true;
                            System.out.println("Your choice must be from 1 to 2");
                            System.out.println("Please try again.\n");
                    }
                } while (flag);
            } else {
               IdNotFound.IdNotFoundException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void search(String code) {
        List<Product> productList = ReadAndWrite.readProductFromCSVFile(PRODUCT_FILE_PATH);
        boolean check = false;
        for (Product product:productList){
            if (product.getProductCode().contains(code)){
                check = true;
                System.out.println("----------");
                System.out.println("Id" + product.getId());
                System.out.println("Code" + product.getProductCode());
                System.out.println("Name" + product.getProductName());
                System.out.println("Price" + product.getProductPrice());
                System.out.println("Number" + product.getNumberOfProduct());
                System.out.println("Manufacturer" + product.getManufacturer());
                if (product instanceof ImportProduct) {
                    System.out.println("Import Price" + ((ImportProduct) product).getImportPrice());
                    System.out.println("Import Province" + ((ImportProduct) product).getImportProvince());
                    System.out.println("Import Tax" + ((ImportProduct) product).getImportTax());
                    System.out.println("**********");
                } else if (product instanceof ExportProduct) {
                    System.out.println("Export price" + ((ExportProduct) product).getExportPrice());
                    System.out.println("Import Country" + ((ExportProduct) product).getImportCountry());
                    System.out.println("----------");
                }
            }
        }
        if(!check){
            System.out.println("This code is not exist in product list");
        }
    }
}
