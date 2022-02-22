package testfinal.models;

public abstract class Product {
    private int Id;
    private String productCode;
    private String productName;
    private double productPrice;
    private int numberOfProduct;
    private String manufacturer;

    public Product() {
    }

    public Product(int id, String productCode, String productName, double productPrice,
                   int numberOfProduct, String manufacturer) {
        Id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.numberOfProduct = numberOfProduct;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", numberOfProduct=" + numberOfProduct +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
    public String getProductInfor(){
        return this.Id+","+this.productCode+","+this.productName+","+this.productPrice
                +","+this.numberOfProduct+","+this.manufacturer;
    }
}
