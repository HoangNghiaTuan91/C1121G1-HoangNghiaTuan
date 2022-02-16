package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloor;

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String idNameOfService, String nameOfService, double area, int roomRate, int maximumPeople, String typeOfRent, String roomStandard, int numberOfFloor) {
        super(idNameOfService, nameOfService, area, roomRate, maximumPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}' + super.toString();
    }
    public String getHouseString() {
        return super.getFacilityString() + "," + getRoomStandard() + "," + getNumberOfFloor();
    }
}
