package Furama.models;

public class RentalType {
    private String rentalType;

    public RentalType() {
    }

    public RentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "RentalType{" +
                "rentalType='" + rentalType + '\'' +
                '}';
    }
}
