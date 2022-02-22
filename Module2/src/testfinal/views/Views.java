package testfinal.views;

import testfinal.controller.ProductManagementControllers;

public class Views {
    public static void main(String[] args) {
        ProductManagementControllers productManagementControllers = new ProductManagementControllers();
        productManagementControllers.displayMainMenu();
    }
}
