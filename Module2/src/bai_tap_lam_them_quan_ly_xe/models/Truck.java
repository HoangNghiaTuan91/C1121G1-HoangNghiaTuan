package bai_tap_lam_them_quan_ly_xe.models;

public class Truck extends Vehicles{
    private int tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturer, int manufactureYear, String owner, int tonnage) {
        super(licensePlate, manufacturer, manufactureYear, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString()+
                " tonnage=" + tonnage;
    }
}
