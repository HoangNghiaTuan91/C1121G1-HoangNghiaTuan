package bai_tap_lam_them_quan_ly_xe.models;

public class Manufacturer {
    private String idOfManufacturer;
    private String manufacturer;
    private String countryOfManufacturer;

    public Manufacturer() {
    }

    public Manufacturer(String idOfManufacturer, String manufacturer, String countryOfManufacturer) {
        this.idOfManufacturer = idOfManufacturer;
        this.manufacturer = manufacturer;
        this.countryOfManufacturer = countryOfManufacturer;
    }

    public String getIdOfManufacturer() {
        return idOfManufacturer;
    }

    public void setIdOfManufacturer(String idOfManufacturer) {
        this.idOfManufacturer = idOfManufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    public void setCountryOfManufacturer(String countryOfManufacturer) {
        this.countryOfManufacturer = countryOfManufacturer;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "idOfManufacturer='" + idOfManufacturer + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", countryOfManufacturer='" + countryOfManufacturer + '\'' +
                '}';
    }
}
