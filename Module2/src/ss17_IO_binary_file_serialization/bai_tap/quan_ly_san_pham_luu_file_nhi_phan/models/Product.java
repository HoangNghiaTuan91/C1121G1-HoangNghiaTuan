package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int idOfProduct;
    private String nameOfProduct;
    private double priceOfProduct;

    public Product() {
    }

    public Product(int idOfProduct, String nameOfProduct, double priceOfProduct) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idOfProduct=" + idOfProduct +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                '}';
    }
}
