package testfinal.services.impl;

import testfinal.models.ExportProduct;
import testfinal.models.Product;
import testfinal.services.ProductService;
import testfinal.utils.ReadAndWrite;
import testfinal.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements ProductService {
    public static final String POSITIVE_NUMBER_REGEX = "^[+]?\\d+$";
    public static final String CODE_REGEX = "^SP\\d{5}$";
    public static final String STRING_REGEX = "^\\w+( \\w+)*$";
    public static final String PRODUCT_FILE_PATH = "src/testfinal/data/product.csv";
    static Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        List<Product> productList = ReadAndWrite.readProductFromCSVFile(PRODUCT_FILE_PATH);
        System.out.println("-----Add new export product-----");
        int id;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        String productCode = inputCode();
        String productName = inputName();
        double price = Double.parseDouble(inputPrice());
        int numberOfProduct = Integer.parseInt(inputNumberOfProduct());
        String manufacturer = inputManufacturer();
        double exportPrice = Double.parseDouble(inputExportPrice());
        String importCountry = inputCountryOfImport();
        ExportProduct exportProduct = new ExportProduct(id, productCode, productName, price, numberOfProduct,
                manufacturer, exportPrice, importCountry);
        productList.add(exportProduct);
        ReadAndWrite.writeListToCSVFile(productList, PRODUCT_FILE_PATH, false);


    }

    private String inputCode() {
        System.out.print("Enter code: ");
        return Regex.regexStr(sc.nextLine(), CODE_REGEX, "Product code must be in the format SPXXXXX where X is a natural number");
    }

    private String inputName() {
        System.out.print("Enter name: ");
        return Regex.regexStr(sc.nextLine(), STRING_REGEX, "Name cannot have any extra spaces or no characters");
    }

    private String inputPrice() {
        System.out.print("Enter price: ");
        return Regex.regexStr(sc.nextLine(), POSITIVE_NUMBER_REGEX, "Price must be a positive number.");
    }

    private String inputNumberOfProduct() {
        System.out.print("Enter number of product: ");
        return Regex.regexStr(sc.nextLine(), POSITIVE_NUMBER_REGEX, "Number of product must be a positive number.");
    }

    private String inputManufacturer() {
        System.out.print("Enter manufacturer: ");
        return Regex.regexStr(sc.nextLine(), STRING_REGEX, "Manufacturer cannot have any extra spaces or no characters");
    }

    private String inputExportPrice() {
        System.out.println("Enter export price");
        return Regex.regexStr(sc.nextLine(), POSITIVE_NUMBER_REGEX, "Price must be a positive number.");
    }

    private String inputCountryOfImport() {
        System.out.print("Enter country of import: ");
        return Regex.regexStr(sc.nextLine(), STRING_REGEX, "Country of import cannot have any extra spaces or no characters");
    }
}
