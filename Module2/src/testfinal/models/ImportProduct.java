package testfinal.models;

public class ImportProduct extends Product{
    private double importPrice;
    private String importProvince;
    private double importTax;

    public ImportProduct() {
    }

    public ImportProduct(int id, String productCode, String productName, double productPrice, int numberOfProduct,
                         String manufacturer, double importPrice, String importProvince, double importTax) {
        super(id, productCode, productName, productPrice, numberOfProduct, manufacturer);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                "importPrice=" + importPrice +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }
    public String getImportProductInfor(){
        return super.getProductInfor()+","+this.importPrice+","+this.importProvince+","+this.importTax;
    }
}
