package Furama.models;

public class FreeIncludingService {
    private String nameOfFreeIncludingService;//tên dịch vụ miễn phí

    public FreeIncludingService() {
    }

    public FreeIncludingService(String nameOfFreeIncludingService) {
        this.nameOfFreeIncludingService = nameOfFreeIncludingService;
    }

    public String getNameOfFreeIncludingService() {
        return nameOfFreeIncludingService;
    }

    public void setNameOfFreeIncludingService(String nameOfFreeIncludingService) {
        this.nameOfFreeIncludingService = nameOfFreeIncludingService;
    }

    @Override
    public String toString() {
        return "FreeIncludingService{" +
                "freeIncludingService=" + nameOfFreeIncludingService +
                '}';
    }
}
