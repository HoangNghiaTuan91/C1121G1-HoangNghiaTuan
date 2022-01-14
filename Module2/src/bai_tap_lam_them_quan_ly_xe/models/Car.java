package bai_tap_lam_them_quan_ly_xe.models;

public class Car extends Vehicles{
    private int numberOfSeat;
    private String type;

    public Car() {
    }

    public Car(String licensePlate, String manufacturer, int manufactureYear, String owner, int numberOfSeat, String type) {
        super(licensePlate, manufacturer, manufactureYear, owner);
        this.numberOfSeat = numberOfSeat;
        this.type = type;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeat=" + numberOfSeat +
                ", type='" + type + '\'' +
                '}';
    }
}
