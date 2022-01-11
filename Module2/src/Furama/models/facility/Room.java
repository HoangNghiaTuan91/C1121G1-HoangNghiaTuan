package Furama.models.facility;

public class Room extends Facility{
private FreeIncludingService freeIncludingService;//dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalType, FreeIncludingService freeIncludingService) {
        super(idOfService, nameOfService, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.freeIncludingService = freeIncludingService;
    }

    public FreeIncludingService getFreeIncludingService() {
        return freeIncludingService;
    }

    public void setFreeIncludingService(FreeIncludingService freeIncludingService) {
        this.freeIncludingService = freeIncludingService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeIncludingService=" + freeIncludingService +
                '}';
    }
}
