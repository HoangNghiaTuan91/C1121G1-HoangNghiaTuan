package Furama.models;

public class House extends Facility{
    private String houseStandard;//tiêu chuẩn phòng
    private String floorNumber;//tầng số

    public House() {
    }

    public House(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, String rentalType, String houseStandard, String floorNumber) {
        super(idOfService, nameOfService, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.houseStandard = houseStandard;
        this.floorNumber = floorNumber;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandard='" + houseStandard + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                '}';
    }
}
