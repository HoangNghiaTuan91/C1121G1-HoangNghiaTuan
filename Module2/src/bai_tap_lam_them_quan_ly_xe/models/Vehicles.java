package bai_tap_lam_them_quan_ly_xe.models;

public abstract class Vehicles {
    private String licensePlate;
    private String manufacturer;
    private int manufactureYear;
    private String owner;

    public Vehicles() {
    }

    public Vehicles(String licensePlate, String manufacturer, int manufactureYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "licensePlate=" + licensePlate +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
