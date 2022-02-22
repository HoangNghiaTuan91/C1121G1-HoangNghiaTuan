package testfinal.models;

public class ExportProduct extends Product{
    private double exportPrice;
    private String importCountry;

    public ExportProduct() {
    }

    public ExportProduct(int id, String productCode, String productName, double productPrice,
                         int numberOfProduct, String manufacturer, double exportPrice, String importCountry) {
        super(id, productCode, productName, productPrice, numberOfProduct, manufacturer);
        this.exportPrice = exportPrice;
        this.importCountry = importCountry;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getImportCountry() {
        return importCountry;
    }

    public void setImportCountry(String importCountry) {
        this.importCountry = importCountry;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "exportPrice=" + exportPrice +
                ", importCountry='" + importCountry + '\'' +
                '}';
    }
    public String getExportProductInfor(){
        return super.getProductInfor()+","+this.exportPrice+","+this.importCountry;
    }
}
