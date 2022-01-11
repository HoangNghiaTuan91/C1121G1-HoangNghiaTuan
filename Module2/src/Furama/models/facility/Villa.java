package Furama.models.facility;

public class Villa extends Facility{
    private String villaStandard;//tiêu chuẩn phòng
    private String poolArea;//diện tích hồ bơi
    private String floorNumber;//tầng số

    public Villa() {
    }

    public Villa(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalType, String villaStandard, String poolArea, String floorNumber) {
        super(idOfService, nameOfService, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.villaStandard = villaStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + villaStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                '}';
    }
}
